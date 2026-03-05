package com.cpd.hotel_system.hotel_management_service_api.repository;

import com.cpd.hotel_system.hotel_management_service_api.entity.HotelEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelRepository extends JpaRepository<HotelEntity, String> {

    @Query(value = "SELECT * FROM hotel WHERE name LIKE %?1% AND active_status=true", nativeQuery=true)
    public Page<HotelEntity> searchAllHotels(String searchText, Pageable pageable);

    @Query(value = "SELECT COUNT(*) FROM hotel WHERE name LIKE %?1% AND active_status=true", nativeQuery=true)
    public long countAllHotels(String searchText);
}
