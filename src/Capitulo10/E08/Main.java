package Capitulo10.E08;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> listaCarta = new ArrayList<Carta>();

        // *Generando las 10 cartas */
        for (int i = 0; i < 10; i++) {
            Carta carta;
            do {
                carta = new Carta();
                System.out.println((1 + i) + "-->" + carta);
            } while (listaCarta.contains(carta));
            listaCarta.add(carta);
        }

        // *Imprimiendo las cartas */
        for (int i = 0; i < listaCarta.size(); i++) {
            System.out.println(listaCarta.get(i));
        }

        //*Ordenando las cartas */
        Collections.sort(listaCarta);
        System.out.println("Ordenada");
        for (int i = 0; i < listaCarta.size(); i++) {
            System.out.println(listaCarta.get(i));
        }

        System.exit(0);
    }

    public static boolean existeCarta(ArrayList<Carta> lista, Carta cartaAComparar) {
        boolean existeCarta = false;
        int i = 0;
        while (!existeCarta && i < lista.size()) {
            if (lista.get(i).equals(cartaAComparar)) {
                existeCarta = true;
            }
            i++;
        }
        return existeCarta;
    }
}
