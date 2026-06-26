package com.example.gimnasiofitness.controller;

import com.example.gimnasiofitness.domain.Reserva;
import com.example.gimnasiofitness.service.ReservaService;
import com.example.gimnasiofitness.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("reservas", reservaService.listar());
        model.addAttribute("servicios", servicioService.listar());
        model.addAttribute("reserva", new Reserva());
        return "reserva/listado";
    }

    @PostMapping("/guardar")
    public String guardar(Reserva reserva) {
        reservaService.guardar(reserva);
        return "redirect:/reserva/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        reservaService.eliminar(id);
        return "redirect:/reserva/listado";
    }
}