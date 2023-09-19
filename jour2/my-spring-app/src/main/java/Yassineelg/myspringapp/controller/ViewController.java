package Yassineelg.myspringapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/message")
    public String showMessage(Model model) {
        List<String> messages = Arrays.asList("Hello", "World", "from", "Spring");
        model.addAttribute("messages", messages);
        return "view";
    }

    @PostMapping("/submit")
    public String submitMessage(@RequestParam("message") String message, Model model) {
        model.addAttribute("submittedMessage", message);
        return "view";
    }
}