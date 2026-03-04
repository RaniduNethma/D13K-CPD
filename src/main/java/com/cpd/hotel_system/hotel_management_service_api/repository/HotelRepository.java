package com.cpd.hotel_system.hotel_management_service_api.repository;

import com.cpd.hotel_system.hotel_management_service_api.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, String> {
}
