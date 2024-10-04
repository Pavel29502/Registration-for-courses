package ru.english.registration_for_courses.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClubMapper {

    Club asClubs(ClubDTO clubDTO);
    ClubDTO asClubsDTO(Club club);
    List<ClubDTO> asClubsDTO(List<Club> clubsList);
}

