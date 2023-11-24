package com.example.demo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {
    private Long idPrestamo;

    @ManyToOne
    @JoinColumn(name = "idLibro")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "idLector")
    private Lector lector;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @Version
    private int version;


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    @Id
    public Long getIdPrestamo() {
        return idPrestamo;
    }
}
