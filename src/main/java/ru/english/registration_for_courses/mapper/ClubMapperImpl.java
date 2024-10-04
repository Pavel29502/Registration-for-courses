package ru.english.registration_for_courses.mapper;

import org.springframework.stereotype.Component;
import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClubMapperImpl extends ClubMapper {
    @Override
    public Club asClub(ClubDTO clubDTO) {
        if (clubDTO == null) {
            return null;
        }
        Club club = new Club();
        club.setClubName(clubDTO.getClubName());
        club.setType(clubDTO.getType());
        club.setLevel(clubDTO.getLevel());
        club.setLabel(clubDTO.getLabel());
        club.setDescription(clubDTO.getDescription());
        club.setLength(clubDTO.getLength());
        club.setFrequency(clubDTO.getFrequency());
        return club;
    }

    @Override
    public ClubDTO asClubDTO(Club club) {
        if (club == null) {
            return null;
        }
        ClubDTO clubDTO = new ClubDTO();
        clubDTO.setClubName(club.getClubName());
        clubDTO.setType(club.getType());
        clubDTO.setLevel(club.getLevel());
        clubDTO.setLabel(club.getLabel());
        clubDTO.setDescription(club.getDescription());
        clubDTO.setLength(club.getLength());
        clubDTO.setFrequency(club.getFrequency());
        return clubDTO;
    }

    @Override
    public List<ClubDTO> asClubsDTO(List<Club> clubList) {
        if (clubList == null || clubList.isEmpty()) {
            return null;
        }
        List<ClubDTO> list = new ArrayList<>(clubList.size());
        for (Club club : clubList) {
            list.add(asClubDTO(club));
        }
        return list;
    }
}

