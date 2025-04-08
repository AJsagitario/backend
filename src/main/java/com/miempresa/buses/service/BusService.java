package com.miempresa.buses.service;

import com.miempresa.buses.model.Bus;
import com.miempresa.buses.repository.BusRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> obtenerTodos() {
        return busRepository.findAll();
    }

    public Optional<Bus> obtenerPorId(Long id) {
        return busRepository.findById(id);
    }
}
