package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int num = in.nextInt();
		num = num % 2 == 0 ? num * 3 : num * 2;
		
		System.out.println("Resultado: " + num);
	}

}
