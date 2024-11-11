package ru.english.registration_for_courses.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "club_name", nullable = false)
    @NonNull
    private String clubName;

    @Column(name = "type", nullable = false)
    @NonNull
    private String type;

    @Enumerated(EnumType.STRING)
    @Column(name = "level", nullable = false)
    @NonNull
    private Level level;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "club_tag",
            joinColumns = @JoinColumn(name = "club_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> labels;  // Список тегов

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "length", nullable = false)
    private String length;

    @Column(name = "frequency", nullable = false)
    private String frequency;

    public enum Level {
        A1_A2("A1-A2"),
        B1("B1+");

        private final String displayValue;

        Level(String displayValue) {
            this.displayValue = displayValue;
        }

        public String getDisplayValue() {
            return displayValue;
        }
    }
}










