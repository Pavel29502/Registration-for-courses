package ru.english.registration_for_courses.service.implementation;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.repository.ClubRepository;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClubService {

        private final ClubRepository clubRepository;

        public Club save(Club club) {
            return clubRepository.save(club);
        }

        public List<Club> findAll() {
            return clubRepository.findAll();
        }

        public Club findById(UUID id) {
            return clubRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Club not found"));
        }
    }
}

//    private final ClubRepository clubRepository;
//
//    public ClubDTO saveClub(ClubDTO clubDTO) {
//        log.info("Saving club: {}", clubDTO);
//        Club club = Club.builder()
//                .clubName(clubDTO.getClubName())
//                .type(clubDTO.getType())
//                .level(clubDTO.getLevel())
//                .label(clubDTO.getLabel())
//                .description(clubDTO.getDescription())
//                .length(clubDTO.getLength())
//                .frequency(clubDTO.getFrequency())
//                .build();
//        Club savedClub = clubRepository.save(club);
//        return ClubDTO.fromEntity(savedClub);
//    }
//
//    public ClubDTO createClub(ClubDTO clubDTO) {
//        log.info("Creating club: {}", clubDTO);
//        Club club = Club.builder()
//                .clubName(clubDTO.getClubName())
//                .type(clubDTO.getType())
//                .level(clubDTO.getLevel())
//                .label(clubDTO.getLabel())
//                .description(clubDTO.getDescription())
//                .length(clubDTO.getLength())
//                .frequency(clubDTO.getFrequency())
//                .build();
//        return ClubDTO.fromEntity(clubRepository.save(club));
//    }
//
//    public ClubDTO updateClub(UUID id, ClubDTO clubDTO) {
//        log.info("Updating club: {} with ID: {}", clubDTO, id);
//        Club existingClub = clubRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Club not found"));
//
//        existingClub.setClubName(clubDTO.getClubName());
//        existingClub.setType(clubDTO.getType());
//        existingClub.setLevel(clubDTO.getLevel());
//        existingClub.setLabel(clubDTO.getLabel());
//        existingClub.setDescription(clubDTO.getDescription());
//        existingClub.setLength(clubDTO.getLength());
//        existingClub.setFrequency(clubDTO.getFrequency());
//
//        return ClubDTO.fromEntity(clubRepository.save(existingClub));
//    }
//
//    public void deleteClub(UUID id) {
//        clubRepository.deleteById(id);
//    }
//}
//----------------------------------------------
//
//}private final ClubRepository clubRepository;
//
//public ClubDTO saveClub(ClubDTO clubDTO) {
//    log.info("Saving club: {}", clubDTO);
//    Club club = Club.builder()
//            .name(clubDTO.getName())
//            .type(clubDTO.getType())
//            .level(clubDTO.getLevel())
//            .label(clubDTO.getLabel())
//            .description(clubDTO.getDescription())
//            .length(clubDTO.getLength())
//            .frequency(clubDTO.getFrequency())
//            .build();
//    Club savedClub = clubRepository.save(club);
//    return ClubDTO.fromEntity(savedClub);
//}
//
//    @Override
//    public List<Club> findAll() {
//        return clubRepository.findAll();
//    }
//
//    @Override
//    public Club findById(UUID id) {
//        return clubRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Club not found"));
//    }
//
//    public ClubDTO createClub(ClubDTO clubDTO) {
//        // Реализация метода
//    }
//    public ClubDTO updateClub(UUID id, ClubDTO clubDTO) {
//        Club existingClub = clubRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Club not found"));
//
//        existingClub.setName(clubDTO.getName());
//        existingClub.setType(clubDTO.getType());
//        // Обновите другие поля...
//
//        return ClubDTO.fromEntity(clubRepository.save(existingClub));
//    }
//
//    public void deleteClub(Long id) {
//        clubRepository.deleteById(id);
//    }


//    @Override
//    public Club save(Club club) {
//        return clubRepository.save(club);
//    }


