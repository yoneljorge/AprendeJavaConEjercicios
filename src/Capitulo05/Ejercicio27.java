package Capitulo05;

/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());

        int suma = 0;
        int contar = 0;
        int multiplicacion = 1;

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                suma += 3;
                contar++;
                multiplicacion *= 3;
                System.out.println(i);
            }
        }

        System.out.println("Entre el 1 y el " + numero + " hay " + contar + " tres(3).");
        System.out.println("La suma de los múltiplos de 3 es " + suma);
        System.out.println("La multiplicación de los múltiplos de 3 es " + multiplicacion);
    }
}
