package Capitulo04;

/**
 * Ecribe un programa que nos diga cuál es la primera cifra de un
 *  número entero introducido por teclado. Se permiten números de 
 * hasta 5 cifras.
 * 
 * @author Yonel J. Sánchez
 * 
 */

import java.util.Scanner;

public class S04Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int tamano = 0;
        int divisor = 1;
        
        System.out.println("Programa para buscar la primera cifra de un número");
        System.out.println("Introduzca un número");
        numero = sc.nextInt();
        tamano = Integer.toString(numero).length();
        //Divisor se va a ir multiplicando por 10 en dependencia de la cantidad 
        //de lugares que tenga el número 
        for(int i = 1; i < tamano; i ++){
            divisor = divisor * 10;
        }
        numero = numero / divisor;
        System.out.println(numero);
        sc.close();
    }
}
