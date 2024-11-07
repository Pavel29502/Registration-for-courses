package ru.english.registration_for_courses.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "tag")
//public class Tag {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private Long id;
//
//    @Column(name = "name", nullable = false, unique = true)
//    @NonNull
//    private String name;
//
//    // Опционально: можно добавить связь с клубами, если нужно получать список клубов через тэг
//    @ManyToMany(mappedBy = "labels")
//    @Builder.Default // Указываем, что это значение по умолчанию
//    private List<Club> clubs = new ArrayList<>();
//}
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Используйте IDENTITY для Long
    private UUID id; // Измените с UUID на Long

    @Column(name = "name", nullable = false, unique = true)
    @NonNull
    private String name;

    @ManyToMany(mappedBy = "labels")
//    @Builder.Default
    private List<Club> clubs = new ArrayList<>();
}