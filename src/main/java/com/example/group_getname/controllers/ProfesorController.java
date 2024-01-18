package com.example.group_getname.controllers;

import com.example.group_getname.models.dao.ProfesorDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfesorController {

    @Autowired
    private ProfesorDAOImpl profesorDAOImpl;
    @GetMapping("/profesor")
    public String showProfesores(Model model) {
        model.addAttribute("profesor", profesorDAOImpl.findAll());
        return "profesor";
    }
}
