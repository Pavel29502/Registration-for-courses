package ru.english.registration_for_courses.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "club")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Club {
    @Id
    private UUID id;

    @Column(name = "club_name", nullable = false)
    private String clubName;

    @Column(name = "type", nullable = false)
    private String type;

    @Enumerated(EnumType.STRING)
    @Column(name = "level", nullable = false)
    private Level level;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> label;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "length", nullable = false)
    private String length;

    @Column(name = "frequency", nullable = false)
    private String frequency;


    // Enum для уровня клуба
    public enum Level {
        BEGINNER, INTERMEDIATE, ADVANCED
    }
}




