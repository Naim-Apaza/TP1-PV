package ar.edu.unju.fi.ejercicio9.model;

import java.text.DecimalFormat;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private int descuento;

	public Producto() {
	}

	public int calcularDescuento() {
		if (descuento > 0 && descuento <= 50) {
			return (int) (getPrecio() - (getPrecio() * getDescuento()) / 100);
		} else {
			return (int) getPrecio();
		}
	}

	public void mostrarDatos() {
		if (getDescuento() < 0 || getDescuento() > 51) {
			setDescuento(0);
		}
		System.out.println("---------------------------------------------------------" + '\n' + "Producto: "
				+ getNombre() + '\n' + "Codigo: " + getCodigo() + '\n' + "Precio: " + getPrecio() + '$' + '\n'
				+ "Descuento: " + getDescuento() + '%' + '\n' + "Precio con descuento: " + calcularDescuento() + '$' + '\n'
				+ "---------------------------------------------------------");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}
