package Capitulo0702;

import MisFunciones.Aleatorio;
import MisFunciones.Arrays.Mostrar;

/**
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe
 * tener 12 filas por 12 columnas y debe contener números generados al azar
 * entre 0 y
 * 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
 * con los números convenientemente alineados.
 * 
 * @author Yonel J. Sánchez
 * 
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        // * Creamos la matriz de enteros. */
        int[][] matriz = Aleatorio.MatrizEnteros(12, 12, 0, 100);

        // *Mostramos la matriz */
        System.out.println("Sin Ordenar");
        Mostrar.MatrizEnteros(matriz);

        int aux = matriz[0][0]; // -> Variable en la que se va a ir alamacenando el valor a rotar temporalmente.
        int aux2 = 0;
        // *Rotamos un caracter en sentido de las agujas del reloj */
        // Rotamos la primera fila.
        for (int co = 0; co < 11; co++) {
            aux2 = matriz[0][co + 1];
            matriz[0][co + 1] = aux;
            aux = aux2;
        }

        //Rotamos la última columna
        for (int fi = 1; fi < 12; fi++) {
            aux2 = matriz[fi][11];
            matriz[fi][11] = aux;
            aux = aux2;
        }

        //Rotamos la última fila
        for (int co = 11; co >= 1; co--) {
            aux2 = matriz[11][co -1];
            matriz[11][co -1] = aux;
            aux = aux2;
        }
        
        //Rotamos la primera columna
        for (int fi = 11; fi >= 0; fi--) {
            aux2 = matriz[fi][0];
            matriz[fi][0] = aux;
            aux = aux2;
        }
        System.out.println("\nOrdenada\n");
        Mostrar.MatrizEnteros(matriz);

    }
}
