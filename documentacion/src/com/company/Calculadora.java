package com.company;

import java.util.Scanner;

// Escriba un programa en Java que solicite 
// al usuario dos números enteros y muestre la suma, resta, multiplicación y división de esos números.

public class Calculadora {
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
       
		
        System.out.print("Ingresa un número entero: ");
        int num1 = tc.nextInt();
        
        System.out.print("Ingresa un número entero: ");
        int num2 = tc.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);
        
        
        
        tc.close();
	}
}
	
