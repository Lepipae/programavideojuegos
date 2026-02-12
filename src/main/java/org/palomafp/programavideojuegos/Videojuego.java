package org.palomafp.programavideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Videojuego {
    private String nombre;
    private LocalDate añoSalida;
    private double precio;
    private String duracionMedia;
    private double notaMedia;
    private String descripcionCorta;
    private String estado; // sin empezar, en progreso, completado
    private Desarrolladora desarrolladora;
    private Genero genero;
    private List<Plataforma> plataformas;

    // Constructor vacío
    public Videojuego() {
        this.plataformas = new ArrayList<>();
        this.estado = "sin empezar";
    }

    // Constructor con parámetros principales
    public Videojuego(String nombre, LocalDate añoSalida, double precio, Desarrolladora desarrolladora, Genero genero) {
        this.nombre = nombre;
        this.añoSalida = añoSalida;
        this.precio = precio;
        this.desarrolladora = desarrolladora;
        this.genero = genero;
        this.plataformas = new ArrayList<>();
        this.estado = "sin empezar";
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAñoSalida() {
        return añoSalida;
    }

    public void setAñoSalida(LocalDate añoSalida) {
        this.añoSalida = añoSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDuracionMedia() {
        return duracionMedia;
    }

    public void setDuracionMedia(String duracionMedia) {
        this.duracionMedia = duracionMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Desarrolladora getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(Desarrolladora desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }

    // Métodos auxiliares
    public void agregarPlataforma(Plataforma plataforma) {
        if (!this.plataformas.contains(plataforma)) {
            this.plataformas.add(plataforma);
        }
    }

    public void eliminarPlataforma(Plataforma plataforma) {
        this.plataformas.remove(plataforma);
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", añoSalida=" + añoSalida +
                ", precio=" + precio +
                ", duracionMedia='" + duracionMedia + '\'' +
                ", notaMedia=" + notaMedia +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", estado='" + estado + '\'' +
                ", desarrolladora='" + (desarrolladora != null ? desarrolladora.getNombre() : "N/A") + '\'' +
                ", genero='" + (genero != null ? genero.getNombre() : "N/A") + '\'' +
                ", plataformas=" + plataformas.size() +
                '}';
    }
}
