package com.example.gimnasiofitness.serviceImpl;

import com.example.gimnasiofitness.domain.Categoria;
import com.example.gimnasiofitness.repository.CategoriaRepository;
import com.example.gimnasiofitness.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public void guardar(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public Categoria obtener(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }
}