package org.palomafp.programavideojuegos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit tests for DatosDAO class using JUnit Jupiter
 */
@DisplayName("DatosDAO Tests")
public class DatosDAOTest {

    private Usuario usuario;
    private DatosDAO datosDAO;

    @BeforeEach
    public void setUp() {
        datosDAO = new DatosDAO();
        usuario = datosDAO.getUsuarioPorCodigo(1);
    }

    @Test
    @DisplayName("Should obtain first instance not null")
    public void testObtenerPrimeraInstanciaNotNull() {
        assertNotNull(usuario, "Usuario should not be null");
    }

    @Test
    @DisplayName("Should create user with correct id")
    public void testUsuarioCodigoCorreto() {
        assertEquals(1, usuario.getCodigo(), "User code should be 1");
    }

    @Test
    @DisplayName("Should create user with correct name")
    public void testUsuarioNombreCorreto() {
        assertEquals("GamerMaster", usuario.getNombreUsuario(), "User name should be GamerMaster");
    }

    @Test
    @DisplayName("Should have videogames")
    public void testUsuarioTieneVideojuegos() {
        assertNotNull(usuario.getVideojuegos(), "Videogames list should not be null");
        assertFalse(usuario.getVideojuegos().isEmpty(), "User should have at least one videogame");
    }

    @Test
    @DisplayName("Should have platforms")
    public void testUsuarioTienePlataformas() {
        assertNotNull(usuario.getPlataformas(), "Platforms list should not be null");
        assertFalse(usuario.getPlataformas().isEmpty(), "User should have at least one platform");
    }

    @Test
    @DisplayName("Should have The Witcher 3 videogame")
    public void testVideojuegoTheWitcher3() {
        assertTrue(usuario.getVideojuegos().size() >= 1, "User should have at least one videogame");
        
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("The Witcher 3", videojuego.getNombre(), "Videogame name should be The Witcher 3");
    }

    @Test
    @DisplayName("Should have correct videogame price")
    public void testVideojuegoPrecio() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals(39.99, videojuego.getPrecio(), 0.01, "Price should be 39.99");
    }

    @Test
    @DisplayName("Should have correct videogame rating")
    public void testVideojuegoNotaMedia() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals(9.3, videojuego.getNotaMedia(), 0.01, "Rating should be 9.3");
    }

    @Test
    @DisplayName("Should have correct videogame duration")
    public void testVideojuegoDuracion() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("50-100 horas", videojuego.getDuracionMedia(), "Duration should be 50-100 horas");
    }

    @Test
    @DisplayName("Should have correct videogame description")
    public void testVideojuegoDescripcion() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("Un épico RPG de fantasía oscura con un mundo abierto inmersivo", 
                     videojuego.getDescripcionCorta(), 
                     "Description should match");
    }

    @Test
    @DisplayName("Should have correct videogame status")
    public void testVideojuegoEstado() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("completado", videojuego.getEstado(), "Status should be completado");
    }

    @Test
    @DisplayName("Should have RPG genre")
    public void testVideojuegoGenero() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertNotNull(videojuego.getGenero(), "Genre should not be null");
        assertEquals("RPG", videojuego.getGenero().getNombre(), "Genre should be RPG");
    }

    @Test
    @DisplayName("Should have developer")
    public void testVideojuegoDesarrolladora() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertNotNull(videojuego.getDesarrolladora(), "Developer should not be null");
        assertEquals("Entwickler Studio", videojuego.getDesarrolladora().getNombre(), 
                     "Developer name should be Entwickler Studio");
    }

    @Test
    @DisplayName("Should have developer from Germany")
    public void testDesarrolladoraPais() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("Alemania", videojuego.getDesarrolladora().getUbicacion(), "Country should be Alemania");
    }

    @Test
    @DisplayName("Should have PC platform")
    public void testTienePlataformaPC() {
        assertTrue(usuario.getPlataformas().size() >= 1, "User should have at least one platform");
        
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("PC", plataforma.getNombre(), "Platform should be PC");
    }

    @Test
    @DisplayName("Should have videogame with platform")
    public void testVideojuegoTienePlataforma() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertFalse(videojuego.getPlataformas().isEmpty(), "Videogame should have at least one platform");
    }

    @Test
    @DisplayName("Should have correct platform name")
    public void testPlataformaNombre() {
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("PC", plataforma.getNombre(), "Platform name should be PC");
    }

    @Test
    @DisplayName("Should have correct platform category")
    public void testPlataformaCategoria() {
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("Moderna", plataforma.getGeneracion(), "Platform generation should be Moderna");
    }

    @Test
    @DisplayName("Should have correct platform manufacturer")
    public void testPlataformaFabricante() {
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("Valve", plataforma.getFabricante(), "Manufacturer should be Valve");
    }

    @Test
    @DisplayName("Should have multiple method calls result consistency")
    public void testConsistenciaMultiplasLlamadas() {
        Usuario usuario1 = datosDAO.getUsuarioPorCodigo(1);
        Usuario usuario2 = datosDAO.getUsuarioPorCodigo(1);
        
        assertEquals(usuario1.getNombreUsuario(), usuario2.getNombreUsuario(), 
                     "Multiple calls should return consistent data");
        assertEquals(usuario1.getVideojuegos().get(0).getNombre(), 
                     usuario2.getVideojuegos().get(0).getNombre(), 
                     "Videogame names should match across multiple calls");
    }
}
