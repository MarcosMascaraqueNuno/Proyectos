package com.company;

public class CocheMain {
	public static void main(String[] args) {
		
		Coche coche = new Coche("rojo", "honda", "civic", 1430.45, 5.4);
		System.out.println(coche);
		coche.acelerar(120);
		
		System.out.println(coche);
		
		coche.peso = 1350.8;
		System.out.println(coche);
		
		
		CocheElectrico cocheElectrico = new CocheElectrico("Tesla Motors", "rojo", "honda", "civic", 1430.45, 5.4);

		CocheHibrido cocheHibrido = new CocheHibrido("rojo", "Honda", "Civic", 1243.4,5.7 , "50km");
		
		CocheHidrogeno cocheHidrogeno = new CocheHidrogeno("Pruo", "rojo", "Honda", "Ampera", 1243.4, 5.7);

		
		
		System.out.println(cocheElectrico);
		System.out.println(cocheHibrido);
		System.out.println(cocheHidrogeno);
		
	}

}
