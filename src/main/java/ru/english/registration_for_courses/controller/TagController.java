package ru.english.registration_for_courses.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.english.registration_for_courses.dto.TagDTO;
import ru.english.registration_for_courses.entity.Tag;
//import ru.english.registration_for_courses.mapper.TagMapper;
import ru.english.registration_for_courses.service.implementation.TagService;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    // Эндпоинт для создания нового тега
    @PostMapping("/create")
    public ResponseEntity<Tag> createTag(@RequestBody TagDTO tagDTO) {
        Tag savedTag = tagService.createTag(tagDTO);
        return ResponseEntity.ok(savedTag);
    }

    //Метод который сохраняет список тэгов
    @PostMapping("/create-batch")
    public ResponseEntity<List<Tag>> createTags(@RequestBody List<TagDTO> tagDTOs) {
        List<Tag> savedTags = tagService.createTags(tagDTOs);
        return ResponseEntity.ok(savedTags);
    }


    @GetMapping
    public ResponseEntity<List<TagDTO>> getAllTags() {
        List<TagDTO> tags = tagService.findAll();
        return ResponseEntity.ok(tags); // Возвращаем список DTO

    }
}
        // Эндпоинт для получения тега по ID
//        @GetMapping("/{id}")
//        public ResponseEntity<Tag> getTagById (@PathVariable UUID id){
//            Tag tag = tagService.findById(id);
//            return ResponseEntity.ok(tag);
//        }
        // Эндпоинт для получения всех тегов
//    @GetMapping("/all")
//    public ResponseEntity<List<Tag>> getAllTags() {
//        List<Tag> tags = tagService.findAll();
//        return ResponseEntity.ok(tags);
//    }
