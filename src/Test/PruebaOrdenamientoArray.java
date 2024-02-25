package Test;

import MisFunciones.Aleatorio;

public class PruebaOrdenamientoArray {
    public static void main(String[] args) {
        int[] arregloDesordenado = new int[100];
        int[] arregloOrdenado = new int[100];

        for (int i = 0; i < arregloDesordenado.length; i++) {
            arregloDesordenado[i] = Aleatorio.NumeroRandom(1, 100);
        }

        boolean cambio = true;

        // Mientras "cambio" sea verdadero, sigue ordenando la lista
        while (cambio) {

            // Establecer "cambio" en false para indicar que no se han hecho cambios todavía
            cambio = false;

            // Recorrer la lista de números hasta el penúltimo elemento
            for (int i = 0; i < arregloDesordenado.length - 1; i++) {
                // Si el elemento actual es mayor que el siguiente, intercambiarlos
                if (arregloDesordenado[i] > arregloDesordenado[i + 1]) {
                    int temporal = arregloDesordenado[i];
                    arregloDesordenado[i] = arregloDesordenado[i + 1];
                    arregloDesordenado[i + 1] = temporal;
                    
                    arregloOrdenado[i] = arregloDesordenado[i +1];
                    

                    // Establecer "cambio" en true para indicar que se ha hecho un cambio
                    cambio = true;
                } // End If
            } // End For
        } // En While

        System.out.println("Arreglo desordenado");
        for(int i =0; i <100; i++){
            System.out.print(arregloDesordenado[i] + "  ");
        }

        System.out.println("Arreglo ordenado");
        for(int i =0; i <100; i++){
            System.out.print(arregloOrdenado[i] + "  ");
        }
    }//main

}
