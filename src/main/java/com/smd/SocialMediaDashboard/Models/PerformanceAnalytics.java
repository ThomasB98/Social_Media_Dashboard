package com.smd.SocialMediaDashboard.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceAnalytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "social_media_account_id")
    private SocialMediaAccount socialMediaAccount;

    private String metricType;
    private double value;
    private LocalDate date;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
