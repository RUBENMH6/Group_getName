package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Estudiante;
import com.example.group_getname.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Optional;

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

    @GetMapping("/estudiante/{id}/update")
    public String mostrarModificarEstudiante(@PathVariable int id, Model model) {
        Optional<Estudiante> estudiante = estudianteService.findById(id);
        model.addAttribute("estudiante", estudiante.orElse(null));
        return "update/modificar_estudiante";
    }

    @PostMapping("/estudiante/create")
    private String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudiante.setDateRegistered(LocalDate.now());
        estudianteService.create(estudiante);
        return "redirect:/estudiantes";
    }

    @PostMapping("/estudiante/{id}/update")
    private String modificarEstudiante(@PathVariable int id, @ModelAttribute Estudiante estudiante) {
        estudiante.setId_estudiante(id);
        estudianteService.update(estudiante);
        return "redirect:/estudiantes";
    }
}
