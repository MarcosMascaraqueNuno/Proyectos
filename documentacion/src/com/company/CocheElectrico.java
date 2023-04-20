package com.company;

public class CocheElectrico extends Coche{
	
	// atributos
	String motorElectrico;

	// contructores
	public CocheElectrico(String motorElectrico, String color, String fabricante, String modelo, Double peso, Double largo) {
		super(color, fabricante, modelo, peso, largo);
		this.motorElectrico = motorElectrico;
	}


	@Override
	public String toString() {
		return "CocheElectrico [motorElectrico=" + motorElectrico + ", color=" + color + ", fabricante="
				+ fabricante + ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad="
				+ velocidad + "]";
	}	
}
