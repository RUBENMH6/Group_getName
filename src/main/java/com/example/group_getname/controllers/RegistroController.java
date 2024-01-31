package com.example.group_getname.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {

    @GetMapping("/registro")
    public String showRegistroPage() {
        return "registro";
    }
}
