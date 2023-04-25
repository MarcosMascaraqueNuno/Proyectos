package com.company;

public class CocheHidrogeno extends Coche {
	
	String hidrogeno;

	public CocheHidrogeno(String hidrogeno, String color, String fabricante, String modelo, Double peso , Double largo) {
		super(color, fabricante, modelo, peso, largo);
		this.hidrogeno = hidrogeno;
	}

	@Override
	public String toString() {
		return "CocheHidrogeno [hidrogeno=" + hidrogeno + ", color=" + color + ", fabricante=" + fabricante
				+ ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + "]";
	}

	
	
		
	}
