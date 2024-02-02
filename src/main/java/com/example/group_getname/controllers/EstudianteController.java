package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Estudiante;
import com.example.group_getname.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    private String estudiantes(Model model){
        model.addAttribute("estudiante", estudianteService.findAll());
        return "estudiante";
    }

    @GetMapping("/nuevo_estudiante")
    private String nuevoEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "nuevo_estudiante";
    }
}
