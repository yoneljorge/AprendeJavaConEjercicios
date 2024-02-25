package Capitulo05;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */

 /**
  * @author Yonel J. Sánchez
  *
  */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el número del cual desea la tabla de multiplicar: ");
        int numero = Integer.parseInt(sc.next());

        for(int i = 0; i <= 10; i ++){
            System.out.println( i + " * " + numero + " = " + i * numero);
        }
        sc.close();
    }
}
