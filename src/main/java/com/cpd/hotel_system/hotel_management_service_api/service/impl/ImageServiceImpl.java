package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestImageDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseImageDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.ImagePaginateResponseDTO;
import com.cpd.hotel_system.hotel_management_service_api.service.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public void createImage(RequestImageDTO dto) {

    }

    @Override
    public void updateImage(RequestImageDTO dto, String imageId) {

    }

    @Override
    public void deleteImag(String imageId) {

    }

    @Override
    public ResponseImageDTO findImageById(String imageId) {
        return null;
    }

    @Override
    public ImagePaginateResponseDTO findAllImages(int page, int size, String roomId) {
        return null;
    }
}
