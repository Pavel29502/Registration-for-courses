package ru.english.registration_for_courses.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.TagDTO;
import ru.english.registration_for_courses.entity.Tag;
import ru.english.registration_for_courses.service.implementation.TagService;

import java.util.List;
import java.util.UUID;

//@Service
//@RequiredArgsConstructor
//public class TagFacade {
//
//
//    private final TagMapper tagMapper;
//    private final TagService tagService;
//
//    public TagDTO createTag(TagDTO tagDTO) {
////        Tag tag = tagMapper.asTag(tagDTO); // Преобразуем DTO в сущность
////        tag = tagService.createTag(tag);   // Сохраняем сущность
//        return tagMapper.asTagDTO(tag);    // Преобразуем обратно в DTO
//    }
//
//    public List<TagDTO> findAll() {
//        List<Tag> tags = tagService.findAll(); // Получаем все теги
//        return tagMapper.asTagDTO(tags);       // Преобразуем в список DTO
//    }
//
//    public TagDTO findById(UUID id) {
//        Tag tag = tagService.findById(id);     // Находим тег по ID
//        return tagMapper.asTagDTO(tag);        // Преобразуем в DTO
//    }
//}
