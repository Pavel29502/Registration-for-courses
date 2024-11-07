package ru.english.registration_for_courses.service.implementation;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.repository.ClubRepository;
import ru.english.registration_for_courses.service.BaseCrudService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClubService implements BaseCrudService<Club> {

        private final ClubRepository clubRepository;

        public Club save(Club club) {
            return clubRepository.save(club);
        }

//        public List<Club> findAll() {
//            return clubRepository.findAll();
//        }

    public List<Club> findAll() {
        List<Club> clubs = clubRepository.findAll();
        log.info("Найденные клубы: {}", clubs);
        return clubs;
    }

        public Club findById(UUID id) {
            return clubRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Club not found"));
        }
    }


