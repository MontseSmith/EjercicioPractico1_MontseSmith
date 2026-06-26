package com.example.gimnasiofitness.serviceImpl;

import com.example.gimnasiofitness.domain.Reserva;
import com.example.gimnasiofitness.repository.ReservaRepository;
import com.example.gimnasiofitness.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> listar() {
        return reservaRepository.findAll();
    }

    @Override
    public void guardar(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public Reserva obtener(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        reservaRepository.deleteById(id);
    }
}