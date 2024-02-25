package Capitulo10;

import MisFunciones.Aleatorio;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < 10; i ++){
            lista.add(i, Aleatorio.NumeroRandom(0, 100));
        }
        System.out.println("Lista desordenada");
        for(int x: lista){
            System.out.println(x);
        }

        Collections.sort(lista);

        System.out.println("Lista ordenada");
        for(int x: lista){
            System.out.println(x);
        }
    }
}
