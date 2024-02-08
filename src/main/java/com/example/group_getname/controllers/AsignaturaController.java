package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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

    @GetMapping("/asignatura/update")
    private String updateAsignatura(Model model) {
        model.addAttribute("asignatura", new Asignatura());
        return "update/modificar_asignatura";
    }

    @PostMapping("/asignatura/create")
    private String crearAsignatura(@ModelAttribute Asignatura asignatura) {
        asignaturaService.create(asignatura);
        return "redirect:/asignaturas";
    }

    @PutMapping("/asignatura/update")
    private String modificarAsignatura(@ModelAttribute Asignatura asignatura) {
        asignaturaService.update(asignatura);
        return "redirect:/asignatura";
    }
}
