package Yassineelg.myspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import Yassineelg.myspringapp.model.Person;
import Yassineelg.myspringapp.repository.PersonRepository;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewController {
    private final PersonRepository personRepository; // Injectez le PersonRepository

    public ViewController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Gère la requête GET pour afficher le formulaire
    @GetMapping("/form")
    public String showForm(Model model) {
        List<Person> persons = personRepository.findAll(); // Récupérez la liste de personnes depuis la base de données
        model.addAttribute("persons", persons);
        model.addAttribute("person", new Person());
        model.addAttribute("validationErrors", new ArrayList<String>());
        return "view";
    }

    // Gère la soumission du formulaire via POST
    @PostMapping("/form")
    public String submitForm(@Valid @ModelAttribute("person") Person person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Person> persons = personRepository.findAll(); // Récupérez à nouveau la liste de personnes depuis la
                                                               // base de données
            model.addAttribute("persons", persons);
            model.addAttribute("validationErrors", getValidationErrors(result));
            return "view";
        }

        personRepository.save(person); // Sauvegardez la personne dans la base de données
        return "redirect:/form";
    }

    private List<String> getValidationErrors(BindingResult result) {
        List<String> errors = new ArrayList<>();
        result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
        return errors;
    }
}