package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.FacilityPaginateResponseDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void createFacility(RequestFacilityDTO dto) {

    }

    @Override
    public void updateFacility(RequestFacilityDTO dto, String facilityId) {

    }

    @Override
    public void deleteFacility(String facilityId) {

    }

    @Override
    public ResponseFacilityDTO findFacilityById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDTO findAllFacilities(int page, int size, String roomId) {
        return null;
    }
}
