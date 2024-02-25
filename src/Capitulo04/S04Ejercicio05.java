package Capitulo04;

/**
 *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0). 
 * 
 * @author Yonel J. Sánchez Cantillo
 * 
 */
import java.util.Scanner;

public class S04Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double x = 0;

        System.out.println("-----------------------------");
        System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
        System.out.println("Por favor introduzca el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Ahora introuzca el valor de b");
        b = sc.nextDouble();
        
        x = (-(b)) / a;

        System.out.println("x = " + x);
        sc.close();
    }
}
