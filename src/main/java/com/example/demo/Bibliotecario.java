package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Bibliotecario {
    private Long idBibliotecario;
    private String nombre;
    private String apellidos;

    @Version
    private int version;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdBibliotecario(Long idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    @Id
    public Long getIdBibliotecario() {
        return idBibliotecario;
    }
}
