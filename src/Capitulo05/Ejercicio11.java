package Capitulo05;

/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */

/**
 * @author Yonel J. Sánchez 
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = Integer.parseInt(sc.next());

        for (int i = 0; i < 5; i++) {
            System.out.printf("%5d  %5d  %5d\n", numero, (int)Math.pow(numero, 2), (int)Math.pow(numero, 3));
            numero = numero + 1;
        }
        sc.close();
    }
}
