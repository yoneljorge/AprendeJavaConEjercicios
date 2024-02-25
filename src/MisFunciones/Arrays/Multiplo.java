package MisFunciones.Arrays;

import java.util.ArrayList;

public class Multiplo {

    public static int[] GenerarLista(int[] array, int x) {
        if(x==0){
            throw new IllegalArgumentException("No se puede dividir por 0.");
        }
        //Creamos una lista dinámica para ir agregando los multiplos de x.
        ArrayList<Integer> multiploList = new ArrayList<Integer>();
        //Buscamos los números pares en el arreglo y lo agregamos a la nueva lista.
        for(int i =0; i < array.length; i++){
            if(array[i] % x ==0){
                multiploList.add(array[i]);
            }
        }
        //********Convertimos el ArrayList en un arreglo*/
        int tamanoArrayList = multiploList.size(); //?Obtenemos el tamaño del ArrayList
        int[] multiploArray = new int[tamanoArrayList]; //?Creamos el array que vamos a pasar.
        //?Convertimos el ArrayList en un array.
        for(int i = 0; i < multiploArray.length; i++){
            multiploArray[i] = multiploList.get(i);
        }

        return multiploArray;
    }
}
