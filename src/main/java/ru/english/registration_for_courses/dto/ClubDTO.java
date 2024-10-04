package ru.english.registration_for_courses.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubDTO {
    private UUID id;
    private String clubName;
    private String type;
    private Level level;
    private Map<String, Object> label;
    private String description;
    private String length;
    private String frequency;
}

//Остальное как мредлагает GPT Сделать!!!!!!!!!!!!!!!!!
// ClubMapper.java
//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
//public interface ClubMapper {
//    Club asClub(ClubDTO clubDto);
//    ClubDTO asClubDTO(Club club);
//    List<ClubDTO> asClubDTOList(List<Club> clubs);
//}
//
//// ClubMapperImpl.java
//@Component
//public class ClubMapperImpl implements ClubMapper {
//    // Реализация методов маппинга
//}
//
//// ClubRepository.java
//@Repository
//public interface ClubRepository extends JpaRepository<Club, UUID> {
//}
//
//// ClubService.java
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class ClubService {
//    private final ClubRepository clubRepository;
//
//    public Club save(Club club) {
//        return clubRepository.save(club);
//    }
//
//    public List<Club> findAll() {
//        return clubRepository.findAll();
//    }
//
//    public Club findById(UUID id) {
//        return clubRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Club not found"));
//    }
//}
//
//// ClubFacade.java
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class ClubFacade {
//    private final ClubService clubService;
//    private final ClubMapper mapper;
//
//    public ClubDTO createClub(@RequestBody ClubDTO clubDto) {
//        log.info("Сохраняем {}", clubDto);
//        Club club = mapper.asClub(clubDto);
//
//        // Обработка labels
//        Map<String, Object> labels = new HashMap<>();
//        if (clubDto.getLabel() != null && clubDto.getLabel().containsKey("tags")) {
//            labels.put("tags", clubDto.getLabel().get("tags"));
//        }
//        club.setLevel(Level.valueOf(clubDto.getLevel().name()));
//        club.setLabel(labels);
//
//        // Генерация UUID для нового клуба
//        club.setId(UUID.randomUUID());
//
//        // Сохранение клуба
//        Club savedClub = clubService.save(club);
//
//        return mapper.asClubDTO(savedClub);
//    }
//
//    public List<ClubDTO> getAllClubs() {
//        return mapper.asClubDTOList(clubService.findAll());
//    }
//
//    public ClubDTO getClubById(UUID id) {
//        return mapper.asClubDTO(clubService.findById(id));
//    }
//}
//
//// ClubController.java
//@RestController
//@RequestMapping("/api/clubs")
//@RequiredArgsConstructor
//public class ClubController {
//    private final ClubFacade clubFacade;
//
//    @PostMapping
//    public ResponseEntity<ClubDTO> createClub(@RequestBody ClubDTO clubDto) {
//        return ResponseEntity.ok(clubFacade.createClub(clubDto));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ClubDTO>> getAllClubs() {
//        return ResponseEntity.ok(clubFacade.getAllClubs());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ClubDTO> getClubById(@PathVariable UUID id) {
//        return ResponseEntity.ok(clubFacade.getClubById(id));
//    }
//}
//    Ключевые моменты:
//        Мы использовали паттерн Фасад (ClubFacade) для абстрагирования бизнес-логики и
//        упрощения взаимодействия между контроллером и сервисами.
//        Сервис (ClubService) отвечает за операции с репозиторием и содержит базовые CRUD-операции.
//        Репозиторий (ClubRepository) предоставляет доступ к базе данных через Spring Data JPA.
//        Маппер (ClubMapper) используется для преобразования между DTO и сущностями.
//        DTO (ClubDTO) используется для передачи данных между слоями приложения.
//        Эта архитектура обеспечивает четкое разделение ответственности и упрощает
//        поддержку кода в будущем. Вы можете легко расширить функциональность,
//        добавив новые методы в ClubFacade или создав дополнительные сервисы для сложных операций.

