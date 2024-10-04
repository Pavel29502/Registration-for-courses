package ru.english.registration_for_courses.mapper;


import org.mapstruct.Mapper;

import org.mapstruct.ReportingPolicy;
import ru.english.registration_for_courses.dto.RegistrationDTO;
import ru.english.registration_for_courses.entity.Registration;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RegistrationMapper {

    Registration asRegistration(RegistrationDTO registrationDTO);

    RegistrationDTO asRegistrationDTO(Registration registration);

    List<RegistrationDTO> asRegistrationDTO(List<Registration> registrations);
}
