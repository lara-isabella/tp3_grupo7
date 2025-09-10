package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static final String PINK = "\u001B[95m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int contador = 0;
        int opcion;

        do {
            System.out.println(PINK + "\n--- MENÚ CLIENTES ---" + RESET);
            System.out.println(PINK + "1 - Crear cliente" + RESET);
            System.out.println(PINK + "2 - Mostrar los datos de un cliente" + RESET);
            System.out.println(PINK + "3 - Mostrar todos los clientes" + RESET);
            System.out.println(PINK + "4 - Mostrar todos los clientes por categoría" + RESET);
            System.out.println(PINK + "5 - Salir" + RESET);
            System.out.print(PINK + "Elija una opción: " + RESET);
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (contador < clientes.length) {
                        System.out.print(PINK + "Ingrese DNI: " + RESET);
                        String dni = sc.nextLine();
                        System.out.print(PINK + "Ingrese Nombre: " + RESET);
                        String nombre = sc.nextLine();
                        System.out.print(PINK + "Ingrese Categoría (char): " + RESET);
                        char categoria = sc.nextLine().charAt(0);

                        clientes[contador] = new Cliente(dni, nombre, categoria);
                        contador++;
                        System.out.println(PINK + "Cliente creado correctamente." + RESET);
                    } else {
                        System.out.println(PINK + "No se pueden cargar más clientes (capacidad máxima alcanzada)." + RESET);
                    }
                    break;

                case 2:
                    System.out.print(PINK + "Ingrese DNI a buscar: " + RESET);
                    String dniBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getDni().equals(dniBuscar)) {
                            System.out.println(PINK + c.toString() + RESET);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(PINK + "No se encontró el DNI." + RESET);
                    }
                    break;

                case 3:
                    System.out.println(PINK + "Listado de clientes:" + RESET);
                    for (Cliente c : clientes) {
                        if (c != null) {
                            System.out.println(PINK + c.toString() + RESET);
                        }
                    }
                    break;

                case 4:
                    System.out.print(PINK + "Ingrese categoría a buscar: " + RESET);
                    char catBuscar = sc.nextLine().charAt(0);
                    boolean alguno = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getCategoria() == catBuscar) {
                            System.out.println(PINK + c.toString() + RESET);
                            alguno = true;
                        }
                    }
                    if (!alguno) {
                        System.out.println(PINK + "No hay clientes en esa categoría." + RESET);
                    }
                    break;

                case 5:
                    System.out.println(PINK + "Saliendo del programa..." + RESET);
                    break;

                default:
                    System.out.println(PINK + "Opción inválida." + RESET);
            }

        } while (opcion != 5);

        sc.close();
    }
}
