package Capitulo05;

/*
* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7
*/
/**
*@author Yonel J. Sánchez
*/

import java.util.Scanner;

public class Ejercicio18 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero1 = LeerNumero("Introduzca el primer número: ");
        int numero2 = 0;

        do { //-> Validar que los número no sean iguales
            numero2 = LeerNumero("Introduzca el segundo número: "); 
            if (numero1 == numero2) {
                System.out.println("Los números no pueden ser iguales");
                continue;
            }else{
                break;
            }
        } while (true);

        int aux = 0;
        if(numero2 < numero1){ //-> En caso de que el número2 sea menor que uno se intercambian
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        for(int i = 7; numero1 < numero2 ; i = i +7){
            System.out.println(numero1);
            numero1 = numero1 + i;
        }
    }

    public static int LeerNumero(String imprimir){
        int numero = 0;
        do { //Verificar que se introduzca un entero positivo
            System.out.print(imprimir);

            if (sc.hasNextInt()) { //-> Verificar que sea un entero
                numero = Integer.parseInt(sc.next());
                if(numero <= 0){ //-> Verificar que sea positivo
                    System.out.println("El número no es positivo");
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
        return numero;
    }
}
