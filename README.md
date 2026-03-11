# PROGRAMA VIDEOJUEGOS
Este es un programa en java que simula la gestion de una pequeña base de datos de usuarios con sus plataformas y videojuegos, el objetivo es terminar con una app que funcione como un tracker de los juegos de un usuario.

```mermaid
classDiagram

    Usuario "0-n" --> "0-n" Videojuego
    Usuario "0-n" --> "0-n" Plataforma
    Videojuego "0-n" --o "1-n" Plataforma
    Videojuego "0-n" <--o "1" Genero
    Videojuego "0-n" <--o "1" Desarrolladora

class Usuario {
    -int : codigo
    -String : nombreUsuario
    -List<Videojuego> : videojuegos
    -List<Plataforma> : plataformas
}

class Videojuego {
    -String : nombre
    -Date : añoSalida
    -double : precio
    -String : duracionMedia
    -double : notaMedia
    -String : descripcionCorta
    -Desarrolladora : desarrolladora
    -Genero : genero
    -List<Plataforma> : plataformas
}

class Desarrolladora {
    -String : nombre
    -int : generacion
    -String : fabricante
    -añoSalida : añoSalida
}

class Genero {
    -String : nombre
    -String : descripcion
    -List<Videojuego> : juegos
}

class Plataforma {
    -String : nombre
    -String : generacion
    -String : fabricante
    -Date : añoSalida
}
```