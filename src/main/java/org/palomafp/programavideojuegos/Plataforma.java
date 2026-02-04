package org.palomafp.programavideojuegos;

import java.util.Date;

public class Plataforma {
    private String nombre;
    private String generacion;
    private String fabricante;
    private Date añoSalida;

    // Constructor vacío
    public Plataforma() {
    }

    // Constructor con parámetros principales
    public Plataforma(String nombre, String generacion, String fabricante) {
        this.nombre = nombre;
        this.generacion = generacion;
        this.fabricante = fabricante;
    }

    // Constructor con todos los parámetros
    public Plataforma(String nombre, String generacion, String fabricante, Date añoSalida) {
        this.nombre = nombre;
        this.generacion = generacion;
        this.fabricante = fabricante;
        this.añoSalida = añoSalida;
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

    public Date getAñoSalida() {
        return añoSalida;
    }

    public void setAñoSalida(Date añoSalida) {
        this.añoSalida = añoSalida;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "nombre='" + nombre + '\'' +
                ", generacion='" + generacion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
