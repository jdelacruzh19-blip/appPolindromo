/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppolindromo;

import java.util.Scanner;

/**
 *
 * @author Jonat
 */
public class AppPolindromo {
    public boolean esPalindromo(String cadena) {
        return esPalindromoAuxiliar(cadena, 0, cadena.length() - 1);
    }

    private boolean esPalindromoAuxiliar(String cadena, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        
        if (cadena.charAt(inicio) != cadena.charAt(fin)) {
            return false;
        }
        
        return esPalindromoAuxiliar(cadena, inicio + 1, fin - 1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppPolindromo obj = new AppPolindromo(); 
        try (Scanner scaner = new Scanner(System.in)) {
            System.out.println("Ingrese una palabra o un texto:");
            String texto = scaner.nextLine();
            
            boolean resultado = obj.esPalindromo(texto);
            System.out.println("¿Es palíndromo?: " + resultado);
        }
    }
}

