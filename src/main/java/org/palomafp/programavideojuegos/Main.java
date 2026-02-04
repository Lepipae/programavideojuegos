package org.palomafp.programavideojuegos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Programa de Gestión de Videojuegos ===\n");

        // Crear plataformas
        Plataforma ps5 = new Plataforma("PlayStation 5", "9ª", "Sony");
        Plataforma xbox = new Plataforma("Xbox Series X", "9ª", "Microsoft");
        Plataforma pc = new Plataforma("PC", "N/A", "Múltiples");

        System.out.println("Plataformas creadas:");
        System.out.println(ps5);
        System.out.println(xbox);
        System.out.println(pc + "\n");

        // Crear género
        Genero accion = new Genero("Acción", "Juegos enfocados en combate y adrenalina");
        System.out.println("Género creado: " + accion + "\n");

        // Crear desarrolladora
        Desarrolladora rockstar = new Desarrolladora("Rockstar Games", "Nueva York");
        rockstar.setDescripcionCorta("Desarrolladora de videojuegos de alta calidad");
        System.out.println("Desarrolladora creada: " + rockstar + "\n");

        // Crear videojuego
        Videojuego gta = new Videojuego("Grand Theft Auto VI", new java.util.Date(), 69.99, rockstar, accion);
        gta.setDuracionMedia("100+ horas");
        gta.setNotaMedia(9.5);
        gta.setDescripcionCorta("Un épico mundo abierto de crimen y aventura");
        gta.agregarPlataforma(ps5);
        gta.agregarPlataforma(xbox);

        System.out.println("Videojuego creado: " + gta + "\n");

        // Crear usuario
        Usuario usuario1 = new Usuario(1, "JugadorPro");
        usuario1.agregarVideojuego(gta);
        usuario1.agregarPlataforma(ps5);

        System.out.println("Usuario creado: " + usuario1 + "\n");

        // Mostrar información del usuario
        System.out.println("=== Información del Usuario ===");
        System.out.println("Código: " + usuario1.getCodigo());
        System.out.println("Nombre de usuario: " + usuario1.getNombreUsuario());
        System.out.println("Videojuegos: " + usuario1.getVideojuegos().size());
        System.out.println("Plataformas: " + usuario1.getPlataformas().size());
    }
}
