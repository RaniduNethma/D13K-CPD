package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomDTO {
    private String roomId;
    private String roomNumber;
    private String roomType;
    private int bedCount;
    private BigDecimal price;
    private boolean isAvailable;
    private String branchId;
    private List<ResponseFacilityDTO> facilities;
    private List<ResponseImageDTO> images;
}
