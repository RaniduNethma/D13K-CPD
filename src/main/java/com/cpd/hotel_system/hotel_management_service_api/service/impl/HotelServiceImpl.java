package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDTO;
import com.cpd.hotel_system.hotel_management_service_api.entity.BranchEntity;
import com.cpd.hotel_system.hotel_management_service_api.entity.HotelEntity;
import com.cpd.hotel_system.hotel_management_service_api.exceptions.EntryNotFoundException;
import com.cpd.hotel_system.hotel_management_service_api.repository.HotelRepository;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.service.util.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    private final ByteCodeHandler byteCodeHandler;

    @Override
    public void createHotel(RequestHotelDTO dto) throws SQLException {
        hotelRepository.save(toHotel(dto));
    }

    @Override
    public void updateHotel(RequestHotelDTO dto, String hotelId) throws SQLException {
        HotelEntity selectedHotel = hotelRepository.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel Not Found!"));
        selectedHotel.setName(dto.getHotelName());
        selectedHotel.setUpdatedAt(LocalDateTime.now());
        selectedHotel.setDescription(byteCodeHandler.stringToBlob(dto.getDescription()));
        selectedHotel.setStartingFrom(dto.getStartingFrom());
        selectedHotel.setStarRating(dto.getStarRating());
        hotelRepository.save(selectedHotel);
    }

    @Override
    public void deleteHotel(String hotelId) {
        hotelRepository.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel Not Found!"));
        hotelRepository.deleteById(hotelId);
    }

    @Override
    public ResponseHotelDTO findHotelById(String hotelId) throws SQLException {
        HotelEntity selectedHotel = hotelRepository.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel Not Found!"));
        return toResponseHotelDTO(selectedHotel);
    }

    @Override
    public HotelPaginateResponseDTO findAllHotels(int page, int size, String searchText) {
        return HotelPaginateResponseDTO.builder()
                .hotelDataCount(hotelRepository.countAllHotels(searchText))
                .hotelDataList(hotelRepository.searchAllHotels(searchText, PageRequest.of(page, size))
                        .stream().map(e-> {
                            try {
                                return toResponseHotelDTO(e);
                            } catch (SQLException ex) {
                                throw new RuntimeException(ex);
                            }
                        }).collect(Collectors.toList()))
                .build();
    }

    // Map-Structures, Model-Mappers

    private HotelEntity toHotel(RequestHotelDTO dto) throws SQLException {
        return dto==null?null:
                HotelEntity.builder()
                        .name(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(byteCodeHandler.stringToBlob(dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }

    private ResponseHotelDTO toResponseHotelDTO(HotelEntity hotel) throws SQLException {
        return hotel == null ? null :
                ResponseHotelDTO.builder()
                        .hotelId(hotel.getHotelId())
                        .name(hotel.getName())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingFrom())
                        .updatedAt(LocalDateTime.now())
                        .createdAt(LocalDateTime.now())
                        .description(byteCodeHandler.blobToString(hotel.getDescription()))
                        .branches(
                                hotel.getBranchEntities().stream().map(e->{
                                try {
                                    return responseBranchDTO(e);
                                } catch (SQLException ex){
                                    throw new RuntimeException(ex);
                                }
                                }).toList())
                        .build();
    }

    private ResponseBranchDTO responseBranchDTO(BranchEntity branch) throws SQLException{
        return branch == null ? null :
                ResponseBranchDTO.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .roomCount(branch.getRoomCount())
                        .branchType(branch.getBranchType())
                        .build();
    }
}
