package Capitulo04;

/**
 * Escribe un programa que diga cuál es la última cifra de un número entero 
 * introducido por teclado
 * 
 * @author Yonel J. Sánchez
 * 
 */

 import java.util.Scanner;
 import java.io.*;

public class S04Ejercicio17{

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numero = 0;
        //String numeroString = ""; 
        //int tamanoString = 0;
        
        System.out.println("Programa para saber cual es la última cifra de un número\n");
        System.out.println("Introduzca el número");
        numero = sc.nextInt();
        //Se imprime el residuo del numero con lo cual seria el último número
        System.out.println(numero % 10);

        /*
         * //Convertimos el número entero a string para luego contar su tamaño
        numeroString = Integer.toString(numero);
        tamanoString = numeroString.length();
        int i = tamanoString - 1;
        numeroString = numeroString.substring(i, tamanoString);
        
        if(numero <= 0){
            System.out.println("El número no puede ser menor que cero");
        }else if(numero <= 9){
            System.out.println(numero);
        }else{
            System.out.println(numeroString);
        }
         */
    }
}