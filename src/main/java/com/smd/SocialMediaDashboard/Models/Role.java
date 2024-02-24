package com.smd.SocialMediaDashboard.Models;

import jakarta.persistence.*;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RoleType name;
}

enum RoleType{
    REGULAR_USER,
    ADMIN_USER,
    CONTENT_CREATOR,
    ANALYST,
    TEAM_MEMBER,
    VIEWER
}