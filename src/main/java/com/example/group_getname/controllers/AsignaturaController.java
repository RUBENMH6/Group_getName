package com.example.group_getname.controllers;

import com.example.group_getname.repository.AsignaturaRepo;
import com.example.group_getname.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AsignaturaController  {

    @Autowired
    private AsignaturaService asignaturaService;
    @GetMapping("/asignatura")
    public String showAsignaturas(Model model) {
        model.addAttribute("asignatura", asignaturaService.findAll());
        return "asignatura";
    }
}
