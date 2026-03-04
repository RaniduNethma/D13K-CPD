package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void createHotel(RequestHotelDTO dto) {

    }

    @Override
    public void updateHotel(RequestHotelDTO dto, String hotelId) {

    }

    @Override
    public void deleteHotel(String hotelId) {

    }

    @Override
    public ResponseHotelDTO findHotelById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDTO findAllHotels(int page, int size, String searchText) {
        return null;
    }
}
