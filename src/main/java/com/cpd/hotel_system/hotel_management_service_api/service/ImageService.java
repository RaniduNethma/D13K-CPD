package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestImageDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseImageDTO;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.ImagePaginateResponseDTO;

public interface ImageService {
    public void createImage(RequestImageDTO dto);
    public void updateImage(RequestImageDTO dto, String imageId);
    public void deleteImag(String imageId);
    public ResponseImageDTO findImageById(String imageId);
    public ImagePaginateResponseDTO findAllImages(int page, int size, String roomId);
}
