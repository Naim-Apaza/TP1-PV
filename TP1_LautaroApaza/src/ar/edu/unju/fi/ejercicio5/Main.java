package ar.edu.unju.fi.ejercicio5;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		byte num = in.nextByte();
		if (num < 10 && num > 0) {
			for (byte i = 0; i <= num; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
				if (i == 9) {
					i++;
					System.out.println(num + " x " + i + " = " + num * i);
				}
			}
		} else {
			System.out.println("El numero debe ser entre 1 y 9");
		}
	}
}
