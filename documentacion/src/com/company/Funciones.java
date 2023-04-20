package com.company;
import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		
		//holaMundo();
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese el valor de num1: ");
	    int num1 = scanner.nextInt();

	    System.out.print("Ingrese el valor de num2: ");
	    int num2 = scanner.nextInt();
		
		holaMundo(num1, num2 );
		
		//String hola = devolverHola();
		//System.out.println(hola);
		


		
	}

	public static void holaMundo(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Hola, el resultado es: " + sum);
	}
	private static String devolverHola() {
		return "Hola";
	}
	
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
}
