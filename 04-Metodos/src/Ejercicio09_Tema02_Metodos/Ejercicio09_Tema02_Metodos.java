package Ejercicio09_Tema02_Metodos;

import java.util.Scanner;

public class Ejercicio09_Tema02_Metodos {

	static double potencia(double numero, double exponente) 
	{
		int contador=0;
		double resultado=1;
		while (contador<exponente) 
		{
			resultado=resultado*numero;
			contador++;
		}
		return resultado;
	}
	
	static double factorial(double numero) 
	{
		int contador=1;
		double factorial=1;
		while(contador<=numero) 
		{
			factorial=factorial*contador;
			contador++;
		}
		return factorial;
	}
	
	
	static double seno(double angulo, double precision) 
	{
		double radianes=(angulo*Math.PI)/180;
		double seno=0;
		int contador=1;
		double sumas=0;
		double restas=0;
		int contador_sumas=1;
		int contador_restas=3;
		
		while ( ((potencia(radianes, contador))/factorial(contador))> precision ) 
		{
			sumas=sumas+(potencia(radianes, contador_sumas)/factorial(contador_sumas));
			contador_sumas=contador_sumas+4;
				
			restas=restas+(potencia(radianes, contador_restas)/factorial(contador_restas));
			contador_restas=contador_restas+4;
				
			contador++;
		}
		seno=sumas-restas;
		return seno;
	}
	
	
	
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Introduce el angulo en grados");
		double angulo=lectura.nextDouble();
		
		System.out.println("Introduce la precision");
		double precision=lectura.nextDouble();
		
		
		
		System.out.println(seno(angulo, precision));

	}

}
