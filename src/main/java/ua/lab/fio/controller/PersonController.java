package ua.lab.fio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ua.lab.fio.model.Person;
import ua.lab.fio.service.PersonService;

import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/main")
    public String mainPage() {
        return "Index";
    }

    @GetMapping("/people")
    public String findAll(Model model){
        List<Person> personList=personService.findAll();
        model.addAttribute("people",personList);
        return "peopleList";
    }
    @GetMapping("/personCreate")
    public String createPersonForm(Person person){
        return "personCreate";
    }
    @PostMapping("/personCreate")
    public String createPerson(Person person){
        personService.savePerson(person);
        return "redirect:/people";
    }
    @GetMapping("personDelete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        personService.deleteById(id);
        return "redirect:/people";
    }
    @GetMapping("/personUpdate/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model){
        Person person = personService.findById(id);
        model.addAttribute("person", person);
        return "personUpdate";
    }

    @PostMapping("/personUpdate")
    public String updateUser(Person person){
        personService.savePerson(person);
        return "redirect:/people";
    }
}
