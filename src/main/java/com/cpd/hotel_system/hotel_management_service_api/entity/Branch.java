package com.cpd.hotel_system.hotel_management_service_api.entity;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @Column(name = "branch_id", nullable = false, length = 80)
    private String branchId;

    @Column(name = "branch_name", nullable = false, length = 250)
    private String branchName;

    @Column(name = "room_count")
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type", nullable = false, length = 15)
    private BranchType branchType;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}
