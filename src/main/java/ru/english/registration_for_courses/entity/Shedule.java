package ru.english.registration_for_courses.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shedule")
public class Shedule {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private Club club; // Связь с сущностью Club

    @Column(name = "day_of_week", nullable = false)
    private String dayOfWeek;

    @Column(name = "start_time", nullable = false)
    @JsonFormat(pattern = "HH:mm:ss") // Для отображения в формате HH:mm:ss
    private LocalTime startTime; // Заменено на LocalTime

    @Column(name = "end_time", nullable = false)
    @JsonFormat(pattern = "HH:mm:ss") // Для отображения в формате HH:mm:ss
    private LocalTime endTime; // Заменено на LocalTime

    @Enumerated(EnumType.STRING) // Убедитесь, что вы указали правильный тип Enum
    @Column(name = "session_type", nullable = false)
    private SessionType sessionType;

    @Column(name = "session_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd") // Для отображения в формате yyyy-MM-dd
    private LocalDate sessionDate; // Поле для даты

    public enum SessionType {
        MORNING, EVENING, HOLIDAY
    }
}

//    @Column(name = "session_type", nullable = false)
//    private String sessionType;
//


