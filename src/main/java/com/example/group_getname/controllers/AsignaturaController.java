package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        return "nueva_asignatura";
    }
}
