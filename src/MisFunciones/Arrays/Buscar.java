package MisFunciones.Arrays;

import java.util.ArrayList;
public class Buscar {
    
    /**
     * Funcion que muestra el máximo valor de un arreglo de números.
     * 
     * @param array : Arreglo de enteros.
     * @return <code>maximo</code> el valor maximo del arreglo.
     */
    public static int MaximoValor(int[] array) {
        int maximo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        return maximo;
    }

    /**
     * Funcion que muestra el máximo valor de un ArryList de números enteros.
     * 
     * @param array : Arreglo de enteros.
     * @return <code>maximo</code> el valor maximo del arreglo.
     */
    public static int MaximoValor(ArrayList<Integer> lista){
        int maximo = lista.get(0);

        for (int x: lista) {
            if (x > maximo) {
                maximo = x;
            }
        }

        return maximo;
    }

    /**
     * Función que muestra el mínimo valor de un arreglo.
     * @param array : Arreglo de enteros.
     * @return <code>minimo</code> el valor minimo del arreglo.
     */
    public static int MinimoValor(int[] array){
        int minimo = array[0];
        for(int i =1; i < array.length;  i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
        }

        return minimo;
    }

    /**
     * Función que muestra el mínimo valor de un ArrayList.
     * @param array : Arreglo de enteros.
     * @return <code>minimo</code> el valor minimo del arreglo.
     */
    public static int MinimoValor(ArrayList<Integer> lista){
        int minimo = lista.get(0);
        for(int x: lista){
            if(x < minimo){
                minimo = x;
            }
        }

        return minimo;
    }

    /**
     * Función que calcula la media de un arreglo de enteros.
     * @param array : Arreglo de enteros.
     * @return <code>media</code> el valor de la media del arreglo.
     */
    public static double Media(int[] array){
        double media = 0;
        for(int i = 0; i < array.length; i++){
            media += array[i]; 
        }

        media /= array.length;

        return media;
    }

    /**
     * Función que sirve para buscar un número en una lista
     * @param lista La lista en la que queremos encontrar el número.
     * @param nu El número que queremos buscar
     * @return <code>encontrado</code> devuelve si se ha encontrado el número.
     */
    public static boolean EncontrarNumero(int[] lista, int nu){
        boolean encontrado = false;
        for(int i =0; i <lista.length; i++ ){
            if(lista[i] == nu){
                encontrado = true;
            }
        }

        return encontrado;
    }
}
