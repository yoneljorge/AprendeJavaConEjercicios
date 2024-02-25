package MisFunciones.Arrays;

import java.util.ArrayList;

public class Primos {

    /**
     * Funcion que genera un arreglo de números primos a partir de otro arrglo de
     * números.
     * 
     * @param array
     * @return <code>listaArray</code> retorna el arreglo de número primios.
     */
    public static int[] GenerarLista(int[] array) {
        // Creamos una lista dinámica para ir agregando los numeros primos.
        ArrayList<Integer> lista = new ArrayList<Integer>();
        // Buscamos los números primos en el arreglo y lo agregamos a la nueva lista.
        for (int i = 0; i < array.length; i++) {
            boolean primo = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                lista.add(array[i]);
            }
        }

        // ********Convertimos el ArrayList en un arreglo*/
        int tamanoArrayList = lista.size(); // ?Obtenemos el tamaño del ArrayList
        int[] listaArray = new int[tamanoArrayList]; // ?Creamos el array que vamos a pasar.
        // ?Convertimos el ArrayList en un array.
        for (int i = 0; i < listaArray.length; i++) {
            listaArray[i] = lista.get(i);
        }
        return listaArray;
    }

}
