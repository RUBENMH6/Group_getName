package com.example.group_getname.controllers;

import com.example.group_getname.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String showUsuariosPage(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuario";
    }
}
