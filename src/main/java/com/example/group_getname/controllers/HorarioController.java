package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Horario;
import com.example.group_getname.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/horario/{id}/update")
    public String mostrarModificarHorario(@PathVariable int id, Model model) {
        Optional<Horario> horario = horarioService.findById(id);
        model.addAttribute("horario", horario.orElse(null));
        return "update/modificar_horario";
    }

    @PostMapping("/horario/create")
    private String crearHorario(@ModelAttribute Horario horario) {
        horarioService.create(horario);
        return "redirect:/horarios";
    }

    @PostMapping("/horario/{id}/update")
    private String modificarHorario(@PathVariable int id, @ModelAttribute Horario horario) {
        horario.setId_horario(id);
        horarioService.update(horario);
        return "redirect:/horarios";
    }

    @DeleteMapping("/horario/{id}/delete")
    private String eliminarHorario(@PathVariable int id) {
        horarioService.delete(id);
        return "redirect:/horarios";
    }
}
