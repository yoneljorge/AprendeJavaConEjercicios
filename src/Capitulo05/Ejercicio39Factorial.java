package Capitulo05;

/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 7
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 * 6! = 720
 * 7! = 5040
 */
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio39Factorial {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= numero; i++) {
            int factorial = 1;
            for (int j = 1; j<= i; j++) {
                factorial = factorial * j;
            }
            System.out.println(i + "! = " + factorial);
        }
    }
}
