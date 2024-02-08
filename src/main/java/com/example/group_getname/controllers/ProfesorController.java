package com.example.group_getname.controllers;


import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Profesor;
import com.example.group_getname.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "create/nuevo_profesor";
    }
/*
    @GetMapping("/profesor/update")
    private String modificarProfesor(@ModelAttribute Model model, @RequestParam Profesor profesor) {
        model.addAttribute("profesor", profesor);
        return "update/modificar_profesor";
    }*/

    @PostMapping("/profesor/create")
    private String crearProfesor(@ModelAttribute Profesor profesor) {
        profesorService.create(profesor);
        return "redirect:/profesores";
    }
/*
    @PostMapping("/curso/update")
    private String modificarCurso(@ModelAttribute Profesor profesor) {
        profesorService.update(profesor);
        return "redirect:/profesores";
    }*/
}
