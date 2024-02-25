package Capitulo05;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Con este programa usted introduce un número y el lo vira al revés");
        System.out.print("Introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero > 9) {
            String numeroCadena = String.valueOf(numero);
            for (int i = numeroCadena.length(),aux = numeroCadena.length() -1; i > 0; i--,aux --) {
                System.out.print(numeroCadena.substring(aux, i));
            }
        }
    }
}
