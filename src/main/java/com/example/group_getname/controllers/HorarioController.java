package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Horario;
import com.example.group_getname.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping("/horarios")
    public String horarios(Model model){
        model.addAttribute("horario", horarioService.findAll());
        return "horario";
    }

    @GetMapping("/horario/create")
    private String nuevoHorario(Model model) {
        model.addAttribute("horario", new Horario());
        return "create/nuevo_horario";
    }

    @GetMapping("/horario/update")
    private String modificarHorario(Model model) {
        model.addAttribute("horario", new Horario());
        return "update/modificar_horario";
    }

    @PostMapping("/horario/create")
    private String crearHorario(@ModelAttribute Horario horario) {
        horarioService.create(horario);
        return "redirect:/horarios";
    }
}
