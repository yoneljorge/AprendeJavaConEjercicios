package Capitulo05;

/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando
 * un bucle for.
 * 
 * @author Yonel J. Sánchez
 * 
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        for (int i = 320; i >= 160; i--) {
            if (i % 20 == 0) {
                System.out.println(i);
            }
        }
    }
}
