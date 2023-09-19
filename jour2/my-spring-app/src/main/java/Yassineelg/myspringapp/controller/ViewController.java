package Yassineelg.myspringapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/message")
    public String showMessage(Model model) {
        List<String> messages = Arrays.asList("Hello", "World", "from", "Spring");
        model.addAttribute("messages", messages);
        return "view";
    }
}