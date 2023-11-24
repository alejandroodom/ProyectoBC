package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Libro {

    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private int numDisponibles;

    @Version
    private int version;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, int numDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numDisponibles = numDisponibles;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumDisponibles() {
        return numDisponibles;
    }

    public void setNumDisponibles(int numDisponibles) {
        this.numDisponibles = numDisponibles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
