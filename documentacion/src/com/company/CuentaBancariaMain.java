package com.company;

import java.util.Scanner;

public class CuentaBancariaMain {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Ingrese el número de cuenta: ");
        int numeroDeCuenta = tc.nextInt();
        
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String nombreTitular = tc.next();
        
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldo = tc.nextDouble();
        
        CuentaBancaria cuenta = new CuentaBancaria(numeroDeCuenta, nombreTitular, saldo);
        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = tc.nextDouble();
        
        cuenta.depositar(cantidadDeposito);
        
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = tc.nextDouble();
        
        cuenta.retirar(cantidadRetiro);
        
        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
        
		tc.close();
	}
}
