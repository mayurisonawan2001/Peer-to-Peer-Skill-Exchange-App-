package com.example.skillexchange.controller;

import com.example.skillexchange.model.SkillSession;
import com.example.skillexchange.repository.SkillSessionRepository;
import com.example.skillexchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skillsessions")
public class SkillSessionController {

    @Autowired
    private SkillSessionRepository skillSessionRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/offer")
    public ResponseEntity<?> offerSkillSession(@RequestBody SkillSession session) {
        // Validation and user existence check should be here in real apps
        skillSessionRepository.save(session);
        return ResponseEntity.ok("Skill session offered successfully");
    }

    @GetMapping
    public List<SkillSession> getAllSessions() {
        return skillSessionRepository.findAll();
    }
}
