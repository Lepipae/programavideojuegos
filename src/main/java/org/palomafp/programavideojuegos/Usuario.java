package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int codigo;
    private String nombreUsuario;
    private List<Videojuego> videojuegos;
    private List<Plataforma> plataformas;

    // Constructor vacío
    public Usuario() {
        this.videojuegos = new ArrayList<>();
        this.plataformas = new ArrayList<>();
    }

    // Constructor con parámetros
    public Usuario(int codigo, String nombreUsuario) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.videojuegos = new ArrayList<>();
        this.plataformas = new ArrayList<>();
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
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
        return "Usuario{" +
                "codigo=" + codigo +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", videojuegos=" + videojuegos.size() +
                ", plataformas=" + plataformas.size() +
                '}';
    }
}
