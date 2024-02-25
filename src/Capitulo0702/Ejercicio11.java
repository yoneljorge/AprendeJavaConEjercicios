package Capitulo0702;

import MisFunciones.Aleatorio;
import MisFunciones.Arrays.Mostrar;

/**
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el
 * mínimo y la media de los números que hay en esa diagonal.
 * 
 * @author Yonel J. Sánchez
 * 
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        // *Generamos la matriz */
        int[][] matriz = Aleatorio.MatrizEnteros(10, 10, 200, 300);
        // *Mostramos la matriz */
        System.out.println("Matriz original");
        Mostrar.MatrizEnteros(matriz);

        // *Creando diagonal */
        System.out.println("Diagonal de la matriz");
        int yCoorDiagonal = 0;
        int xCoorDiagonal = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(f == yCoorDiagonal && c == xCoorDiagonal){
                    System.out.print("  " + matriz[f][c] + " ");;
                }else{
                    System.out.print("      ");
                }
            }
            System.out.println("");
            yCoorDiagonal++;
            xCoorDiagonal++;
        }
    }
}
