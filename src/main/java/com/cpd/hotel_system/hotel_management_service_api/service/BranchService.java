package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDTO;

public interface BranchService {
    public void createBranch(RequestBranchDTO dto);
    public void updateBranch(RequestBranchDTO dto, String branchId);
    public void deleteBranch(String branchId);
    public ResponseBranchDTO findBranchById(String branchId);
    public BranchPaginateResponseDTO findAllBranches(int page, int size, String searchText);
    public BranchPaginateResponseDTO findAllBranchesByHotelId(int page, int size, String hotelId, String searchText);
}
