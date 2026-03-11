package org.palomafp.programavideojuegos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Pruebas unitarias para la clase DatosDAO usando JUnit Jupiter
 */
@DisplayName("Pruebas de DatosDAO")
public class DatosDAOTest {

    private Usuario usuario;
    private UsuariosDAO datosDAO;

    @BeforeEach
    public void setUp() {
        datosDAO = new UsuariosDAO();
        usuario = datosDAO.getUsuarioPorCodigo(1);
    }

    @Test
    @DisplayName("Debe obtener la primera instancia no nula")
    public void testObtenerPrimeraInstanciaNotNull() {
        assertNotNull(usuario, "El usuario no debe ser nulo");
    }

    @Test
    @DisplayName("Debe crear usuario con identificación correcta")
    public void testUsuarioCodigoCorreto() {
        assertEquals(1, usuario.getCodigo(), "El código de usuario debe ser 1");
    }

    @Test
    @DisplayName("Debe crear usuario con nombre correcto")
    public void testUsuarioNombreCorreto() {
        assertEquals("GamerMaster", usuario.getNombreUsuario(), "El nombre de usuario debe ser GamerMaster");
    }

    @Test
    @DisplayName("Debe tener videojuegos")
    public void testUsuarioTieneVideojuegos() {
        assertNotNull(usuario.getVideojuegos(), "La lista de videojuegos no debe ser nula");
        assertFalse(usuario.getVideojuegos().isEmpty(), "El usuario debe tener al menos un videojuego");
    }

    @Test
    @DisplayName("Debe tener plataformas")
    public void testUsuarioTienePlataformas() {
        assertNotNull(usuario.getPlataformas(), "La lista de plataformas no debe ser nula");
        assertFalse(usuario.getPlataformas().isEmpty(), "El usuario debe tener al menos una plataforma");
    }

    @Test
    @DisplayName("Debe tener el videojuego The Witcher 3")
    public void testVideojuegoTheWitcher3() {
        assertTrue(usuario.getVideojuegos().size() >= 1, "El usuario debe tener al menos un videojuego");
        
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("The Witcher 3", videojuego.getNombre(), "El nombre del videojuego debe ser The Witcher 3");
    }

