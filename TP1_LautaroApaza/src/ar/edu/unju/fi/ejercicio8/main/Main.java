package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CalculadoraEspecial calculator = new CalculadoraEspecial();
		Scanner in = new Scanner(System.in);

		try {
			System.out.print("INGRESE VALOR PARA N: ");
			int n = in.nextInt();

			calculator.setN(n);
			System.out.println("Sumatoria: " + calculator.calcularSumatoria() + '\n');
			System.out.println("Productoria: " + calculator.calcularProductoria());
		} catch (Exception e) {
			System.out.println("Se esperaba en N(valor numerico)");
		}
		

	}
}
