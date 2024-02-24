package com.smd.SocialMediaDashboard.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EngagementMetric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "social_media_account_id")
    private SocialMediaAccount socialMediaAccount;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private ScheduledPost post;

    private int likes;
    private int shares;
    private int comments;
    private int impressions;
    private double engagementRate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
