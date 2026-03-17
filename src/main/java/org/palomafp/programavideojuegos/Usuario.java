package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que define a un usuario que tiene un nombre, codigo y videojuegos y plataformas
 * @author lepipae
 */
public class Usuario {
    private int codigo;
    private String nombreUsuario;
    private List<Videojuego> videojuegos;
    private List<Plataforma> plataformas;

    /**
     * Constructor por defecto
     */
    public Usuario() {
        this.videojuegos = new ArrayList<>();
        this.plataformas = new ArrayList<>();
    }

    /**
     * Constructor con parametros
     * @param codigo    Codigo del usuario
     * @param nombreUsuario Nombre de usuario
     */
    public Usuario(int codigo, String nombreUsuario) {
        setCodigo(codigo);
        setNombreUsuario(nombreUsuario);
        this.videojuegos = new ArrayList<>();
        this.plataformas = new ArrayList<>();
    }

    /**
     * Devuelve el código del usuario
     * @return  Código del usuario
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del usuario
     * @param codigo    Código del usuario
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve el nombre de usuario
     * @return  Nombre del usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre de usuario
     * @param nombreUsuario    Nombre del usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Devuelve la lista de videojuegos del usuario
     * @return  Lista de videojuegos
     */
    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    /**
     * Devuelve la lista de plataformas del usuario
     * @return  Lista de plataformas
     */
    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    /**
     * Añade un videojuego a la lista de videojuegos del usuario
     * @param videojuego Videojuego a añadir
     */
    public void agregarVideojuego(Videojuego videojuego) {
        if (!this.videojuegos.contains(videojuego)) {
            this.videojuegos.add(videojuego);
        }
    }

    /**
     * Elimina un videojuego de la lista de videojuegos del usuario
     * @param videojuego	Videojuego a borrar
     */
    public void eliminarVideojuego(Videojuego videojuego) {
        this.videojuegos.remove(videojuego);
    }

    /**
     * Añade una plataforma a la lista de plataformas del usuario
     * @param plataforma	Plataforma a añadir
     */
    public void agregarPlataforma(Plataforma plataforma) {
        if (!this.plataformas.contains(plataforma)) {
            this.plataformas.add(plataforma);
        }
    }

    /**
     * Elimina una plataforma de la lista de plataformas del usuario
      * @param plataforma	Plataforma a eliminar
      */
    public void eliminarPlataforma(Plataforma plataforma) {
        this.plataformas.remove(plataforma);
    }

    /**
     * Override del metodo toString para devolver la informacion del usuario
      * @return  Informacion del usuario
     */
    @Override
    public String toString() {
        return "Usuario: " +
                "codigo: " + codigo +
                ", nombreUsuario: '" + nombreUsuario + '\'' +
                ", videojuegos: " + videojuegos.size() +
                ", plataformas: " + plataformas.size() +
                '}';
    }
}
