package ru.english.registration_for_courses.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.mapper.ClubMapper;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClubFacade {

    private static final Logger log = LoggerFactory.getLogger(ClubFacade.class);
    private final BaseCrudService<Club> baseCrudService;
    private final ClubMapper mapper;

    public ClubDTO createClub(ClubDTO clubDTO) {
        log.info("Creating club: {}", mapper.asClubDTO(clubDTO));
        return mapper.asClubsDTO(baseCrudService.save(mapper.asClubs(clubDTO)));
    }

    public List<ClubDTO> findAll() {
        return mapper.asClubDTO(baseCrudService.findAll());
    }

    public ClubDTO findById(UUID id) {
        return mapper.asClubDTO(baseCrudService.findById(id))
                .orElseThrow(() -> new EntityNotFoundException("Club not found"));
    }
}

