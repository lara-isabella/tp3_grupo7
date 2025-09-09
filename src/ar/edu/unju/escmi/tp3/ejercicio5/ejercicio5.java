package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        int opcion;
        int contador = 0;

        final String RESET = "\u001B[0m";
        final String MORADO = "\u001B[35m";
        final String FONDO_BLANCO  = "\u001B[47m";

        do {
            System.out.println(FONDO_BLANCO + "\n******************* MENU *********************" + RESET);
            System.out.println(MORADO + "1 Crear producto" + RESET);
            System.out.println(MORADO + "2 Mostrar productos" + RESET);
            System.out.println(MORADO + "3 Modificar precio de producto" + RESET);
            System.out.println(MORADO + "4 Mostrar los productos que superen un precio" + RESET);
            System.out.println(MORADO + "5 Salir" + RESET);
            System.out.print(FONDO_BLANCO+ "Elija una opción: " + RESET);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (contador < productos.length) {
                        Producto p = new Producto();
                        System.out.print("Ingrese código: ");
                        p.setCodigo(sc.nextLine());
                        System.out.print("Ingrese descripción: ");
                        p.setDescripcion(sc.nextLine());
                        System.out.print("Ingrese precio: ");
                        p.setPrecio(sc.nextDouble());
                        sc.nextLine();
                        productos[contador] = p;
                        contador++;
                        System.out.println(MORADO + "Producto creado correctamente." + RESET);
                    } else {
                        System.out.println(MORADO + "No se pueden crear más productos (capacidad máxima alcanzada)." + RESET);
                    }
                    break;

                case 2:
                    System.out.println(MORADO + "\n--- Lista de Productos ---" + RESET);
                    for (Producto prod : productos) {
                        if (prod != null) {
                            System.out.println(prod);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el código del producto a modificar: ");
                    String cod = sc.nextLine();
                    boolean encontrado = false;
                    for (Producto prod : productos) {
                        if (prod != null && prod.getCodigo().equals(cod)) {
                            System.out.print("Ingrese nuevo precio: ");
                            double nuevoPrecio = sc.nextDouble();
                            sc.nextLine();
                            prod.setPrecio(nuevoPrecio);
                            System.out.println(MORADO+ "Precio actualizado." + RESET);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(MORADO + "Producto no encontrado." + RESET);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el precio mínimo: ");
                    double limite = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(MORADO + "\n--- Productos con precio mayor a " + limite + " ---" + RESET);
                    for (Producto prod : productos) {
                        if (prod != null && prod.getPrecio() > limite) {
                            System.out.println(prod);
                        }
                    }
                    break;

                case 5:
                    System.out.println(MORADO + "Saliendo del programa..." + RESET);
                    break;

                default:
                    System.out.println(MORADO + "Opción inválida. Intente de nuevo." + RESET);
            }
        } while (opcion != 5);

        sc.close();
    }
}
