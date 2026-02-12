package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Desarrolladora {
    private String nombre;
    private String ubicacion;
    private String descripcionCorta;
    private List<Videojuego> videojuegos;
    private LocalDate añoSalida;

    // Constructor vacío
    public Desarrolladora() {
        this.videojuegos = new ArrayList<>();
    }

    // Constructor con parámetros principales
    public Desarrolladora(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.videojuegos = new ArrayList<>();
    }

    // Constructor con todos los parámetros
    public Desarrolladora(String nombre, String ubicacion, String descripcionCorta, LocalDate añoSalida) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcionCorta = descripcionCorta;
        this.añoSalida = añoSalida;
        this.videojuegos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public LocalDate getAñoSalida() {
        return añoSalida;
    }

    public void setAñoSalida(LocalDate añoSalida) {
        this.añoSalida = añoSalida;
    }

    // Métodos auxiliares
    public void agregarVideojuego(Videojuego videojuego) {
        if (!this.videojuegos.contains(videojuego)) {
            this.videojuegos.add(videojuego);
        }
    }

    public void eliminarVideojuego(Videojuego videojuego) {
        this.videojuegos.remove(videojuego);
    }

    @Override
    public String toString() {
        return "Desarrolladora{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", videojuegos=" + videojuegos.size() +
                '}';
    }
}
