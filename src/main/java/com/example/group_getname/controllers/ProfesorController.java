package com.example.group_getname.controllers;


import com.example.group_getname.models.entity.Profesor;
import com.example.group_getname.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;
    @GetMapping("/profesores")
    public String showProfesores(Model model) {
        model.addAttribute("profesor", profesorService.findAll());
        return "profesor";
    }

    @GetMapping("/profesor/create")
    private String nuevoProfesor(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "nuevo_profesor";
    }
}
