package org.palomafp.programavideojuegos;

import java.time.LocalDate;

/**
 * Clase que define una plataforma
 * Las plataformas tienen un nombre son de una generacion tienen un fabricante y año de salida
 * @author  Andrés López de la Vía
 */
public class Plataforma {
    private String nombre;
    private String generacion;
    private String fabricante;
    private LocalDate añoSalida;


    /**
     * Constructor con todos los parametros
     * @param nombre    Nombre de la plataforma
     * @param generacion    Generacion a la que pertenece la plataforma
     * @param fabricante    Fabricante de la plataforma
     * @param añoSalida     Año de salida de la plataforma
     */
    public Plataforma(String nombre, String generacion, String fabricante, LocalDate añoSalida) {
        setNombre(nombre);
        setGeneracion(generacion);
        setFabricante(fabricante);
        setAñoSalida(añoSalida);
    }

    // Getters y Setters
    /**
     * Devuelve el nombre de la plataforma
     * @return  Nombre de la plataforma
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la plataforma
     * @param nombre    Nombre de la plataforma
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la generacion de la plataforma
     * @return  Generacion de la plataforma
     */
    public String getGeneracion() {
        return generacion;
    }

    /**
     * Establece la generacion de la plataforma
     * @param generacion    Generacion de la plataforma
     */
    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    /**
     * Devuelve el fabricante de la plataforma
     * @return  Fabricante de la plataforma
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Establece el fabricante de la plataforma
     * @param fabricante    Fabricante de la plataforma
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Devuelve el año de salida de la plataforma
     * @return  Año de salida de la plataforma
     */
    public LocalDate getAñoSalida() {
        return añoSalida;
    }

    /**
     * Establece el año de salida de la plataforma
     * @param añoSalida    Año de salida de la plataforma
     */
    public void setAñoSalida(LocalDate añoSalida) {
        this.añoSalida = añoSalida;
    }

    /**
     * Override del metodo toString para devolver la informacion de la plataforma
      * @return  Informacion de la plataforma
      */
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
