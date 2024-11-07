package ru.english.registration_for_courses.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import ru.english.registration_for_courses.entity.Tag;
import ru.english.registration_for_courses.service.implementation.TagService;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = TagService.class)
//public interface ClubMapper {
//
//    @Mapping(source = "labelIds", target = "labels") // Маппинг ID тегов на объекты Tag
//    Club asClub(ClubDTO clubDTO, @Context TagService tagService);
//
//    @Mapping(source = "labels", target = "labelIds") // Маппинг объектов Tag на ID тегов
//    ClubDTO asClubDTO(Club club);
//
//    List<ClubDTO> asClubDTO(List<Club> clubs);
//
//    default List<Tag> mapToTags(List<UUID> labelIds, @Context TagService tagService) {
//        if (labelIds == null) {
//            return Collections.emptyList();
//        }
//        return labelIds.stream()
//                .map(tagService::findById)  // По ID находим объект Tag
//                .collect(Collectors.toList());
//    }
//
//    default List<Long> mapToLabelIds(List<Tag> tags) {
//        if (tags == null) {
//            return Collections.emptyList();
//        }
//        return tags.stream()
//                .map(Tag::getId)
//                .collect(Collectors.toList());
//    }
//}

//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = TagService.class)
//public interface ClubMapper {
//
//    @Mapping(source = "labelIds", target = "labels") // Маппинг ID тегов на объекты Tag
//    Club asClub(ClubDTO clubDTO, @Context TagService tagService);
//
//    @Mapping(source = "labels", target = "labelIds") // Маппинг объектов Tag на ID тегов
//    ClubDTO asClubDTO(Club club);
//
//    List<ClubDTO> asClubDTO(List<Club> clubs);
//
//    // Новый метод для преобразования списка UUID (ID тегов) в объекты Tag
//    default List<Tag> mapToTags(List<UUID> labelIds, @Context TagService tagService) { // Добавлено
//        if (labelIds == null) {
//            return Collections.emptyList();
//        }
//        return labelIds.stream()
//                .map(tagService::findById)  // Находим каждый объект Tag по ID
//                .collect(Collectors.toList());
//    }
//
//    // Новый метод для преобразования списка объектов Tag в их идентификаторы UUID
//    default List<UUID> mapToLabelIds(List<Tag> tags) { // Добавлено
//        if (tags == null) {
//            return Collections.emptyList();
//        }
//        return tags.stream()
//                .map(Tag::getId)  // Получаем ID из каждого объекта Tag
//                .collect(Collectors.toList());
//    }
//}

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = TagService.class)
public interface ClubMapper {

    @Mapping(source = "labelIds", target = "labels") // Маппинг из List<Long> в List<Tag>
    Club asClub(ClubDTO clubDTO, @Context TagService tagService);

    @Mapping(source = "labels", target = "labelIds") // Маппинг из List<Tag> в List<Long>
    ClubDTO asClubDTO(Club club);

    List<ClubDTO> asClubDTO(List<Club> clubs);

    default List<Tag> mapToTags(List<UUID> labelIds, @Context TagService tagService) {
        if (labelIds == null) {
            return Collections.emptyList();
        }
        return labelIds.stream()
                .map(tagService::findById)  // Убедиться, что findById возвращает объект Tag
                .collect(Collectors.toList());
    }

    default List<UUID> mapToLabelIds(List<Tag> tags) {
        if (tags == null) {
            return Collections.emptyList();
        }
        return tags.stream()
                .map(Tag::getId)  // Убедиться, что Tag::getId возвращает Long
                .collect(Collectors.toList());
    }
}








