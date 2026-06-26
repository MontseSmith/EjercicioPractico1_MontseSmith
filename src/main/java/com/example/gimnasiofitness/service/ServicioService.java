package com.example.gimnasiofitness.service;

import com.example.gimnasiofitness.domain.Servicio;
import java.util.List;

public interface ServicioService {

    List<Servicio> listar();

    void guardar(Servicio servicio);

    Servicio obtener(Long id);

    void eliminar(Long id);

}