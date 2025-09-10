package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static final String LILA= "\u001B[95m";
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int contador = 0;
        int opcion;

        do {
            System.out.println(LILA + "\n****************** MENU *********************" );
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar los datos de un cliente");
            System.out.println("3 - Mostrar todos los clientes");
            System.out.println("4 - Mostrar todos los clientes por categoría");
            System.out.println("5 - Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (contador < clientes.length) {
                        System.out.print("Ingrese DNI: ");
                        String dni = sc.nextLine();
                        System.out.print("Ingrese Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese Categoría (char): ");
                        char categoria = sc.nextLine().charAt(0);

                        clientes[contador] = new Cliente(dni, nombre, categoria);
                        contador++;
                        System.out.println("Cliente creado correctamente.");
                    } else {
                        System.out.println("No se pueden cargar más clientes (capacidad máxima alcanzada).");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese DNI a buscar: ");
                    String dniBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getDni().equals(dniBuscar)) {
                            System.out.println(c.toString());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el DNI.");
                    }
                    break;

                case 3:
                    System.out.println("Listado de clientes:");
                    for (Cliente c : clientes) {
                        if (c != null) {
                            System.out.println(c.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese categoría a buscar: ");
                    char catBuscar = sc.nextLine().charAt(0);
                    boolean alguno = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getCategoria() == catBuscar) {
                            System.out.println(c.toString());
                            alguno = true;
                        }
                    }
                    if (!alguno) {
                        System.out.println("No hay clientes en esa categoría.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
