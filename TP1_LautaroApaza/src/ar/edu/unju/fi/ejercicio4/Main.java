package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		byte i = in.nextByte();
		byte num = 1;
		if (i < 0 || i > 10) {
			System.out.println("El numero debe estar entre 0 y 10");

		} else {
			while (i > 0) {
				num *= i;
				i--;
			}
		}
		System.out.println("El resultado es " + num);
	}
}
