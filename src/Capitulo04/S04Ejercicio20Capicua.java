package Capitulo04;

/**
 * Realizar un programa que nos diga si un número entero positivo introducido 
 * por teclado es capicúa. Se permiten núneros de hasta 5 cifras.
 * 
 * @author Yonel J. Sánchez
 * 
 */

 import java.util.Scanner;

public class S04Ejercicio20Capicua{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int tamano = 0;
        int beginIndex = 0;
        int endIndex = 0;

        String numeroString = "";
        System.out.println("Programa mediante el cual se sabe si un número de 5 dígitos es capicúa");
        System.out.println("Introduzca el número");
        numero = sc.nextInt();

        tamano = Integer.toString(numero).length();
        endIndex = tamano;
        beginIndex = tamano - 1;

        if(tamano == 1){
            System.out.println("El número introducido solo tiene un lugar ");
        }else{
            for(int i = 0; i < tamano; i ++){
                numeroString = numeroString + Integer.toString(numero).substring(beginIndex,endIndex);
                endIndex = endIndex -1;
                beginIndex = beginIndex -1;
            }
        }
        if(numero == Integer.parseInt(numeroString)){
            System.out.println("Capucúa");
        }else{
            System.out.println("No hay capicúa");
        }
        sc.close();
    }
}