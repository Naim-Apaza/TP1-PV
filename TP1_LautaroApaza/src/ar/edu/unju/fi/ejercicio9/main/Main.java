package ar.edu.unju.fi.ejercicio9.main;

import ar.edu.unju.fi.ejercicio9.model.Producto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		byte i = 0;
		try {
			do {
				System.out.println("INGRESE SU PRODUCTO");

				System.out.print("Ingrese nombre del producto: ");
				String nombre = in.nextLine();

				System.out.print("Ingrese codigo del producto: ");
				String codigo = in.nextLine();

				System.out.print("Ingrese precio del producto (XXXX,XX): ");
				float precio = in.nextFloat();

				System.out.print("Ingrese descuento del producto(hasta 50%): ");
				int descuento = in.nextInt();
				in.nextLine();

				Producto producto = new Producto();

				producto.setNombre(nombre);
				producto.setCodigo(codigo);
				producto.setPrecio(precio);
				producto.setDescuento(descuento);
				producto.calcularDescuento();

				producto.mostrarDatos();

				i++;
			} while (i < 3);
		} catch (Exception e) {
			System.out.println("Se esperaba en precio(valor numerico real) y descuento(valor numerico entero)");
		}
		
	}

}
