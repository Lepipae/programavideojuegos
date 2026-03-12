package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que define un genero de videojuegos
 * Los generos tendran un nombre una descripcion y la lista de juegos que son de ese genero
 * @author  Andrés López de la Vía
 */
public class Genero {
    private String nombre;
    private String descripcion;
    private List<Videojuego> juegos;

    /**
     * Constructor con parametros por defecto
     * @param nombre    Nombre del genero
     * @param descripcion   Descripcion del genero
     */
    public Genero(String nombre, String descripcion) {
        setNombre(nombre);
        setDescripcion(descripcion);
        this.juegos = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del genero
     * @return  Nombre del genero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del genero
     * @param nombre    Nombre del genero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la descripcion del genero
     * @return  Descripcion del genero
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del genero
     * @param descripcion    Descripcion del genero
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve la lista de juegos del genero
     * @return  Lista de juegos
     */
    public List<Videojuego> getJuegos() {
        return juegos;
    }

    /**
     * Agrega un videojuego a la lista del genero
     * @param juego Videojuego a agregar
     */
    public void agregarJuego(Videojuego juego) {
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
        }
    }

    /**
     * Elimina un videojuego de la lista
     * @param juego Juego a borrar
     */
    public void eliminarJuego(Videojuego juego) {
        this.juegos.remove(juego);
    }

    /**
     * Override del metodo toString para devolver la informacion del genero
      * @return  Informacion del genero
     */
    @Override
    public String toString() {
        return "Genero{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", juegos=" + juegos.size() +
                '}';
    }
}
