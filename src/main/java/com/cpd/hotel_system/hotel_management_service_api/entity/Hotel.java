package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @Column(name = "hotel_id", nullable = false, length = 80)
    private String hotelId;

    @Column(name = "name", nullable = false, length = 250)
    private String name;

    @Column(name = "star_rating", nullable = false)
    private int starRating;

    @Column(nullable = false)
    @Lob
    private Blob description;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "active_status")
    private boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingFrom;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Branch> branches;
}
