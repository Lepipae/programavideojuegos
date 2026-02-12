package org.palomafp.programavideojuegos;

import java.time.LocalDate;

/**
 * Clase DAO que proporciona datos iniciales del modelo
 */
public class DatosDAO {
    
    /**
     * Devuelve una primera instancia del modelo con datos de ejemplo
     * @return Usuario con videojuegos y plataformas
     */
    public static Usuario obtenerPrimeraInstancia() {
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
        
        return usuario;
    }
}
