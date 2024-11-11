package ru.english.registration_for_courses.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.english.registration_for_courses.entity.Shedule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SheduleDTO {

    private UUID id;
    private UUID clubId;
    private String dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private Shedule.SessionType sessionType;
//    private String sessionDate;
    private LocalDate sessionDate;

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

}
