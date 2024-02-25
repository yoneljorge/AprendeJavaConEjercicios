package Capitulo05;

/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        int numero = 0;
        int cantidadNumeros =0;

        int impares = 0;
        double imparesMedia =0;

        int paresMayor = Integer.MIN_VALUE;

        do 
        { // Con este método ejecutamos el programa hasta que el usuario introduzca un
             // número negativo
            System.out.print("Introduzca un número: ");
            // Notificamos al usuario de que el programa no puede ser ejecutado fuera de una
            // consola
            if (System.console() != null) {
                numero = Integer.parseInt(System.console().readLine());
            } else {
                System.out.println("Necesita ejecutar el código en una terminal");
            }
            cantidadNumeros++;

            if (numero <= 0) break;
                
            if (numero % 2 == 0) {
                if (numero > paresMayor) {
                    paresMayor = numero;
                }
            }else{
                imparesMedia += numero;
                impares ++;
            }
        }while (true);

        if(impares > 0){
            imparesMedia /= impares;
        }

        // Mostramos por pantalla los resultados
        System.out.println("Se han introducido " + (cantidadNumeros -1 ) + " números");
        System.out.println("La media de los impares es: " + imparesMedia);
        System.out.println("El mayor de los pares es: " + paresMayor);

    }
}
