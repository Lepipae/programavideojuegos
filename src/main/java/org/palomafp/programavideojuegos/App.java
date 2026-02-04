package org.palomafp.programavideojuegos;

/**
 * Aplicación principal para gestionar videojuegos
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Obtener primera instancia de datos
        Usuario usuario = DatosDAO.obtenerPrimeraInstancia();
        
        // Mostrar datos del usuario
        System.out.println("=== INFORMACIÓN DEL USUARIO ===");
        System.out.println(usuario);
        System.out.println();
        
        // Mostrar plataformas
        System.out.println("=== PLATAFORMAS ===");
        for (Plataforma plataforma : usuario.getPlataformas()) {
            System.out.println("- " + plataforma.getNombre() + " (" + plataforma.getFabricante() + ")");
        }
        System.out.println();
        
        // Mostrar videojuegos
        System.out.println("=== VIDEOJUEGOS ===");
        for (Videojuego juego : usuario.getVideojuegos()) {
            System.out.println("Nombre: " + juego.getNombre());
            System.out.println("Género: " + juego.getGenero().getNombre());
            System.out.println("Desarrolladora: " + juego.getDesarrolladora().getNombre());
            System.out.println("Precio: $" + juego.getPrecio());
            System.out.println("Duración Media: " + juego.getDuracionMedia());
            System.out.println("Nota Media: " + juego.getNotaMedia() + "/10");
            System.out.println("Descripción: " + juego.getDescripcionCorta());
            System.out.println("Estado: " + juego.getEstado());
            System.out.println();
        }
    }
}
