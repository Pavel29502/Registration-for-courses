package ru.english.registration_for_courses.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.english.registration_for_courses.dto.SheduleDTO;
import ru.english.registration_for_courses.service.SheduleService;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/shedule")
@Slf4j
public class SheduleController {

    private final SheduleService sheduleService;

    @Autowired
    public SheduleController(SheduleService sheduleService) {
        this.sheduleService = sheduleService;
    }

    @GetMapping
    public ResponseEntity<List<SheduleDTO>> getAllSchedules() {
        return ResponseEntity.ok(sheduleService.getAllSchedules());
    }

    @PostMapping("/save")
    public ResponseEntity<SheduleDTO> createSchedule(@RequestBody SheduleDTO sheduleDTO) {
        SheduleDTO createdSchedule = sheduleService.createSchedule(sheduleDTO);
        return new ResponseEntity<>(createdSchedule, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable UUID id) {
        sheduleService.deleteSchedule(id);
        return ResponseEntity.noContent().build();
    }
}

