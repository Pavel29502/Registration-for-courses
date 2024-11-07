package ru.english.registration_for_courses.mapper;

import ru.english.registration_for_courses.dto.ClubDTO;
import ru.english.registration_for_courses.entity.Club;

public class ClubMap {

    public static Club mapClubDtoToClub(ClubDTO clubDTO) {
        Club club = new Club();
        club.setClubName(clubDTO.getClubName());
        club.setContent(clubDTO.getContent());
        club.setDescription(clubDTO.getDescription());
        club.setContent(clubDTO.getContent());
        club.setLevel(clubDTO.getLevel());
        club.setFrequency(clubDTO.getFrequency());
        club.setId(clubDTO.getId());
        club.setLength(clubDTO.getLength());
        club.setType(clubDTO.getType());
        return club;
    }
}
