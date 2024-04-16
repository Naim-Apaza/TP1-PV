package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese sus datos");
        try {
        	System.out.print("Ingrese su nombre: ");
            String nombre = in.nextLine();

            System.out.print("Ingrese su salario: ");
            double salario = in.nextDouble();
            in.nextLine();

            System.out.print("Ingrese su legajo: ");
            String legajo = in.nextLine();
            in.close();

            Empleado empleado = new Empleado(nombre, legajo, salario);
            empleado.mostrarDatos();

            System.out.println("Aumento de salario");
            empleado.aumento();
            empleado.mostrarDatos();
		} catch (Exception e) {
			System.out.println("Se esperaba en salario(valor numerico)");
		}
        
    }
}
