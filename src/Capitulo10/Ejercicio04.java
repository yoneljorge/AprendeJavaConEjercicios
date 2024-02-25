package Capitulo10;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        for(int i = 0; i < 6 ; i ++){
            System.out.print("Inroduzca el valor de " + i + ": ");
            lista.add(i, System.console().readLine());
        }
        System.out.println("Imprimir la lista desordenada");
        for(String x: lista){
            System.out.println(x);
        }
        Collections.sort(lista);

        System.out.println("Imprimir la lista ordenada");
        for(String x: lista){
            System.out.println(x);
        }
    }
}
