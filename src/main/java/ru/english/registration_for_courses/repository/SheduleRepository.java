package ru.english.registration_for_courses.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.english.registration_for_courses.entity.Shedule;
import java.util.UUID;

@Repository
public interface SheduleRepository extends JpaRepository<Shedule,UUID> {


}
