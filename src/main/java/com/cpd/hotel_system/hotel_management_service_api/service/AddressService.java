package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDTO;

public interface AddressService {
    public void createAddress(RequestAddressDTO dto);
    public void updateAddress(RequestAddressDTO dto, String addressId);
    public void deleteAddress(String addressId);
    public ResponseAddressDTO findAddressById(String addressId);
    public ResponseAddressDTO findAddressByBranchId(String branchId);
}
