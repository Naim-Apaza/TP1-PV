package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
    private String nombre;
    private String legajo;
    private double salario;
    private final double SALARIO_MINIMO = 210000.00;
    private final double AUMENTO_MERITO = 20000.00;

    public Empleado(String nombre, String legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salario = Math.max(salario, SALARIO_MINIMO);
    }

    public double aumento() {
        return this.salario += AUMENTO_MERITO;
    }

    public void mostrarDatos() {
        System.out.println("EMPLEADO" + '\n' +
                "- Nombre: " + nombre + '\n' +
                "- Legajo: " + legajo + '\n' +
                "- Salario: " + salario);
    }
}
