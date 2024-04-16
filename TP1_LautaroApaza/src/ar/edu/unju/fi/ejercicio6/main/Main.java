package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("INGRESE SUS DATOS");

		try {
			System.out.print("Ingrese el DNI:");
			int dni = in.nextInt();
			in.nextLine();

			System.out.print("Ingrese el nombre:");
			String nombre = in.nextLine();

			System.out.print("Ingrese la fecha de nacimiento (formato: AAAA-MM-DD):");
			String fecha = in.nextLine();
			LocalDate fechaNacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

			System.out.print("Provincia:");
			String provincia = in.nextLine();

			in.close();

			person1(dni, nombre, fechaNacimiento, provincia);
			person2(dni, nombre, fechaNacimiento, provincia);
			person3(dni, nombre, fechaNacimiento);
		} catch (Exception e) {
			System.out.println("Se espera en dni(numero entero), nombre(String), formato de fecha indicada, provincia(String)");
		}
		

	}

	public static void person1(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		Persona persona = new Persona();

		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaDeNacimiento(fechaNacimiento);
		persona.setProvincia(provincia);

		persona.mostrarDatos();
	}

	public static void person2(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		Persona persona = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona.mostrarDatos();
	}

	public static void person3(int dni, String nombre, LocalDate fechaNacimiento) {
		Persona persona = new Persona(dni, nombre, fechaNacimiento);
		persona.mostrarDatos();
	}

}
