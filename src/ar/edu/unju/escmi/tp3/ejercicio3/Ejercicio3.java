package ar.edu.unju.escmi.tp3.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        int opcion;

        do {
            System.out.println("\n===== MENÚ EJERCICIO 3 =====");
            System.out.println("1 - Crear empleado");
            System.out.println("2 - Aumentar salario");
            System.out.println("3 - Mostrar datos del empleado");
            System.out.println("4 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del empleado: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese legajo: ");
                    int legajo = sc.nextInt();
                    System.out.print("Ingrese salario: ");
                    double salario = sc.nextDouble();
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println("Empleado creado correctamente.");
                    break;

                case 2:
                    if (empleado == null) {
                        System.out.println("Primero debe crear un empleado.");
                    } else {
                        System.out.print("Ingrese el legajo para confirmar: ");
                        int legajoIngresado = sc.nextInt();
                        if (legajoIngresado == empleado.getLegajo()) {
                            empleado.aumentarSalario();
                        } else {
                            System.out.println("El legajo no coincide con el del empleado.");
                        }
                    }
                    break;

                case 3:
                    if (empleado == null) {
                        System.out.println("No hay empleado creado.");
                    } else {
                        empleado.mostrarDatos();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
