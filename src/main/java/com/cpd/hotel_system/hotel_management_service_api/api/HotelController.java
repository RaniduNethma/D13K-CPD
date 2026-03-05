package com.cpd.hotel_system.hotel_management_service_api.api;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.service.util.StandardResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {
    private final HotelService hotelService;

    @PostMapping("/user/create")
    public ResponseEntity<StandardResponseDTO> create(
            @RequestBody RequestHotelDTO dto) throws SQLException {
        hotelService.createHotel(dto);
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        201, "Hotel Saved Successfully", null
                ), HttpStatus.CREATED
        );
    }

    @PutMapping("/admin/update/{hotelId}")
    public ResponseEntity<StandardResponseDTO> update(
            @PathVariable() String hotelId,
            @RequestBody RequestHotelDTO dto) throws SQLException {
        hotelService.updateHotel(dto, hotelId);
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        201, "Hotel Updated Successfully", null
                ), HttpStatus.CREATED
        );
    }

    @DeleteMapping("/host/delete/{hotelId}")
    public ResponseEntity<StandardResponseDTO> delete(
            @PathVariable() String hotelId) throws SQLException {
        hotelService.deleteHotel(hotelId);
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        204, "Hotel Deleted Successfully", null
                ), HttpStatus.NO_CONTENT
        );
    }

    @GetMapping("/visitor/find-by-id/{hotelId}")
    public ResponseEntity<StandardResponseDTO> findById(
            @PathVariable() String hotelId) throws SQLException{
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        200, "hotel Found", hotelService.findHotelById(hotelId)
                ), HttpStatus.OK
        );
    }

    @GetMapping("/visitor/find-all")
    public ResponseEntity<StandardResponseDTO> findAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
            ) throws SQLException{
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        200, "Hotel List", hotelService.findAllHotels(page, size, searchText)
                ), HttpStatus.OK
        );
    }
}
