package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "room")
public class RoomEntity {

    @Id
    @Column(name = "room_id", nullable = false, length = 80)
    private String roomId;

    @Column(name = "room_number", nullable = false, length = 50)
    private String roomNumber;

    @Column(name = "type", length = 80)
    private String type;

    @Column(name = "bed_count")
    private int bedCount;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "is_available")
    private boolean isAvailable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private BranchEntity branchEntity;

    @OneToMany(mappedBy = "roomEntity", cascade = CascadeType.ALL)
    private List<FacilityEntity> facilities;

    @OneToMany(mappedBy = "roomEntity", cascade = CascadeType.ALL)
    private List<ImageEntity> imageEntities;
}
