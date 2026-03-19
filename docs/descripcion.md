# Programa de Videojuegos
## Clases:
* **Usuario**
* **Videojuego**
* **Desarrolladora**
* **Genero**
* **Plataforma**
## Relaciones y datos:
Este es un programa para que usuarios gestionen su progreso en diferentes videojuegos, cada **usuario** tendra un codigo, un nombre de usuario y su listado de videojuegos, plataformas de salida, los **videojuegos** tendran su estado (sin empezar, en progreso, completado), nombre, año de salida, precio, genero, su desarrolladora, duracion media, nota media del juego y una descripcion corta, la **desarrolladora** tendra el nombre, ubicacion, listado de videojuegos y descripcion corta, la clase **genero** tendra el nombre del genero, una descripcion corta, y listado de juegos que sean de este genero, la clase **plataforma** tendra su nombre, su generacion, año de salida y su fabricante.
## Diagrama de clase 
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