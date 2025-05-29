package com.example.skillexchange.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "skill_sessions")
public class SkillSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String offeredSkill;

    private String requestedSkill;

    private LocalDateTime sessionTime;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private User provider;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private boolean confirmed;

    // Getters and Setters
}
