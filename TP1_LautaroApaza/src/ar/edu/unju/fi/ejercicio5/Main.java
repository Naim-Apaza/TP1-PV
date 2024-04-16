package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		byte num = in.nextByte();
		in.close();
		if (num > 10 || num < 0) {
			System.out.println("El numero debe ser entre 1 y 9");
		} else {
			for (byte i = 0; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}
		}
	}
}
