package Yassineelg.myspringapp.service;

import org.springframework.stereotype.Service;
import Yassineelg.myspringapp.model.Person;
import Yassineelg.myspringapp.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findPeopleByName(String name) {
        return personRepository.findByName(name);
    }

    public List<Person> findPeopleByAge(Integer age) {
        return personRepository.findByAge(age);
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public Person updatePerson(Long id, Person updatedPerson) {
        if (personRepository.existsById(id)) {
            updatedPerson.setId(id);
            return personRepository.save(updatedPerson);
        } else {
            throw new IllegalArgumentException("Person not found with id: " + id);
        }
    }
}
