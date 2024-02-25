package Capitulo0701;

import MisFunciones.Aleatorio;

/**
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla
 */

import MisFunciones.Arrays.Buscar;
import MisFunciones.Arrays.Mostrar;

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        // *Generando el array de 10 números */
        int[] lista = Aleatorio.ArregloEnteros(10, 0, 100);
        

        // *Pedimos el número al usuario y comprobamos que el número se encuentre */
        int numero = 0;
        do {
            System.out.print("Introduzca un número: ");
            numero = Integer.parseInt(System.console().readLine());
            if (Buscar.EncontrarNumero(lista, numero)) {
                break;
            } else {
                System.out.print("El número no se encuentra en la lista.");
            }
        } while (true);

        System.out.println("Lista original");
        Mostrar.EnterosHorizontal("  ", lista, "  ");

        Rotar(lista, numero);

        System.out.println("Lista rotada");
        Mostrar.EnterosHorizontal("  ", lista, " ");

    }

    public static void Rotar(int[] lista, int nu){
        while(lista[0] != nu){
            for(int i =0; i <lista.length-1; i++){
                int aux = lista[i + 1];
                lista[i +1] = lista[i];
                lista[i] = aux;
            }
        }
    }
}
