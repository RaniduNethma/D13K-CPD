package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHotelDTO {
    private String hotelId;
    private String name;
    private String description;
    private boolean activeStatus;
    private int starRating;
    private BigDecimal startingFrom;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<ResponseBranchDTO> branches;
}
