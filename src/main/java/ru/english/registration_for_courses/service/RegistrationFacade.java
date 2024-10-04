package ru.english.registration_for_courses.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.english.registration_for_courses.dto.RegistrationDTO;
import ru.english.registration_for_courses.entity.Registration;
import ru.english.registration_for_courses.mapper.RegistrationMapper;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Slf4j
public class RegistrationFacade {

    private static final Logger log = LoggerFactory.getLogger(RegistrationFacade.class);
    private final BaseCrudService<Registration> baseCrudService;

    private final RegistrationMapper mapper;

    public RegistrationDTO createRegistration(RegistrationDTO registrationDTO) {
        log.info("ЧТО ТУТ: {}", mapper.asRegistration(registrationDTO));
        return mapper.asRegistrationDTO(baseCrudService.save(mapper.asRegistration(registrationDTO)));
    }

    public List<RegistrationDTO> findAll() {
        return mapper.asRegistrationDTO(baseCrudService.findAll());
    }

    public RegistrationDTO findById(UUID id) {
        return mapper.asRegistrationDTO(baseCrudService.findById(id));
    }

}
