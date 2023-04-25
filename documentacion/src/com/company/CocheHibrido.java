package com.company;

public class CocheHibrido extends Coche{

	String autonomia;
	
	public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo, String autonomia) {	
		super(color, fabricante, modelo, peso, largo);
		this.autonomia = autonomia;
	}

	@Override
	public String toString() {
		return "CocheHibrido [autonomia=" + autonomia + ", color=" + color + ", fabricante=" + fabricante + ", modelo="
				+ modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + "]";
	}



	public static void main(String[] args) {
		CocheHibrido cocheHibrido = new CocheHibrido("rojo", "Honda", "Civic", 1354.5, 4.5, "50Km");
		System.out.println(cocheHibrido);
	}
}