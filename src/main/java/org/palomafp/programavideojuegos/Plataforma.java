package org.palomafp.programavideojuegos;

import java.time.LocalDate;

public class Plataforma {
    private String nombre;
    private String generacion;
    private String fabricante;
    private LocalDate añoSalida;


    // Constructor con todos los parámetros
    public Plataforma(String nombre, String generacion, String fabricante, LocalDate añoSalida) {
        setNombre(nombre);
        setGeneracion(generacion);
        setFabricante(fabricante);
        setAñoSalida(añoSalida);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getAñoSalida() {
        return añoSalida;
    }

    public void setAñoSalida(LocalDate añoSalida) {
        this.añoSalida = añoSalida;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "nombre='" + nombre + '\'' +
                ", generacion='" + generacion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", añoSalida=" + añoSalida +
                '}';
    }
}
