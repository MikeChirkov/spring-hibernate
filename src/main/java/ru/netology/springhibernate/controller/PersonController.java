package ru.netology.springhibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springhibernate.entity.Person;
import ru.netology.springhibernate.repository.PersonRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }
}