package com.cpd.hotel_system.hotel_management_service_api.service.util;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardResponseDTO {
    private int statusCode;
    private String message;
    private Object data;
}
