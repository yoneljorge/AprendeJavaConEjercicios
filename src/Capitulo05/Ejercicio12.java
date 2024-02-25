package Capitulo05;

/*
 * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 */

/**
 * @ Yonel J. Sánchez
 */
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de número Fibonacci que desea que se muestre: ");
        int n = Integer.parseInt(sc.next());
        int a = 0; //-> Primer valor
        int b = 1; //-> Segundo valor
        int c = 0; //-> Tercer valor

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a + ".");
            } else {
                System.out.print(a + ", ");
            }
            c = a + b; // Tercer valor es igual a la suma del primero con el segundo
            a = b; // -> Corremos los valores, el primero es igual al segundo
            b = c; // -> Corremos el tercero al segundo para iniciar una nueva iteración
        }
        sc.close();
    }
}
