package Capitulo05;

/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        int suma = 0;
        int numero =0;
        int media =0;
        int contador = 0;
        do {
            System.out.print("Introduzca un número: ");
            numero = Integer.parseInt(System.console().readLine());

            suma = suma + numero;
            contador ++;
            media = suma / contador;
        } while (suma < 1000);

        System.out.println("Total acumulado: " + suma);
        System.out.println("Cantidad de número introducidos: " + contador);
        System.out.println("La media de los número introducidos: " + media);
    }
}
