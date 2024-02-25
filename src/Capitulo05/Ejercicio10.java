package Capitulo05;

/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 */
/**
 * @author Yonel J. Sánchez
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int suma = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Programa con el cual vamos a calcular la media de los números introducidos");
        do {
            System.out.println("Introduca un número positivo: ");
            contador++;
            numero = Integer.parseInt(sc.next());
            if (numero >= 0) {
                suma = suma + numero;
                continue;
            }else{
                System.out.println("Saliendo....");
                break;
            }
        } while (true);
        media = suma / contador;
        System.out.println("La media de los números introducidos es " + media );
        sc.close();
    }
}
