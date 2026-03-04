package com.cpd.hotel_system.hotel_management_service_api.repository;

import com.cpd.hotel_system.hotel_management_service_api.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomEntity, String> {
}
