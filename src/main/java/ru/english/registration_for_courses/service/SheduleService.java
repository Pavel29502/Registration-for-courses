package ru.english.registration_for_courses.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.SheduleDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.entity.Shedule;
import ru.english.registration_for_courses.repository.ClubRepository;
import ru.english.registration_for_courses.repository.SheduleRepository;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SheduleService {

//    private final SheduleRepository sheduleRepository;
//    private final ClubRepository clubRepository; // Предполагается, что существует репозиторий Club
//
//    @Autowired
//    public SheduleService(SheduleRepository sheduleRepository, ClubRepository clubRepository) {
//        this.sheduleRepository = sheduleRepository;
//        this.clubRepository = clubRepository;
//    }
//
//    public List<SheduleDTO> getAllSchedules() {
//        return sheduleRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
//    }
//
//    public SheduleDTO createSchedule(SheduleDTO sheduleDTO) {
//        Club club = clubRepository.findById(sheduleDTO.getClubId())
//                .orElseThrow(() -> new EntityNotFoundException("Club not found"));
//        Shedule shedule = new Shedule();
//        shedule.setClub(club);
//        shedule.setDayOfWeek(sheduleDTO.getDayOfWeek());
//        shedule.setStartTime(sheduleDTO.getStartTime());
//        shedule.setEndTime(sheduleDTO.getEndTime());
////        shedule.setSessionType(sheduleDTO.getSessionType());
//
//
//        Shedule savedShedule = sheduleRepository.save(shedule);
//        return mapToDTO(savedShedule);
//    }
//
//    public void deleteSchedule(UUID id) {
//        if (!sheduleRepository.existsById(id)) {
//            throw new EntityNotFoundException("Schedule not found");
//        }
//        sheduleRepository.deleteById(id);
//    }
//
//    private SheduleDTO mapToDTO(Shedule shedule) {
//        SheduleDTO dto = new SheduleDTO();
//        dto.setId(shedule.getId());
//        dto.setClubId(shedule.getClub().getId());
//        dto.setDayOfWeek(shedule.getDayOfWeek());
//        dto.setStartTime(shedule.getStartTime());
//        dto.setEndTime(shedule.getEndTime());
////        dto.setSessionType(shedule.getSessionType());
//        return dto;
//    }
//}

    private final SheduleRepository sheduleRepository;
    private final ClubRepository clubRepository; // Предполагается, что существует репозиторий Club

    @Autowired
    public SheduleService(SheduleRepository sheduleRepository, ClubRepository clubRepository) {
        this.sheduleRepository = sheduleRepository;
        this.clubRepository = clubRepository;
    }

    // Получение всех расписаний
    public List<SheduleDTO> getAllSchedules() {
        return sheduleRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    // Создание нового расписания
    public SheduleDTO createSchedule(SheduleDTO sheduleDTO) {
        // Находим клуб по ID
        Club club = clubRepository.findById(sheduleDTO.getClubId())
                .orElseThrow(() -> new EntityNotFoundException("Club not found"));

        // Создаем новое расписание
        Shedule shedule = new Shedule();
        shedule.setClub(club);
        shedule.setDayOfWeek(sheduleDTO.getDayOfWeek());
        shedule.setStartTime(sheduleDTO.getStartTime());
        shedule.setEndTime(sheduleDTO.getEndTime());
        shedule.setSessionType(sheduleDTO.getSessionType());
        shedule.setSessionDate(sheduleDTO.getSessionDate());

        // Сохраняем расписание в базе данных
        Shedule savedShedule = sheduleRepository.save(shedule);
        return mapToDTO(savedShedule);
    }

    // Удаление расписания по ID
    public void deleteSchedule(UUID id) {
        if (!sheduleRepository.existsById(id)) {
            throw new EntityNotFoundException("Schedule not found");
        }
        sheduleRepository.deleteById(id);
    }

    // Преобразование сущности Shedule в SheduleDTO
    private SheduleDTO mapToDTO(Shedule shedule) {
        SheduleDTO dto = new SheduleDTO();
        dto.setId(shedule.getId());
        dto.setClubId(shedule.getClub().getId());
        dto.setDayOfWeek(shedule.getDayOfWeek());
        dto.setStartTime(shedule.getStartTime());
        dto.setEndTime(shedule.getEndTime());
        dto.setSessionType(shedule.getSessionType()); // Преобразуем Enum в DTO
        return dto;
    }
}