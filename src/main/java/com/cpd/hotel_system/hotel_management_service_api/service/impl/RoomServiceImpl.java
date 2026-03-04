package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponseDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void createRoom(RequestRoomDTO dto) {

    }

    @Override
    public void updateRoom(RequestRoomDTO dto, String roomId) {

    }

    @Override
    public void deleteRoom(String roomId) {

    }

    @Override
    public ResponseRoomDTO findRoomById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginateResponseDTO findAllRooms(String branchId) {
        return null;
    }
}
