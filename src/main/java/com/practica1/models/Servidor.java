package com.practica1.models;

import javax.persistence.*;

@Entity
@Table(name="servidor")
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;
    @Column(name = "nombre", columnDefinition = "varchar(60)")
    private String nombre;
    @Column(name = "ip", columnDefinition = "char(15)")
    private String ip;

    public Servidor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
