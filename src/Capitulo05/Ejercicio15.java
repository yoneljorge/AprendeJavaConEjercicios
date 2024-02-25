package Capitulo05;

/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
*/

import java.util.Scanner;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base de la potencia: ");
        int base = Integer.parseInt(sc.next());
        System.out.print("Introduzca el exponente: ");
        int exponente = Integer.parseInt(sc.next());

        int potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia = potencia * base;
            System.out.println(base + "^" + (i + 1) + " = " + potencia);
        }
        sc.close();
    }
}
