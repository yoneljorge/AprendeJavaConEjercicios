package Capitulo05;

/**
* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
*/

/**
*@author Yonel J. Sánchez  
*/

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int numero = 0;

        do { //Verificar que se introduzca un entero positivo
            System.out.print("Introduzca un número entero positivo: ");

            if (sc.hasNextInt()) { //-> Verificar que sea un entero
                numero = Integer.parseInt(sc.next());
                if(numero <= 0){ //-> Verificar que sea positivo
                    System.out.println("El número no es positivo");
                    sc.next();
                    continue;
                }else{
                    break;
                }
            }else{
                System.out.println("No ha introducido un número");
                sc.next();
                continue;
            }
        } while (true);

        int resultado = 0;
        for(int i = 0; i < 100; i ++){
            resultado = resultado + numero;
            numero ++;
        }
        System.out.println(resultado);
        sc.close();
    }
}
