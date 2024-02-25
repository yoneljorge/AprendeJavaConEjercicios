package Capitulo05;

/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 */
/**
 * @author Yonel J. Sánchez
 *
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) { // -> Solicitamos los 10 números 
            System.out.print("Introduzca el #" + (i + 1) + ": ");
            valor = Integer.parseInt(sc.next());
            if (valor > 0) {
                positivos ++;
            }
            if (valor < 0) {
                negativos ++;
            }
        }
        System.out.println("Hay " + positivos + " números positivos y " + negativos + " negativos.");
        sc.close();
    }
}
