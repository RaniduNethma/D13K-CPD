package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDTO;

public interface HotelService {
    public void createHotel(RequestHotelDTO dto);
    public void updateHotel(RequestHotelDTO dto, String hotelId);
    public void deleteHotel(String hotelId);
    public ResponseHotelDTO findHotelById(String hotelId);
    public HotelPaginateResponseDTO findAllHotels(int page, int size, String searchText);
}
