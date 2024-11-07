package ru.english.registration_for_courses.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagDTO {

//    @NonNull
    private UUID id;
//    @NonNull
    private String name;
}
