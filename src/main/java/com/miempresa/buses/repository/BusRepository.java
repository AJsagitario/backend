package com.miempresa.buses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.miempresa.buses.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}
