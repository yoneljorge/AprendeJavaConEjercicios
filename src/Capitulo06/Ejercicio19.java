package Capitulo06;

/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
 */

import MisFunciones.Aleatorio;
import MisFunciones.Arrays.Buscar;
import MisFunciones.Arrays.Impares;
import MisFunciones.Arrays.Mostrar;
import MisFunciones.Arrays.Pares;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        //**Creamos la lista de enteros aleatorios entre 100 y 200 */
        int[] lista = new int[50];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Aleatorio.NumeroRandom(100, 200);
        }

        System.out.println("Mostrar lista de enteros");
        Mostrar.EnterosHorizontal("",lista, "  ");

        int[] listaPares = Pares.GenerarLista(lista);
        int[] listaImpares = Impares.GenerarLista(lista);

        System.out.println("Máximo valor de los pares " + Buscar.MaximoValor(listaPares));
        System.out.println("Mínimo valor de los impares " + Buscar.MinimoValor(listaImpares));
        System.out.println("Media de todos los números generados " + Buscar.Media(lista));
    }
}
