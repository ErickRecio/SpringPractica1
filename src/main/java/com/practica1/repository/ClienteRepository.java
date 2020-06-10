package com.practica1.repository;

import com.practica1.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
