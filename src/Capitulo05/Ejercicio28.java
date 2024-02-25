package Capitulo05;

/**
 * Escribe un programa que calcule el factorial de un número entero leído por
teclado.
Ejemplo:
Por favor, introduzca un número entero: 6
6! = 720
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número del cual quiere el factorial: ");
        int numero = Integer.parseInt(System.console().readLine());
        int factorial = 1;
        for(int i = numero; i > 0; i --){
            factorial = factorial * i;
        }
        System.out.println(numero + "! = " + factorial);
    }
}
