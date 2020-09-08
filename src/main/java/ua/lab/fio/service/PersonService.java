package ua.lab.fio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lab.fio.model.Person;
import ua.lab.fio.repository.PersonRepository;

import java.util.List;
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person findById(Long id){
        return personRepository.getOne(id);
    }
    public List<Person> findAll(){
        return personRepository.findAll();
    }
    public Person savePerson(Person person){
        return personRepository.save(person);
    }
    public void deleteById(Long id){
        personRepository.deleteById(id);
    }
}
