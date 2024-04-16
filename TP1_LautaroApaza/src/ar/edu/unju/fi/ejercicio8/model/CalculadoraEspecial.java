package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	public int n;

	public CalculadoraEspecial() {
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int calcularSumatoria() {
		int suma = 0;

		for (int i = 1; i <= getN(); i++) {
			int valor = (int) Math.pow((i + (i + 1)) / 2, 2);
			suma += valor;
		}
		return suma;
	}

	public int calcularProductoria() {
		int factorial = 0;

		for (int i = 1; i <= getN(); i++) {
			int valor = i * (i + 4);
			factorial += valor;
		}
		return factorial;
	}

}