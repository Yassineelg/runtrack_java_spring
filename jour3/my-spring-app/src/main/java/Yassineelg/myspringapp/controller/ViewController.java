package Yassineelg.myspringapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Yassineelg.myspringapp.model.Person;
import jakarta.validation.Valid;

@Controller
public class ViewController {
    private List<String> persons = new ArrayList<>();

    // Gère la requête GET pour afficher le formulaire
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("persons", persons);
        model.addAttribute("person", new Person());
        model.addAttribute("validationErrors", new ArrayList<String>());
        return "view";
    }

    // Gère la soumission du formulaire via POST
    @PostMapping("/form")
    public String submitForm(@Valid @ModelAttribute("person") Person person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("persons", persons);
            model.addAttribute("validationErrors", getValidationErrors(result));
            return "view";
        }

        String personInfo = person.getName() + ", " + person.getAge() + " years old";
        persons.add(personInfo);
        return "redirect:/form";
    }

    private List<String> getValidationErrors(BindingResult result) {
        List<String> errors = new ArrayList<>();
        result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
        return errors;
    }
}
