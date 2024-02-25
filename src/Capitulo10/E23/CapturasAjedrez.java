package Capitulo10.E23;

import java.util.ArrayList;

import MisFunciones.Aleatorio;

public class CapturasAjedrez {
    public static void main(String[] args) {
        ArrayList<String> piezas = new ArrayList<String>();
        piezas.add("Dama");
        piezas.add("Torre");
        piezas.add("Torre");
        piezas.add("Alfil");
        piezas.add("Alfil");
        piezas.add("Caballo");
        piezas.add("Caballo");
        for (int i = 0; i < 9; i++) {
            piezas.add("Peón");
        }
        ArrayList<String> listaCapturas = new ArrayList<String>();

        int cantCapturas = Aleatorio.NumeroRandom(0, 15);
        int puntosTotales = 0;

        if(cantCapturas != 0){
            for (int i = 0; i < cantCapturas; i++) {
                do {
                    int indice = Aleatorio.NumeroRandom(0, 15);
                    if (!piezas.get(indice).equals("LIBRE")) {
                        listaCapturas.add(piezas.get(indice));
                        piezas.set(indice, "LIBRE");
                        break;
                    }
                } while (true);
            }
        }else{
            System.out.println("No hubo capturas.");
        }
        
        System.out.println("Fichas capturadas por el jugador.");
        for(String a: listaCapturas){
            switch (a) {
                case "Dama" ->{
                    System.out.printf("%s (%d peones)\n",a,9);
                    puntosTotales += 9;
                }
                case "Torre" ->{
                    System.out.printf("%s (%d peones)\n",a,5);
                    puntosTotales += 5;
                }
                case "Alfil" ->{
                    System.out.printf("%s (%d peones)\n",a,3);
                    puntosTotales += 3;
                }
                case "Caballo" ->{
                    System.out.printf("%s (%d peones)\n",a,2);
                    puntosTotales += 2;
                }
                case "Peón" ->{
                    System.out.printf("%s (%d peones)\n",a,1);
                    puntosTotales += 1;
                }
            }
        }
        System.out.println("Puntos totales: " + puntosTotales + " peones.");
    }
}
