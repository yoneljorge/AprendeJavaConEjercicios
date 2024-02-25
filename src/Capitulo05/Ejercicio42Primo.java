package Capitulo05;

/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 17
 * 17 es primo
 * 18 no es primo
 * 19 es primo
 * 20 no es primo
 * 21 no es prim
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio42Primo {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= 5; i++) {
            boolean primo = true;
            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    primo = false;
                }

            }
            if (primo) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo");
            }
            numero++;
        }
    }
}
