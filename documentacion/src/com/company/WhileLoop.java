package com.company;

public class WhileLoop {
	public static void main(String[] args) {
		int count= 0;
		
		while(count <= 10) {
			count++;
			if(count == 6)
				break;
				//continue;
			System.out.println("Hopla mundo: " + count);	
			

		}
		System.out.println("Fin");
	}
}
