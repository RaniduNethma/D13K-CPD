package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponseDTO;

public interface RoomService {
    public void createRoom(RequestRoomDTO dto);
    public void updateRoom(RequestRoomDTO dto, String roomId);
    public void deleteRoom(String roomId);
    public ResponseRoomDTO findRoomById(String roomId);
    public RoomPaginateResponseDTO findAllRooms(String branchId);
}
