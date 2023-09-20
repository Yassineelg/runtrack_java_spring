package Yassineelg.myspringapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${greeting.message}")
    private String greetingMessage;

    // Gère la requête GET à la racine ("/") et renvoie un message de salutation
    @GetMapping("/")
    public String sayHello() {
        return greetingMessage;
    }
}