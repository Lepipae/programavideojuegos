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
    /**
     * Devuelve el nombre del videojuego
     * @return  Nombre del videojuego
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del videojuego
     * @param nombre    Nombre del videojuego
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el año de salida del videojuego
     * @return  Año de salida del videojuego
     */
    public LocalDate getAñoSalida() {
        return añoSalida;
    }

    /**
     * Establece el año de salida del videojuego
     * @param añoSalida    Año de salida del videojuego
     */
    public void setAñoSalida(LocalDate añoSalida) {
        this.añoSalida = añoSalida;
    }

    /**
     * Devuelve el precio del videojuego
     * @return  Precio del videojuego
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del videojuego
     * @param precio    Precio del videojuego
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la duracion media del videojuego
     * @return  Duracion media del videojuego
     */
    public String getDuracionMedia() {
        return duracionMedia;
    }

    /**
     * Establece la duracion media del videojuego
     * @param duracionMedia    Duracion media del videojuego
     */
    public void setDuracionMedia(String duracionMedia) {
        this.duracionMedia = duracionMedia;
    }

    /**
     * Devuelve la nota media del videojuego
     * @return  Nota media del videojuego
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * Establece la nota media del videojuego
     * @param notaMedia    Nota media del videojuego
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     * Devuelve la descripcion corta del videojuego
     * @return  Descripcion corta del videojuego
     */
    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    /**
     * Establece la descripcion corta del videojuego
     * @param descripcionCorta    Descripcion corta del videojuego
     */
    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    /**
     * Devuelve el estado del videojuego
     * @return  Estado del videojuego
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del videojuego
     * @param estado    Estado del videojuego
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve la desarrolladora del videojuego
     * @return  Desarrolladora del videojuego
     */
    public Desarrolladora getDesarrolladora() {
        return desarrolladora;
    }

    /**
     * Establece la desarrolladora del videojuego
     * @param desarrolladora    Desarrolladora del videojuego
     */
    public void setDesarrolladora(Desarrolladora desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    /**
     * Devuelve el genero del videojuego
     * @return  Genero del videojuego
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Establece el genero del videojuego
     * @param genero    Genero del videojuego
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Devuelve la lista de plataformas del videojuego
     * @return  Lista de plataformas
     */
    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    /**
     * Establece la lista de plataformas del videojuego
     * @param plataformas    Lista de plataformas
     */
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
