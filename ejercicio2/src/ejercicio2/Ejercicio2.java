package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Intrduce el precio: ");
	        double precio = sc.nextDouble();
	        
	        System.out.print("Intrduce el IVA: ");
	        double IVA = sc.nextDouble() / 100;
	        
	        double precioIVA= calculaPrecioIVA(precio, IVA);
	        System.out.print("El precio con IVA es: " + precioIVA);
	    }

		public static double calculaPrecioIVA(double precio, double IVA) {
			double precioIVA= precio * (1+ IVA);
			return precioIVA;
		}
	}
