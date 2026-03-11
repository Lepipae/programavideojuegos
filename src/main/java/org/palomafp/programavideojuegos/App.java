package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Aplicación principal para gestionar videojuegos
 * 
 * @author Andrés López de la Vía
 */
public class App {
	private static Scanner scanner;
	private static ArrayList<Usuario> usuarios;
	private static UsuariosDAO datosDAO;

	/**
	 * Metodo principal de la clase
	 * 
	 * @param args Argumentos de entrada
	 */
	public static void main(String[] args) {
		datosDAO = new UsuariosDAO();
		usuarios = new ArrayList<>();
		int opcion = 0; // Opcion seleccionada en el menu
		scanner = new Scanner(System.in);
		while (opcion != 4) {
			getMenu();
			opcion = getInt("Que quieres hacer?");
			switch (opcion) {
			case 1: // Obtener datos de prueba
				obtenerDatosPrueba();
				break;
			case 2: // Listar usuarios
				listarUsuarios();
				break;
			case 3:	// Borrar todos los usuarios
				borrarUsuarios();
				break;
			case 4:
				System.out.println("Saliendo del programa");
				break;

			default:
				System.out.println("Opcion fuera del rango, prueba otra vez");
				break;
			}
		}
		scanner.close();
	}


	/**
	 * Submenu que llama a metodos para obtener datos de prueba
	 * separado para mantener el main limpio
	 */
	private static void obtenerDatosPrueba() {
		int opcion;
		System.out.println("1 - Obtener un usuario aleatorio\n"
				+ "2 - Obtener todos los usuarios de prueba\n"
				+ "3 - Obtener usuario por codigo");
		opcion = getInt("Que quieres hacer?");
		switch (opcion) {
		case 1: // Obtener un usuario aleatorio
			obtenerUsuario();
			break;
		case 2: // Obtener todos los usuarios
			obtenerTodos();
			break;
		case 3: // Obtener por codigo
			obtenerPorCodigo();
			break;
		default:
			break;
		}
	}

	/**
	 * Metodo que borra todos los usuarios
	 * 
	 */
	private static void borrarUsuarios() {
		System.out.println("Borrando usuarios");
		usuarios.clear();
	}

	// Metodo que lista los usuarios
	private static void listarUsuarios() {
		System.out.println("Usuarios en local:");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}

	// Metodo que obtiene un usuario de los datos de prueba buscado por codigo
	private static void obtenerPorCodigo() {
		int codigo = getInt("Ingresa el codigo de usuario:");
		usuarios.add(datosDAO.getUsuarioPorCodigo(codigo));
	}

	// Metodo que obtiene todos los datos de prueba
	private static void obtenerTodos() {
		System.out.println("Obteniendo todos los usuarios");
		usuarios.addAll(datosDAO.getAllUsuarios());
	}

	//	Metodo que obtiene un usuario aleatorio

	private static void obtenerUsuario() {
		try {
			System.out.println("Obteniendo usuario aleatorio...");
			usuarios.add(datosDAO.getUsuarioRandom());
		} catch (IllegalStateException e) {
			System.out.println("Error al obtener usuario aleatorio: " + e.getMessage());
		}
	}

	private static void getMenu() {
		System.out.println("--------------Menú Principal-----------------");
		System.out.println("1. Obtener usuario de prueba");
		System.out.println("2. Mostrar usuarios en local");
		System.out.println("3. Borrar usuarios en local");
		System.out.println("4. Salir");
	}

	private static int getInt(String mensaje) {
		int opcion = 0;
		System.out.println(mensaje);
		while (true) {
			try {
				opcion = scanner.nextInt();
				scanner.next();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Por favor, ingrese un número válido.");
				scanner.next();
			}
		}
		return opcion;
	}
}
