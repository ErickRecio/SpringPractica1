package com.practica1.services;

import com.practica1.models.Servidor;
import com.practica1.repository.CRUD;
import com.practica1.repository.ServidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorService extends CRUD<Servidor, ServidorRepository> {

    public ServidorService(ServidorRepository repository){

        super(repository);
    }


    @Override
    public List<Servidor> list() {
        return repository.findAll();
    }

    @Override
    public Servidor get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Servidor o) {

        repository.save(o);
    }

    @Override
    public void update(Servidor o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {

        repository.deleteById(id);
    }
}
