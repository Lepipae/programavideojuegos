package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Desarrolladora {
    private String nombre;
    private String ubicacion;
    private String descripcionCorta;
    private List<Videojuego> videojuegos;
    private LocalDate añoFundacion;

    /**
     * Constructor con parametros base
     * @param nombre    Nombre de la desarrolladora
     * @param ubicacion Ubicacion de la desarrolladora
     */
    public Desarrolladora(String nombre, String ubicacion) {
        setNombre(nombre);
        setUbicacion(ubicacion);
        this.videojuegos = new ArrayList<>();
    }

    /**
     * Constructor con todos los datos
     * @param nombre    Nombre de la desarrolladora
     * @param ubicacion Ubicacion de la desarrolladora
     * @param descripcionCorta  Descripcion corta de la desarrolladora
     * @param añoFundacion El año en el que se fundo la compañia
     */
    public Desarrolladora(String nombre, String ubicacion, String descripcionCorta, LocalDate añoFundacion) {
        setNombre(nombre);
        setUbicacion(ubicacion);
        setDescripcionCorta(descripcionCorta);
        setAñoFundacion(añoFundacion);
        this.videojuegos = new ArrayList<>();
    }

    /**
     * Devuelve el nombre de la desarrolladora
     * @return  Nombre de la desarrolladora
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la desarrolladora
     * @param nombre    Nombre de la desarrolladora
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la ubicacion de la desarrolladora
     * @return  Ubicacion de la desarrolladora
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicacion de la desarrolladora
     * @param ubicacion    Ubicacion de la desarrolladora
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Devuelve la descripción corta de la desarrolladora
     * @return  Descripción corta de la desarrolladora
     */
    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    /**
     * Establece la descripción corta de la desarrolladora
     * @param descripcionCorta    Descripción corta de la desarrolladora
     */
    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    /**
     * Devuelve la lista de videojuegos de la desarrolladora
     * @return  Lista de videojuegos
     */
    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    /**
     * Devuelve el año de fundación de la desarrolladora
     * @return  Año de fundación de la desarrolladora
     */
    public LocalDate getAñoFundacion() {
        return añoFundacion;
    }

    /**
     * Establece el año de fundación de la desarrolladora
     * @param añoSalida    Año de fundación de la desarrolladora
     */
    public void setAñoFundacion(LocalDate añoSalida) {
        this.añoFundacion = añoSalida;
    }

    /**
     * Agrega un videojuego a la lista de la desarrolladora
     * Si el videojuego esta en la lista no se agrega
     * @param videojuego    Videojuego a añadir
     */
    public void agregarVideojuego(Videojuego videojuego) {
        if (!this.videojuegos.contains(videojuego)) {
            this.videojuegos.add(videojuego);
        }
    }
    /**
     * Elimina un videojuego de la lista de la desarrolladora
     * @param videojuego    Videojuego a eliminar
     */
    public void eliminarVideojuego(Videojuego videojuego) {
        this.videojuegos.remove(videojuego);
    }

    /**
     * Override del metodo toString para devolver la informacion de la desarrolladora
     */
    @Override
    public String toString() {
        return "Desarrolladora{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", añoSalida=" + añoFundacion +
                ", videojuegos=" + videojuegos.size() +
                '}';
    }
}
