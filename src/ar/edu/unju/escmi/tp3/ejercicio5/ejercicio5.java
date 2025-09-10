package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        int opcion;
        int contador = 0;

        final String ROSA = "\u001B[38;5;205m";
        

        do {
            System.out.println(ROSA +"\n******************* MENU *********************" );
            System.out.println( "1 Crear producto" );
            System.out.println( "2 Mostrar productos" );
            System.out.println( "3 Modificar precio de producto");
            System.out.println( "4 Mostrar los productos que superen un precio" );
            System.out.println( "5 Salir" );
            System.out.print( "Elija una opción: " );
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
                        System.out.println("Producto creado correctamente." );
                    } else {
                        System.out.println("No se pueden crear más productos (capacidad máxima alcanzada)." );
                    }
                    break;

                case 2:
                    System.out.println( "\n ***** Lista de Productos ***** " );
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
                            System.out.println( "Precio actualizado." );
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println( "Producto no encontrado." );
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el precio mínimo: ");
                    double limite = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("\n--- Productos con precio mayor a " + limite + " ---" );
                    for (Producto prod : productos) {
                        if (prod != null && prod.getPrecio() > limite) {
                            System.out.println(prod);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa..." );
                    break;

                default:
                    System.out.println( "Opción inválida. Intente de nuevo." );
            }
        } while (opcion != 5);

        sc.close();
    }
}
