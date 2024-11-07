//package ru.english.registration_for_courses.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.english.registration_for_courses.dto.TagDTO;
import ru.english.registration_for_courses.entity.Tag;

import java.util.List;

//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
//public interface TagMapper {
//    TagDTO asTagDTO(Tag tag); // Преобразование из Tag в TagDTO
//
//    Tag asTag(TagDTO tagDTO); // Преобразование из TagDTO в Tag
//
//
//    List<TagDTO> asTagDTO(List<Tag> tags); // Маппинг списка Tag в список TagDTO
//
//    List<Tag> asTag(List<TagDTO> tagDTOs); // Маппинг списка TagDTO в список Tag
//}