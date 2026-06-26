package com.example.gimnasiofitness.serviceImpl;

import com.example.gimnasiofitness.domain.Servicio;
import com.example.gimnasiofitness.repository.ServicioRepository;
import com.example.gimnasiofitness.service.ServicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> listar() {
        return servicioRepository.findAll();
    }

    @Override
    public void guardar(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public Servicio obtener(Long id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        servicioRepository.deleteById(id);
    }
}