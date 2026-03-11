package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.List;

public class Genero {
    private String nombre;
    private String descripcion;
    private List<Videojuego> juegos;

    // Constructor con parámetros principales
    public Genero(String nombre, String descripcion) {
        setNombre(nombre);
        setDescripcion(descripcion);
        this.juegos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Videojuego> getJuegos() {
        return juegos;
    }

    // Métodos auxiliares
    public void agregarJuego(Videojuego juego) {
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
        }
    }

    public void eliminarJuego(Videojuego juego) {
        this.juegos.remove(juego);
    }

    @Override
    public String toString() {
        return "Genero{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", juegos=" + juegos.size() +
                '}';
    }
}
