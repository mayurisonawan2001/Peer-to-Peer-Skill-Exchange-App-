package com.example.skillexchange.repository;

import com.example.skillexchange.model.SkillSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillSessionRepository extends JpaRepository<SkillSession, Long> {
    // Additional custom queries can be added here
}
