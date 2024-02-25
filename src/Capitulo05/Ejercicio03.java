package Capitulo05;

/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author Yonel J. Sánchez
 * 
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 5 == 0) {
                System.out.print(" - " + i);
            }
            i++;
        } while (i <= 100);
    }
}
