package com.example.gimnasiofitness.service;

import com.example.gimnasiofitness.domain.Reserva;
import java.util.List;

public interface ReservaService {

    List<Reserva> listar();

    void guardar(Reserva reserva);

    Reserva obtener(Long id);

    void eliminar(Long id);

}