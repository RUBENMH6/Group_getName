package com.example.group_getname.controllers;

import com.example.group_getname.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

        @Autowired
        private CursoService cursoService;

        @GetMapping("/cursos")
        public String cursos(Model model){
            model.addAttribute("curso", cursoService.findAll());
            return "curso";
        }

        /*
        @GetMapping("/cursos/create")
        public String createProduct(Model model) {
            model.addAttribute("product", new Product());
            model.addAttribute("currentPage", "product");
            return "create-curso";
        }

        @PostMapping("/cursos/save")
        public String newMenu(Model model, @ModelAttribute("product") Product product) {
            CursoDAOImpl.create(product);
            return "redirect:/cursos";
        }*/

}

