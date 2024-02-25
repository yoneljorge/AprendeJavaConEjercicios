package MisFunciones.Arrays;

import java.util.ArrayList;

public class Impares {
    public static int[] GenerarLista(int[] array) {
        // Creamos una lista dinámica para ir agregando los pares
        ArrayList<Integer> imparesList = new ArrayList<Integer>();
        // Buscamos los números pares en el arreglo y lo agregamos a la nueva lista.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                imparesList.add(array[i]);
            }
        }
        // ********Convertimos el ArrayList en un arreglo*/
        int tamanoArrayList = imparesList.size(); // ?Obtenemos el tamaño del ArrayList
        int[] imparesArray = new int[tamanoArrayList]; // ?Creamos el array que vamos a pasar.
        // ?Convertimos el ArrayList en un array.
        for (int i = 0; i < imparesArray.length; i++) {
            imparesArray[i] = imparesList.get(i);
        }

        return imparesArray;
    }
}
