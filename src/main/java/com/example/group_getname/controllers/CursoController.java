package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

        @GetMapping("/curso/update")
        private String modificarCurso(@ModelAttribute Model model, @RequestParam Curso curso) {
            model.addAttribute("curso", curso);
            return "update/modificar_curso";
        }

        @PostMapping("/curso/create")
        private String crearCurso(@ModelAttribute Curso curso) {
            cursoService.create(curso);
            return "redirect:/cursos";
        }

        @PostMapping("/curso/update")
        private String modificarCurso(@ModelAttribute Curso curso) {
        cursoService.update(curso);
        return "redirect:/cursos";
        }

}



