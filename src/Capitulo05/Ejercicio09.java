package Capitulo05;

/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
 */
/**
 * @author Yonel J. Sánchez
 */
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número: ");
        int numeroIntroducido = sc.nextInt();
        int numeroDeDigitos = 1;
        int numero = numeroIntroducido;

        while (numero >= 10) {
          numero /= 10;
          numeroDeDigitos ++; 
        }

        System.out.println("El número " + numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos.");
        sc.close();
    }
}
