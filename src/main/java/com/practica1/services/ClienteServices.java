package com.practica1.services;

import com.practica1.models.Cliente;
import com.practica1.repository.CRUD;
import com.practica1.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices extends CRUD<Cliente, ClienteRepository> {

    public ClienteServices(ClienteRepository repository){

        super(repository);
    }
    @Override
    public List<Cliente> list() {
        return repository.findAll();
    }

    @Override
    public Cliente get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Cliente o) {

        repository.save(o);
    }

    @Override
    public void update(Cliente o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {

        repository.deleteById(id);
    }
}
