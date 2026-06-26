package com.example.gimnasiofitness.service;

import com.example.gimnasiofitness.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    List<Categoria> listar();

    void guardar(Categoria categoria);

    Categoria obtener(Long id);

    void eliminar(Long id);

}