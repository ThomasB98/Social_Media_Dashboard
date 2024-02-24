package com.smd.SocialMediaDashboard.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name="users",
        uniqueConstraints = {
                @UniqueConstraint(
                        name="email",
                        columnNames = "email"
                ),
                @UniqueConstraint(
                        name="username",
                        columnNames = "username"
                )
        }
)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;

    private String passwordHash;

    @ManyToOne
    @JoinColumn(name="role_id")
    private  Role role;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user")
    private List<ContentCreationPreferences> contentCreationPreferences;

    @OneToMany(mappedBy = "user")
    private List<AnalyticsPreferences> analyticsPreferences;

    @OneToMany(mappedBy = "user")
    private List<TeamCollaboration> teamCollaborations;

    @OneToMany(mappedBy = "user")
    private List<UserAuthentication> userAuthentications;

    @OneToMany(mappedBy = "user")
    private List<SocialMediaAccount> socialMediaAccounts;

    @OneToMany(mappedBy = "user")
    private List<ScheduledPost> scheduledPosts;

    @OneToMany(mappedBy = "user")
    private List<EngagementMetric> engagementMetrics;

    @OneToMany(mappedBy = "user")
    private List<PerformanceAnalytics> performanceAnalytics;

}

