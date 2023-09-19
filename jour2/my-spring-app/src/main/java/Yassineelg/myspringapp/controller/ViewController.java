package Yassineelg.myspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/message")
    public String showMessage(Model model) {
        model.addAttribute("message", "Hello, this is a message from the controller!");
        return "view";
    }
}