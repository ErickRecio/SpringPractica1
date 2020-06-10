package com.practica1.restcontrollers;


import com.practica1.models.Cliente;
import com.practica1.models.Servidor;
import com.practica1.services.ClienteServices;
import com.practica1.services.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteRestControllers {

    @Autowired
    ClienteServices service;

    @GetMapping("/list")
    public List<Cliente> list() {return service.list();}

    @PostMapping("/add")
    public void add(@RequestBody Cliente cliente) {service.add(cliente);}

    @PutMapping("/update/{id}")
    public void update(@RequestBody Cliente cliente, @PathVariable int id) {service.update(cliente, id);}

    @PutMapping("/delete/{id}")
    public void delete(@PathVariable int id) {service.delete(id);}
}
