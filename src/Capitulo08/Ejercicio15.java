package Capitulo08;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Yonel J. Sánchez
 * 
 */

import MisFunciones.Matematica;

public class Ejercicio15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (Matematica.esPrimo(i)) {
                System.out.print("  " + i + "  ");
            }
            ;
        }
    }
}
