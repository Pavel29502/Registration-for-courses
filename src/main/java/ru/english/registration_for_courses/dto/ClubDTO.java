package ru.english.registration_for_courses.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.english.registration_for_courses.entity.Club;
import java.util.List;
import java.util.UUID;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubDTO {

    @NonNull
    private UUID id;
    @NonNull
    private String clubName;
    @NonNull
    private String type;
    @NonNull
    private Club.Level level;
    private List<UUID> labelIds;  // Убедитесь, что это поле есть
    private String description;
    private String content;
    private String length;
    private String frequency;

    public List<UUID> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<UUID> labelIds) {
        this.labelIds = labelIds;
    }
}