package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Estudiante;
import com.example.group_getname.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    private String estudiantes(Model model){
        model.addAttribute("estudiante", estudianteService.findAll());
        return "estudiante";
    }

    @GetMapping("/estudiante/create")
    private String nuevoEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "create/nuevo_estudiante";
    }

    @PostMapping("/estudiante/create")
    private String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteService.create(estudiante);
        return "redirect:/estudiantes";
    }
}
