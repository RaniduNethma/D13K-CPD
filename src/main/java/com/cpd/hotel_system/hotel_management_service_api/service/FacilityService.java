package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.FacilityPaginateResponseDTO;

public interface FacilityService {
    public void createFacility(RequestFacilityDTO dto);
    public void updateFacility(RequestFacilityDTO dto, String facilityId);
    public void deleteFacility(String facilityId);
    public ResponseFacilityDTO findFacilityById(String facilityId);
    public FacilityPaginateResponseDTO findAllFacilities(int page, int size, String roomId);
}
