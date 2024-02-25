package Capitulo10.E12;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Carta, Integer> cartaValor = new HashMap<Carta, Integer>();
        ArrayList<Carta> cartaSecuencia = new ArrayList<Carta>();
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            Carta cartaAux = new Carta();
            do {
                cartaAux = new Carta();
            } while (cartaValor.containsKey(cartaAux));
            cartaValor.put(cartaAux, cartaAux.getValor());
            cartaSecuencia.add(cartaAux);
        }

        for (Carta a : cartaSecuencia) {
            suma += cartaValor.get(a);
            System.out.println(a);
        }

        System.out.println("Tiene " + suma + " puntos.");

    }
}
