package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AsignaturaController  {

    @Autowired
    private AsignaturaService asignaturaService;
    @GetMapping("/asignaturas")
    public String asignaturas(Model model) {
        model.addAttribute("asignatura", asignaturaService.findAll());
        return "asignatura";
    }

    @GetMapping("/asignatura/create")
    private String nuevoAsignatura(Model model) {
        model.addAttribute("asignatura", new Asignatura());
        return "create/nueva_asignatura";
    }

    @GetMapping("/asignatura/{id}/update")
    public String mostrarModificarAsignatura(@PathVariable int id, Model model) {
        Optional<Asignatura> asignatura = asignaturaService.findById(id);
        model.addAttribute("asignatura", asignatura.orElse(null));
        return "update/modificar_asignatura";
    }

    @PostMapping("/asignatura/create")
    private String crearAsignatura(@ModelAttribute Asignatura asignatura) {
        asignaturaService.create(asignatura);
        return "redirect:/asignaturas";
    }

    @PostMapping("/asignatura/{id}/update")
    private String modificarAsignatura(@PathVariable int id, @ModelAttribute Asignatura asignatura) {
        asignatura.setId_asignatura(id);
        asignaturaService.update(asignatura);
        return "redirect:/asignaturas";
    }





}
