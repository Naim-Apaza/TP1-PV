package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
    private long dni;
    private String nombre;
    private LocalDate FechaDeNacimiento;
    private String provincia;

    public Persona() {
    }

    public Persona(long dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        FechaDeNacimiento = fechaDeNacimiento;
        this.provincia = provincia;
    }

    public Persona(long dni, String nombre, LocalDate fechaDeNacimiento) {
        this.provincia = "Jujuy";
        this.dni = dni;
        this.nombre = nombre;
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public int calcularEdad() {
        LocalDate now = LocalDate.now();

        int anioDeNacimiento = getFechaDeNacimiento().getYear();

        return now.minusYears(anioDeNacimiento).getYear();
    }

    public boolean mayorEdad() {
        return calcularEdad() > 18;
    }

    public void mostrarDatos() {
        String mayorEdad = mayorEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad";

        System.out.println(
        		"-----------------------------" + '\n' +
                "- DNI: " + dni + '\n' +
                "- Nombre: " + nombre + '\n' +
                "- Fecha de Nacimiento: " + FechaDeNacimiento + '\n' +
                "- provincia: " + provincia + '\n' +
                "- edad: " + calcularEdad() + '\n' +
                "- " + mayorEdad + '\n' +
                "-----------------------------");
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
