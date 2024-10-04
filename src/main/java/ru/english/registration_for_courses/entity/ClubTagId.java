package ru.english.registration_for_courses.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClubTagId implements Serializable {

    private UUID clubId;
    private Long tagId;
}
