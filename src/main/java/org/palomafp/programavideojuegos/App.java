package org.palomafp.programavideojuegos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aplicación principal para gestionar videojuegos
 *
 */
public class App 
{
    public static void main( String[] args ){
        DatosDAO datosDAO = new DatosDAO();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcion != 6) {
            getMenu();
            opcion = obtenerOpcionInt(scanner);
            switch (opcion) {
                case 1:
                    usuarios.add(datosDAO.getUsuarioRandom());
                    break;
                case 2:
                    usuarios.addAll(datosDAO.getUsuarios());
                    break;
                case 3:
                    System.out.println("Ingresa el codigo de usuario:");
                    int codigo = obtenerOpcionInt(scanner);
                    usuarios.add(datosDAO.getUsuarioPorCodigo(codigo));
                    break;
                case 4:
                    System.out.println("Usuarios en local:");
                    for (Usuario usuario : usuarios) {
                        System.out.println(usuario);
                    }
                    break;
                case 5:
                    usuarios.clear();
                    break;
                case 6:
                    break;
            
                default:
                    System.out.println("Opcion fuera del rango, prueba otra vez");
                    break;
            }
        }
        scanner.close();
    }

    private static void getMenu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Obtener usuario random");
        System.out.println("2. Obtener lista de usuarios");
        System.out.println("3. Obtener un usuario por codigo");
        System.out.println("4. Mostrar usuarios en local");
        System.out.println("5. Borrar usuarios en local");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcionInt(Scanner scanner) {
        int opcion = 0;
        while (true) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return opcion;
    }
}
