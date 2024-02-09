package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CursoController {

        @Autowired
        private CursoService cursoService;

        @GetMapping("/cursos")
        public String cursos(Model model){
            model.addAttribute("curso", cursoService.findAll());
            return "curso";
        }

        @GetMapping("/curso/create")
        private String nuevoCurso(Model model) {
            model.addAttribute("curso", new Curso());
            return "create/nuevo_curso";
        }

        @GetMapping("/curso/{id}/update")
        private String mostrarModificarCurso(@PathVariable int id, Model model) {
            Optional<Curso> curso = cursoService.findById(id);
            model.addAttribute("curso", curso.orElse(null));
            return "update/modificar_curso";
        }

        @PostMapping("/curso/create")
        private String crearCurso(@ModelAttribute Curso curso) {
            cursoService.create(curso);
            return "redirect:/cursos";
        }

        @PostMapping("/curso/{id}/update")
        private String modificarCurso(@PathVariable int id, @ModelAttribute Curso curso) {
            curso.setId_curso(id);
            cursoService.update(curso);
            return "redirect:/cursos";
        }



}



