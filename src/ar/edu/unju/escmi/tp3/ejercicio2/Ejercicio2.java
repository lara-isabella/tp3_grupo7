package ar.edu.unju.escmi.tp3.ejercicio2;


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GatoSimple gato = null;
        GatoSimple gatoContrincante = null;
        
    

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1 Crear gato simple");
            System.out.println("2 Dar de comer a un gato simple");
            System.out.println("3 Mostrar todos los gatos");
            System.out.println("4 Crear gato contrincante y pelear");
            System.out.println("5 Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese color: ");
                    String color = sc.nextLine();
                    System.out.print("Ingrese raza: ");
                    String raza = sc.nextLine();
                    double peso = 0;
                    
                    while (true) {
    System.out.print("Ingrese peso (kg): ");
    if (sc.hasNextDouble()) {
        peso = sc.nextDouble();
        sc.nextLine(); 
        break;
    } else {
        System.out.println("Entrada inválida. Ingrese un número decimal.");
        sc.nextLine(); 
    }
}

                
                 int edad = 0;
while (true) {
    System.out.print("Ingrese edad: ");
    if (sc.hasNextInt()) {
        edad = sc.nextInt();
        sc.nextLine(); 
        if (edad >= 0) break;
        else System.out.println(" La edad no puede ser negativa.");
    } else {
        System.out.println(" Entrada inválida. Ingrese un número entero.");
        sc.nextLine(); 
    }
}
                   String sexo = "";
while (true) {
    System.out.print("Ingrese sexo (macho/hembra): ");
    sexo = sc.nextLine().toLowerCase();
    if (sexo.equals("macho") || sexo.equals("hembra")) {
        break;
    } else {
        System.out.println(" Sexo inválido. Debe ingresar 'macho' o 'hembra'.");
    }
}

                    gato = new GatoSimple(nombre, color, raza, peso, edad, sexo);
                    System.out.println(" Gato creado con éxito!");
                }
                case 2 -> {
                    if (gato == null) {
                        System.out.println(" Primero debe crear un gato simple.");
                    } else {
                        System.out.print("Ingrese la comida: ");
                        String comida = sc.nextLine();
                        gato.comer(comida);
                    }
                }
                case 3 -> {
                    if (gato == null) {
                        System.out.println(" No hay gato creado.");
                    } else {
                        gato.mostrarInfo();
                        System.out.print("El gato dice: ");
                        gato.maullar();
                        System.out.print("Y también: ");
                        gato.ronronear();
                    }
                }
                case 4 -> {
                    if (gato == null) {
                        System.out.println(" Primero debe crear un gato simple.");
                    } else {
                        System.out.print("Ingrese nombre del contrincante: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese color: ");
                        String color = sc.nextLine();
                        System.out.print("Ingrese raza: ");
                        String raza = sc.nextLine();
                                       double peso = 0;
                    
                    while (true) {
    System.out.print("Ingrese peso (kg): ");
    if (sc.hasNextDouble()) {
        peso = sc.nextDouble();
        sc.nextLine(); 
        break;
    } else {
        System.out.println("Entrada inválida. Ingrese un número decimal.");
        sc.nextLine(); 
    }
}

                
                 int edad = 0;
while (true) {
    System.out.print("Ingrese edad: ");
    if (sc.hasNextInt()) {
        edad = sc.nextInt();
        sc.nextLine(); 
        if (edad >= 0) break;
        else System.out.println(" La edad no puede ser negativa.");
    } else {
        System.out.println(" Entrada inválida. Ingrese un número entero.");
        sc.nextLine(); 
    }
}
                   String sexo = "";
while (true) {
    System.out.print("Ingrese sexo (macho/hembra): ");
    sexo = sc.nextLine().toLowerCase();
    if (sexo.equals("macho") || sexo.equals("hembra")) {
        break;
    } else {
        System.out.println(" Sexo inválido. Debe ingresar 'macho' o 'hembra'.");
    }
}


                        gatoContrincante = new GatoSimple(nombre, color, raza, peso, edad, sexo);
                        System.out.println(" Pelea entre gatos:");
                        gato.pelear(gatoContrincante);
                    }
                }
                case 5 -> System.out.println(" Saliendo del programa...");
                default -> System.out.println(" Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}