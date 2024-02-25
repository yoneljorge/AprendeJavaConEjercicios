package Capitulo10;

import java.util.ArrayList;

import MisFunciones.Aleatorio;
import MisFunciones.Arrays.Buscar;
public class Ejercicio02 {
    public static void main(String[] args) {
        //*Creando el ArrayList */
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int sizeArray = Aleatorio.NumeroRandom(10, 20);

        //*Llenando el ArrayList */
        int suma =0;
        for(int i = 0; i < sizeArray; i ++){
            lista.add(i, Aleatorio.NumeroRandom(0, 100));
            suma +=lista.get(i);
        }

        //*Buscar el valor máximo y el mínimo */
        int maximo = Buscar.MaximoValor(lista);
        int minimo = Buscar.MinimoValor(lista);
        
        //*Imprimir el resultado */
        System.out.println("Suma del ArrayList: " + suma);
        System.out.println("Máximo valor del ArrayList: " + maximo);
        System.out.println("Mínimo valor del ArrayList: " + minimo);
        System.out.printf("Media del ArrayList: %.2f\n", (double) suma / lista.size());

        System.out.println("Imprimir los valores del ArrayList");
        for(int x: lista){
            System.out.println(x);
        }
    }
}
