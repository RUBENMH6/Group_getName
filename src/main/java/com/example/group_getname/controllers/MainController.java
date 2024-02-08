package com.example.group_getname.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }
    @GetMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }


}
