package com.example.group_getname.controllers;

import com.example.group_getname.models.entity.Usuario;
import com.example.group_getname.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/registro")
    public String showRegistroPage(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }


}
