package ru.english.registration_for_courses.service.implementation;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.TagDTO;
import ru.english.registration_for_courses.entity.Tag;
import ru.english.registration_for_courses.repository.TagRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class TagService {

    private final TagRepository tagRepository;

    public Tag findById(UUID id) {
        return tagRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tag not found"));
    }

    public List<TagDTO> findAll() {
        List<Tag> tags = tagRepository.findAll();
        return tags.stream()
                .map(tag -> new TagDTO(tag.getId(), tag.getName())) // Преобразуем Tag в TagDTO
                .collect(Collectors.toList());
    }


    public Tag createTag(TagDTO tagDTO) {
        Tag tag = new Tag();
        tag.setName(tagDTO.getName()); // Используем только поле name, id будет сгенерирован
        return tagRepository.save(tag);
    }

    public List<Tag> createTags(List<TagDTO> tagDTOs) {
        List<Tag> tags = tagDTOs.stream()
                .map(tagDTO -> {
                    Tag tag = new Tag();
                    tag.setName(tagDTO.getName()); // Поле `id` игнорируется, генерируется автоматически
                    return tag;
                })
                .collect(Collectors.toList());
        return tagRepository.saveAll(tags);
    }
}
