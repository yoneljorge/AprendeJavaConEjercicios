package Capitulo0702;

import MisFunciones.Aleatorio;
import MisFunciones.Arrays.Mostrar;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[][] lista = new int[8][12];

        for(int i =0; i <lista.length; i++){
            for(int j =0; j <lista[0].length; j++){
                lista[i][j] = Aleatorio.NumeroRandom(0, 100);
            }
        }

        Mostrar.TablaEnteros(lista,false, false);
    }
}
