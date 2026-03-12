package org.palomafp.programavideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.Math;


/**
 * Clase DAO que proporciona datos iniciales del modelo
 */
public class UsuariosDAO {
    
    ArrayList<Usuario> usuarios = null;

    public UsuariosDAO() {
        this.usuarios = new ArrayList<>();
        obtenerPrimeraInstancia();
    }

    /**
     * Devuelve una primera instancia del modelo con datos de ejemplo
     * @return Usuario con videojuegos y plataformas
     */
    public void obtenerPrimeraInstancia() {
        // Crear plataforma
        Plataforma pc = new Plataforma("PC", "Moderna", "Valve", LocalDate.of(2023, 1, 1));
        
        // Crear desarrolladora
        Desarrolladora entwicklerStudio = new Desarrolladora("Entwickler Studio", "Alemania", "Estudio de desarrollo independiente", LocalDate.of(2015, 1, 1));
        
        // Crear género
        Genero rpg = new Genero("RPG", "Rol Playing Game - Juegos de rol donde controlas el destino del personaje");
        
        // Crear videojuego
        Videojuego videojuego = new Videojuego("The Witcher 3", LocalDate.of(2015, 5, 19), 39.99, entwicklerStudio, rpg);
        videojuego.setDuracionMedia("50-100 horas");
        videojuego.setNotaMedia(9.3);
        videojuego.setDescripcionCorta("Un épico RPG de fantasía oscura con un mundo abierto inmersivo");
        videojuego.setEstado("completado");
        videojuego.agregarPlataforma(pc);
        
        // Crear usuario
        Usuario usuario = new Usuario(1, "GamerMaster");
        usuario.agregarVideojuego(videojuego);
        usuario.agregarPlataforma(pc);
        this.usuarios.add(usuario);

        // Usuario2
        Plataforma ps5 = new Plataforma("PlayStation 5", "9ª", "Sony", LocalDate.of(2020, 11, 12));
        Desarrolladora naughtyDog = new Desarrolladora("Naughty Dog", "Estados Unidos", "Desarrolladora de videojuegos de alta calidad", LocalDate.of(1984, 9, 27));
        Genero aventura = new Genero("Aventura", "Juegos enfocados en la exploración y la narrativa");
        Videojuego videojuego2 = new Videojuego("The Last of Us Part II", LocalDate.of(2020, 6, 19), 59.99, naughtyDog, aventura);
        videojuego2.setDuracionMedia("20-30 horas");
        videojuego2.setNotaMedia(9.0);
        videojuego2.setDescripcionCorta("Una emotiva aventura post-apocalíptica con una narrativa impactante");
        videojuego2.setEstado("en progreso");
        videojuego2.agregarPlataforma(ps5);
        Usuario usuario2 = new Usuario(2, "AdventureSeeker");
        usuario2.agregarVideojuego(videojuego2);
        usuario2.agregarPlataforma(ps5);
        this.usuarios.add(usuario2);

        // Usuario3
        Plataforma xbox = new Plataforma("Xbox Series X", "9ª", "Microsoft", LocalDate.of(2020, 11, 10));
        Desarrolladora cdProjekt = new Desarrolladora("CD Projekt Red", "Polonia", "Desarrolladora de videojuegos de alta calidad", LocalDate.of(2002, 2, 1));
        Genero accion = new Genero("Acción", "Juegos enfocados en combate y adrenalina");
        Videojuego videojuego3 = new Videojuego("Cyberpunk 2077", LocalDate.of(2020, 12, 10), 49.99, cdProjekt, accion);
        videojuego3.setDuracionMedia("40-60 horas");
        videojuego3.setNotaMedia(8.5);
        videojuego3.setDescripcionCorta("Un juego de rol de ciencia ficción ambientado en un futuro distópico");
        videojuego3.setEstado("en progreso");
        videojuego3.agregarPlataforma(xbox);
        Usuario usuario3 = new Usuario(3, "CyberpunkFan");
        usuario3.agregarVideojuego(videojuego3);
        usuario3.agregarPlataforma(xbox);
        this.usuarios.add(usuario3);
    }

    /**
     * Devuelve la lista de usuarios por defecto entera
     * @return  Lista de usuarios entera
     */
    public ArrayList<Usuario> getAllUsuarios() {
        return usuarios;
    }

    /**
     * Devuelve un usuario identificado por su codigo
     * @param codigo
     * @return
     */
    public Usuario getUsuarioPorCodigo(int codigo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario
    }


    public Usuario getUsuarioRandom() throws IllegalStateException {
        if (usuarios == null || usuarios.isEmpty()) {
            throw new IllegalStateException("No hay usuarios disponibles");
        }
        int indice = (int)(Math.random()*usuarios.size());
        return usuarios.get(indice);
    }
}
