package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDTO;

import java.sql.SQLException;

public interface HotelService {
    public void createHotel(RequestHotelDTO dto) throws SQLException;
    public void updateHotel(RequestHotelDTO dto, String hotelId) throws SQLException;
    public void deleteHotel(String hotelId);
    public ResponseHotelDTO findHotelById(String hotelId) throws SQLException;
    public HotelPaginateResponseDTO findAllHotels(int page, int size, String searchText);
}
