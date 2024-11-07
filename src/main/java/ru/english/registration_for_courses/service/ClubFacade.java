package ru.english.registration_for_courses.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.mapper.ClubMap;
import ru.english.registration_for_courses.mapper.ClubMapper;
import ru.english.registration_for_courses.service.implementation.TagService;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
@Slf4j
public class ClubFacade {

    private final BaseCrudService<Club> baseCrudService;
    private final ClubMapper mapper;
    private final TagService tagService;

    public ClubDTO createClub(ClubDTO clubDTO) {
//        log.info("Сохраняем клуб: {}", clubDTO);
        ClubMap.mapClubDtoToClub(clubDTO);
        Club club = new Club();
        club.

        return mapper.asClubDTO(baseCrudService.save(mapper.asClub(clubDTO, tagService)));
    }

    public List<ClubDTO> findAll() {
        return mapper.asClubDTO(baseCrudService.findAll());
    }

    public ClubDTO findById(UUID id) {
        return mapper.asClubDTO(baseCrudService.findById(id));
    }
}

