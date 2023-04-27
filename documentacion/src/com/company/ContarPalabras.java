package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContarPalabras {

    public static void main(String[] args) {
        String fileName = "C:\\contar.txt"; // Ruta relativa al archivo
        int contadorTotal = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                int contadorLinea = 0; // Contador de palabras por línea
                String[] palabras = linea.split("\\s+"); // Separa las palabras por espacios en blanco

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) { // Ignora las palabras vacías
                        contadorLinea++;
                        contadorTotal++;
                    }
                }

                System.out.println("La línea tiene " + contadorLinea + " palabras.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("El archivo tiene en total " + contadorTotal + " palabras.");
    }
}
