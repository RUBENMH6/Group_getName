package com.example.group_getname.controllers;

import com.example.group_getname.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping("/horarios")
    public String horarios(Model model){
        model.addAttribute("horario", horarioService.findAll());
        return "horario";
    }
}
