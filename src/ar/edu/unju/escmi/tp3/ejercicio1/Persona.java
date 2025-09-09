package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;

public class Persona {
    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private String provincia;

    public Persona() {

    }

    public Persona(int dni, String nombre, LocalDate fechaNacimiento, String domicilio, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.provincia = provincia;
    }

    public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
    return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    private int calcularEdad(){
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    private boolean verificarMayoriaEdad(){
        return calcularEdad() >= 18;
    }

    public void mostrarDatos(){
        System.out.println("******** DATOS ********");
        System.out.println("DNI: " +dni);
        System.out.println("Nombre: " +nombre);
        System.out.println("Provincia: " +provincia);
        System.out.println("Fecha de Nacimiento: " +fechaNacimiento);
        System.out.println("Edad: " +calcularEdad() + "anios.");
        if (verificarMayoriaEdad()) {
            System.out.println("Mayo1ria de edad: La persona es mayor de edad.");
        } else {
            System.out.println("Mayoria de edad: La persona es menor de edad.");
        }

    }
    
}
