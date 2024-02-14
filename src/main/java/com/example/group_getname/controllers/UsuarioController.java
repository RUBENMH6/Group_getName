package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Estudiante;
import com.example.group_getname.models.entity.Horario;
import com.example.group_getname.models.entity.Usuario;
import com.example.group_getname.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String showUsuariosPage(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuario";
    }

    @PostMapping("/usuario/create")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.create(usuario);
        return "redirect:/login";
    }

    @GetMapping("/registro")
    public String showRegistroPage(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }
}
