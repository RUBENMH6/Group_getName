package com.example.group_getname.controllers;

import com.example.group_getname.models.dao.CursoDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

        @Autowired
        private CursoDAOImpl CursoDAOImpl;

        @GetMapping("/cursos")
        public String cursos(Model model){
            model.addAttribute("curso", CursoDAOImpl.findAll());
            model.addAttribute("currentPage", "curso");
            return "cursos";
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

