package Test;

import MisFunciones.Aleatorio;

public class PruebaArregloNumerosAleatorio {
    public static void main(String[] args) {
        int[] arregloDesordenado = new int[100];

        for (int i = 0; i < arregloDesordenado.length; i++) {
            arregloDesordenado[i] = Aleatorio.NumeroRandom(1, 100);
        }

        System.out.println("Arreglo desordenado");
        for (int i = 0; i < arregloDesordenado.length; i++) {
            System.out.print(arregloDesordenado[i] + "  ");
        }
        // ?Mediante la funcion ordenar del paquete arrays ordena el arreglo de enteros.
        MisFunciones.Arrays.Ordenar.Integer(arregloDesordenado);

        System.out.println("\nArreglo ordenado");
        for (int i = 0; i < arregloDesordenado.length; i++) {
            System.out.print(arregloDesordenado[i] + "  ");
        }
    }
}
