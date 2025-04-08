package com.miempresa.buses.controller;

import com.miempresa.buses.model.Bus;
import com.miempresa.buses.service.BusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = "*")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<Bus> getBuses() {
        return busService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Bus getBusPorId(@PathVariable Long id) {
        return busService.obtenerPorId(id).orElse(null);
    }
}
