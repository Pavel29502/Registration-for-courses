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
import ru.english.registration_for_courses.service.implementation.ClubService;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/club")
@Slf4j
public class ClubController {

        @Autowired
        private ClubService clubService;

        @PostMapping
        public ResponseEntity<Club> saveClub(@RequestBody ClubDto clubDto) {
            Club club = clubDto.toEntity();

            // Обработка labels
            Map<String, Object> labels = new HashMap<>();
            if (clubDto.getLabels() != null) {
                labels.put("tags", clubDto.getLabels());
            }
            club.setLabel(labels);

            // Сохранение клуба
            Club savedClub = clubService.save(club);

            return ResponseEntity.ok(savedClub);
        }
    }








//private final ClubService clubService;
//
//    @PostMapping
//    public ResponseEntity<ClubDTO> createClub(@RequestBody ClubDTO clubDTO) {
//        log.info("Creating club: {}", clubDTO);
//        return ResponseEntity.ok(clubService.createClub(clubDTO));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ClubDTO>> getAllClubs(
//            @PageableDefault(sort = {"name"}, direction = Sort.Direction.ASC) Pageable pageable) {
//        log.info("Fetching clubs with pagination: {} pages, size: {}, sort: {}",
//                pageable.getPageNumber(), pageable.getPageSize(), pageable.getSort());
//        return ResponseEntity.ok(clubService.findAll(pageable));
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ClubDTO> getClubById(@PathVariable Long id) {
//        log.info("Fetching club by ID: {}", id);
//        return ResponseEntity.ok(clubService.findById(id));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ClubDTO> updateClub(@PathVariable Long id, @RequestBody ClubDTO clubDTO) {
//        log.info("Updating club: {} with ID: {}", clubDTO, id);
//        return ResponseEntity.ok(clubService.updateClub(id, clubDTO));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteClub(@PathVariable Long id) {
//        log.info("Deleting club with ID: {}", id);
//        clubService.deleteClub(id);
//        return ResponseEntity.noContent().build();
//    }
}



