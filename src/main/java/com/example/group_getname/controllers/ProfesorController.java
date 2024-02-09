package com.example.group_getname.controllers;


import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Profesor;
import com.example.group_getname.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/profesor/{id}/update")
    public String mostrarModificarProfesor(@PathVariable int id, Model model) {
        Optional<Profesor> profesor = profesorService.findById(id);
        model.addAttribute("profesor", profesor.orElse(null));
        return "update/modificar_profesor";
    }

    @PostMapping("/profesor/create")
    private String crearProfesor(@ModelAttribute Profesor profesor) {
        profesorService.create(profesor);
        return "redirect:/profesores";
    }

    @PostMapping("/profesor/{id}/update")
    private String modificarProfesor(@PathVariable int id, @ModelAttribute Profesor profesor) {
        profesor.setId_profesor(id);
        profesorService.update(profesor);
        return "redirect:/profesores";
    }

}
