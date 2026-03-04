package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseBranchDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void createBranch(RequestBranchDTO dto) {

    }

    @Override
    public void updateBranch(RequestBranchDTO dto, String branchId) {

    }

    @Override
    public void deleteBranch(String branchId) {

    }

    @Override
    public ResponseBranchDTO findBranchById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDTO findAllBranches(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDTO findAllBranchesByHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