    @Test
    @DisplayName("Debe tener precio de videojuego correcto")
    public void testVideojuegoPrecio() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals(39.99, videojuego.getPrecio(), 0.01, "El precio debe ser 39.99");
    }

    @Test
    @DisplayName("Debe tener calificación de videojuego correcta")
    public void testVideojuegoNotaMedia() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals(9.3, videojuego.getNotaMedia(), 0.01, "La calificación debe ser 9.3");
    }

    @Test
    @DisplayName("Debe tener duración de videojuego correcta")
    public void testVideojuegoDuracion() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("50-100 horas", videojuego.getDuracionMedia(), "La duración debe ser 50-100 horas");
    }

    @Test
    @DisplayName("Debe tener descripción de videojuego correcta")
    public void testVideojuegoDescripcion() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("Un épico RPG de fantasía oscura con un mundo abierto inmersivo", 
                     videojuego.getDescripcionCorta(), 
                     "La descripción debe coincidir");
    }

    @Test
    @DisplayName("Debe tener estado de videojuego correcto")
    public void testVideojuegoEstado() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("completado", videojuego.getEstado(), "El estado debe ser completado");
    }

    @Test
    @DisplayName("Debe tener género RPG")
    public void testVideojuegoGenero() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertNotNull(videojuego.getGenero(), "El género no debe ser nulo");
        assertEquals("RPG", videojuego.getGenero().getNombre(), "El género debe ser RPG");
    }

    @Test
    @DisplayName("Debe tener desarrolladora")
    public void testVideojuegoDesarrolladora() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertNotNull(videojuego.getDesarrolladora(), "La desarrolladora no debe ser nula");
        assertEquals("Entwickler Studio", videojuego.getDesarrolladora().getNombre(), 
                     "El nombre de la desarrolladora debe ser Entwickler Studio");
    }

    @Test
    @DisplayName("Debe tener desarrolladora de Alemania")
    public void testDesarrolladoraPais() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertEquals("Alemania", videojuego.getDesarrolladora().getUbicacion(), "El país debe ser Alemania");
    }

    @Test
    @DisplayName("Debe tener plataforma PC")
    public void testTienePlataformaPC() {
        assertTrue(usuario.getPlataformas().size() >= 1, "El usuario debe tener al menos una plataforma");
        
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("PC", plataforma.getNombre(), "La plataforma debe ser PC");
    }

    @Test
    @DisplayName("Debe tener videojuego con plataforma")
    public void testVideojuegoTienePlataforma() {
        Videojuego videojuego = usuario.getVideojuegos().get(0);
        assertFalse(videojuego.getPlataformas().isEmpty(), "El videojuego debe tener al menos una plataforma");
    }

    @Test
    @DisplayName("Debe tener nombre de plataforma correcto")
    public void testPlataformaNombre() {
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("PC", plataforma.getNombre(), "El nombre de la plataforma debe ser PC");
    }

    @Test
    @DisplayName("Debe tener categoría de plataforma correcta")
    public void testPlataformaCategoria() {
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("Moderna", plataforma.getGeneracion(), "La generación de la plataforma debe ser Moderna");
    }

    @Test
    @DisplayName("Debe tener fabricante de plataforma correcto")
    public void testPlataformaFabricante() {
        Plataforma plataforma = usuario.getPlataformas().get(0);
        assertEquals("Valve", plataforma.getFabricante(), "El fabricante debe ser Valve");
    }

    @Test
    @DisplayName("Debe tener consistencia en múltiples llamadas")
    public void testConsistenciaMultiplasLlamadas() {
        Usuario usuario1 = datosDAO.getUsuarioPorCodigo(1);
        Usuario usuario2 = datosDAO.getUsuarioPorCodigo(1);
        
        assertEquals(usuario1.getNombreUsuario(), usuario2.getNombreUsuario(), 
                     "Múltiples llamadas deben devolver datos consistentes");
        assertEquals(usuario1.getVideojuegos().get(0).getNombre(), 
                     usuario2.getVideojuegos().get(0).getNombre(), 
                     "Los nombres de videojuegos deben coincidir en múltiples llamadas");
    }

    // Pruebas para el método getUsuarios()
    @Test
    @DisplayName("Debe devolver la lista de todos los usuarios")
    public void testGetUsuarios() {
        assertNotNull(datosDAO.getAllUsuarios(), "La lista de usuarios no debe ser nula");
        assertFalse(datosDAO.getAllUsuarios().isEmpty(), "La lista de usuarios no debe estar vacía");
    }

    @Test
    @DisplayName("Debe devolver exactamente 3 usuarios")
    public void testGetUsuariosSize() {
        assertEquals(3, datosDAO.getAllUsuarios().size(), "Debe haber exactamente 3 usuarios");
    }

    @Test
    @DisplayName("Debe contener usuario con código 1")
    public void testGetUsuariosContainsCodigo1() {
        assertTrue(datosDAO.getAllUsuarios().stream().anyMatch(u -> u.getCodigo() == 1), 
                   "Debe contener usuario con código 1");
    }

    @Test
    @DisplayName("Debe contener usuario con código 2")
    public void testGetUsuariosContainsCodigo2() {
        assertTrue(datosDAO.getAllUsuarios().stream().anyMatch(u -> u.getCodigo() == 2), 
                   "Debe contener usuario con código 2");
    }

    @Test
    @DisplayName("Debe contener usuario con código 3")
    public void testGetUsuariosContainsCodigo3() {
        assertTrue(datosDAO.getAllUsuarios().stream().anyMatch(u -> u.getCodigo() == 3), 
                   "Debe contener usuario con código 3");
    }

    // Pruebas para el método getUsuarioPorCodigo(int codigo)
    @Test
    @DisplayName("Debe obtener usuario 1 por código")
    public void testGetUsuarioPorCodigo1() {
        Usuario user = datosDAO.getUsuarioPorCodigo(1);
        assertNotNull(user, "El usuario con código 1 no debe ser nulo");
        assertEquals(1, user.getCodigo(), "El código de usuario debe ser 1");
        assertEquals("GamerMaster", user.getNombreUsuario(), "El nombre de usuario 1 debe ser GamerMaster");
    }

    @Test
    @DisplayName("Debe obtener usuario 2 por código")
    public void testGetUsuarioPorCodigo2() {
        Usuario user = datosDAO.getUsuarioPorCodigo(2);
        assertNotNull(user, "El usuario con código 2 no debe ser nulo");
        assertEquals(2, user.getCodigo(), "El código de usuario debe ser 2");
        assertEquals("AdventureSeeker", user.getNombreUsuario(), "El nombre de usuario 2 debe ser AdventureSeeker");
    }

    @Test
    @DisplayName("Debe obtener usuario 3 por código")
    public void testGetUsuarioPorCodigo3() {
        Usuario user = datosDAO.getUsuarioPorCodigo(3);
        assertNotNull(user, "El usuario con código 3 no debe ser nulo");
        assertEquals(3, user.getCodigo(), "El código de usuario debe ser 3");
        assertEquals("CyberpunkFan", user.getNombreUsuario(), "El nombre de usuario 3 debe ser CyberpunkFan");
    }

    @Test
    @DisplayName("Debe devolver nulo para código de usuario inexistente")
    public void testGetUsuarioPorCodigoNoExistente() {
        Usuario user = datosDAO.getUsuarioPorCodigo(999);
        assertNull(user, "El usuario con código inexistente debe ser nulo");
    }

    @Test
    @DisplayName("Usuario 2 debe tener The Last of Us Part II")
    public void testUsuario2Videojuego() {
        Usuario user = datosDAO.getUsuarioPorCodigo(2);
        assertNotNull(user.getVideojuegos(), "El usuario 2 debe tener videojuegos");
        assertFalse(user.getVideojuegos().isEmpty(), "El usuario 2 debe tener al menos un videojuego");
        assertEquals("The Last of Us Part II", user.getVideojuegos().get(0).getNombre(), 
                     "El usuario 2 debe tener The Last of Us Part II");
    }

    @Test
    @DisplayName("Usuario 3 debe tener Cyberpunk 2077")
    public void testUsuario3Videojuego() {
        Usuario user = datosDAO.getUsuarioPorCodigo(3);
        assertNotNull(user.getVideojuegos(), "El usuario 3 debe tener videojuegos");
        assertFalse(user.getVideojuegos().isEmpty(), "El usuario 3 debe tener al menos un videojuego");
        assertEquals("Cyberpunk 2077", user.getVideojuegos().get(0).getNombre(), 
                     "El usuario 3 debe tener Cyberpunk 2077");
    }

    // Pruebas para el método getUsuarioRandom()
    @Test
    @DisplayName("Debe devolver usuario aleatorio no nulo")
    public void testGetUsuarioRandomNotNull() {
        Usuario randomUser = datosDAO.getUsuarioRandom();
        assertNotNull(randomUser, "El usuario aleatorio no debe ser nulo");
    }

    @Test
    @DisplayName("Debe devolver usuario con códigos válidos")
    public void testGetUsuarioRandomValidCode() {
        Usuario randomUser = datosDAO.getUsuarioRandom();
        assertTrue(randomUser.getCodigo() >= 1 && randomUser.getCodigo() <= 3, 
                   "El código de usuario aleatorio debe estar entre 1 y 3");
    }

    @Test
    @DisplayName("Debe devolver usuarios diferentes en múltiples llamadas aleatorias")
    public void testGetUsuarioRandomVariety() {
        // Llamar al método aleatorio múltiples veces para aumentar la probabilidad de obtener usuarios diferentes
        boolean foundDifferent = false;
        Usuario firstUser = datosDAO.getUsuarioRandom();
        
        for (int i = 0; i < 20; i++) {
            Usuario randomUser = datosDAO.getUsuarioRandom();
            if (randomUser.getCodigo() != firstUser.getCodigo()) {
                foundDifferent = true;
                break;
            }
        }
        
            assertTrue(foundDifferent, "Debe obtener usuarios diferentes en múltiples llamadas aleatorias (estadísticamente)");
        }
    }


