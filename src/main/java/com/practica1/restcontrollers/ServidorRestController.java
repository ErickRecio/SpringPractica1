package com.practica1.restcontrollers;

import com.practica1.models.Servidor;
import com.practica1.services.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/servidor")
public class ServidorRestController {

    @Autowired
    ServidorService service;

    @GetMapping("/list")
    public List<Servidor> list() {return service.list();}

    @PostMapping("/add")
    public void add(@RequestBody Servidor servidor) {service.add(servidor);}

    @PutMapping("/update/{id}")
    public void update(@RequestBody Servidor servidor, @PathVariable int id) {service.update(servidor, id);}

    @PutMapping("/delete/{id}")
    public void delete(@PathVariable int id) {service.delete(id);}
}
