package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();

        int op;

        do {
            System.out.println("******** MENU ********");
            System.out.println("1 – Crear objeto con Constructor por defecto");
            System.out.println("2 – Crear objeto con Constructor parametrizado");
            System.out.println("3 – Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4 – Mostrar personas");
            System.out.println("5 – Salir");
            System.out.print("Seleccione una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    Persona p1 = new Persona();
                    System.out.print("Ingrese DNI: ");
                    p1.setDni(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    p1.setNombre(scanner.nextLine());
                    System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                    p1.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
                    System.out.print("Ingrese domicilio: ");
                    p1.setDomicilio(scanner.nextLine());
                    System.out.print("Ingrese provincia: ");
                    p1.setProvincia(scanner.nextLine());
                    personas.add(p1);
                    break;
                case 2:
                    System.out.print("Ingrese DNI: ");
                    int dni2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre2 = scanner.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                    LocalDate fecha2 = LocalDate.parse(scanner.nextLine());
                    System.out.print("Ingrese domicilio: ");
                    String domicilio2 = scanner.nextLine();
                    System.out.print("Ingrese provincia: ");
                    String provincia2 = scanner.nextLine();
                    Persona p2 = new Persona(dni2, nombre2, fecha2, domicilio2, provincia2);
                    p2.setDomicilio(domicilio2); 
                    personas.add(p2);
                    break;
                case 3:
                    System.out.print("Ingrese DNI: ");
                    int dni3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre3 = scanner.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                    LocalDate fecha3 = LocalDate.parse(scanner.nextLine());
                    Persona p3 = new Persona(dni3, nombre3, fecha3);
                    personas.add(p3);
                    break;
                case 4:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        for (Persona persona : personas) {
                            persona.mostrarDatos();
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente...");
            }
        } while (op!=5);

        scanner.close();
    }
}
