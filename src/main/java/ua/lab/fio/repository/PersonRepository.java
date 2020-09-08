package ua.lab.fio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lab.fio.model.Person;

public interface PersonRepository  extends JpaRepository<Person, Long   > {
}
