package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void createAddress(RequestAddressDTO dto) {

    }

    @Override
    public void updateAddress(RequestAddressDTO dto, String addressId) {

    }

    @Override
    public void deleteAddress(String addressId) {

    }

    @Override
    public ResponseAddressDTO findAddressById(String addressId) {
        return null;
    }

    @Override
    public ResponseAddressDTO findAddressByBranchId(String branchId) {
        return null;
    }
}
