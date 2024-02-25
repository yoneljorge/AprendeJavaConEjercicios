package Capitulo06;
/**
 * Realiza un programa que sea capaz de recolocar los números de un array de
fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
del array. A continuación generará un array con ese tamaño con números
enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
irá colocando desde fuera hacia adentro los números de tal forma que el
primero se coloca en la primera posición, el segundo en la última, el tercero
en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
el array resultado.
 */

import MisFunciones.Aleatorio;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        //*Pedimos el tamaño al usuario de la lista */
        System.out.print("Introduzca el tamaño del array: ");
        int tamano = Integer.parseInt(System.console().readLine());
        //*Generamos la lista */
        int[] lista = new int[tamano];
        for(int i =0; i <lista.length; i++){
            lista[i] = Aleatorio.NumeroRandom(0, 200);

        }
        System.out.println("Array original:");
        System.out.print("Indice  ");
        for(int i =0; i < lista.length; i++){
            System.out.printf("%4d  ",i);
        }
        System.out.print("\nValor   ");
        for(int i =0; i < lista.length; i++){
            System.out.printf("%4d  ",lista[i]);
        }


        //*Generamos la lista que va a ser modificada */
        int aux =lista[1];
        for(int i = 1; i <lista.length; i++){
            if(i == lista.length -1){
                lista[i] = aux;
            }else{
                lista[i] = lista[i+1];
            }
        }

        System.out.println("\n\nArray resultado:");
        System.out.print("Indice  ");
        for(int i =0; i < lista.length; i++){
            System.out.printf("%4d  ",i);
        }
        System.out.print("\nValor   ");
        for(int i =0; i < lista.length; i++){
            System.out.printf("%4d  ",lista[i]);
        }
    }
}
