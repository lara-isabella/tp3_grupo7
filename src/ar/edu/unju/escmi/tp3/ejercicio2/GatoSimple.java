package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
   
    private String nombre;
    private String color;
    private String raza;
    private double peso;
    private int edad;
    private String sexo; 

    public GatoSimple(String nombre, String color, String raza, double peso, int edad, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.sexo = sexo.toLowerCase(); 
    }


    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if ("pescado".equalsIgnoreCase(comida)) {
            System.out.println("¡Qué rico, gracias!!");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("No me gusta pelear");
        } else if (this.sexo.equals("macho")) {
            if (gatoContrincante.sexo.equals("hembra")) {
                System.out.println("No peleo contra gatitas");
            } else {
                System.out.println("¡Ven aquí que te vas a enterar!");
            }
        }
    }

   
    public void mostrarInfo() {
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Color: " + color);
        System.out.println(" Raza: " + raza);
        System.out.println(" Peso: " + peso + " kg");
        System.out.println(" Edad: " + edad + " años");
        System.out.println(" Sexo: " + sexo);
    }
}
