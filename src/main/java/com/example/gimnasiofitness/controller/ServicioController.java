package com.example.gimnasiofitness.controller;

import com.example.gimnasiofitness.domain.Servicio;
import com.example.gimnasiofitness.service.CategoriaService;
import com.example.gimnasiofitness.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("servicios", servicioService.listar());
        model.addAttribute("categorias", categoriaService.listar());
        model.addAttribute("servicio", new Servicio());
        return "servicio/listado";
    }

    @PostMapping("/guardar")
    public String guardar(Servicio servicio) {
        servicioService.guardar(servicio);
        return "redirect:/servicio/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicioService.eliminar(id);
        return "redirect:/servicio/listado";
    }
}