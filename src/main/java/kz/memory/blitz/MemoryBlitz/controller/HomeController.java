package kz.memory.blitz.MemoryBlitz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value ="/login")
    public String login() {
        return "login";
    }
}