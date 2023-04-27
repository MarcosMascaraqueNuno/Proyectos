package com.company;

public class CuentaBancaria {

	//Atributos
	int numeroDeCuenta;
	String nombreTitular;
	Double saldo;

	
	public CuentaBancaria(int numeroDeCuenta, String nombreTitular, Double saldo) {
		this.nombreTitular = nombreTitular;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}

	
	
	
	
	//Getter
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	//setter
	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	//Getter
	public String getNombreTitular() {
		return nombreTitular;
	}

	//setter
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	//Getter
	public Double getSaldo() {
		return saldo;
	}

	//setter
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(Double cantidad) {
		this.saldo = saldo += cantidad;
	}
	
	public void retirar(Double cantidad) {
		if(cantidad <= saldo) {
			saldo -= cantidad;
		} else {
			System.out.println("No hay suficiente saldo en la cuenta.");
		}
		
	}
	
}