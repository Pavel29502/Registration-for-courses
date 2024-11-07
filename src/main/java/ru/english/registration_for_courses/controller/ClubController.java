package ru.english.registration_for_courses.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.service.ClubFacade;
import ru.english.registration_for_courses.service.implementation.ClubService;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/club")
@Slf4j

public class ClubController {
    private final ClubFacade clubFacade;

    @PostMapping("/save")
    public ClubDTO createClub(@RequestBody ClubDTO clubDTO) {
        log.info("Сохраняем клуб: {}", clubDTO);
        return clubFacade.createClub(clubDTO);
    }

    @GetMapping
    public List<ClubDTO> getAllClubs() {
        return clubFacade.findAll();
    }


    @GetMapping("/{id}")
    public ClubDTO getById(@RequestParam UUID id) {
        return clubFacade.findById(id);
    }
}










