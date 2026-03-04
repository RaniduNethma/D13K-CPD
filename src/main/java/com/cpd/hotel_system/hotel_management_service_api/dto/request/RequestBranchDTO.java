package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBranchDTO {
    private String branchName;
    private BranchType branchType;
    private int roomCount;
    private String hotelId;
}
