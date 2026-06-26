package com.example.gimnasiofitness.controller;

import com.example.gimnasiofitness.domain.Categoria;
import com.example.gimnasiofitness.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("categorias", categoriaService.listar());
        model.addAttribute("categoria", new Categoria());
        return "categoria/listado";
    }

    @PostMapping("/guardar")
    public String guardar(Categoria categoria) {
        categoriaService.guardar(categoria);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        categoriaService.eliminar(id);
        return "redirect:/categoria/listado";
    }
}