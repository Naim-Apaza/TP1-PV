package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int i = in.nextInt();
		int num = 1;
		if (i <= 10 && i >= 0) {
			while (i > 0) {
				num *= i;
				i--;
			}
		} else {
			System.out.println("El numero debe estar entre 0 y 10");
		}
		System.out.println("El resultado es " + num);
	}
}
