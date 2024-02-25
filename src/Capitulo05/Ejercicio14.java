package Capitulo05;

/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
*/
/**
 *@author Yonel J. Sánchez 
*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base de la potencia: ");
        int base = Integer.parseInt(sc.next());
        System.out.print("Introduzca el exponente: ");
        int exponente = Integer.parseInt(sc.next());

        int potencia = 1;
        for(int i =0; i < exponente; i++){
            potencia = potencia * base;
        }
        System.out.println(potencia);
        sc.close();
    }
}
