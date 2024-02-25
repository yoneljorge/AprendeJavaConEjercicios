package Capitulo06;

/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 */

import MisFunciones.Aleatorio;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio20Cubo {
    public static void main(String[] args) {
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidadCuba = Integer.parseInt(System.console().readLine());

        int alturaCuba = capacidadCuba + 1;
        // ******Generamos la capacidad de la cuba de forma aleatoria.****/
        int litrosGenerados = Aleatorio.NumeroRandom(0, capacidadCuba);

        // ******Creamos la CUBA********/
        int lineasAntes = capacidadCuba - litrosGenerados;
        for (int i = 1, litros = litrosGenerados, lineas= lineasAntes; i <= alturaCuba; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == alturaCuba || j == 1 || j == 6) {
                    System.out.print("*");
                } else if (litros > 0) {
                    if (lineas > 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("=");
                    }
                } else {
                    System.out.print(" ");
                }
            } // End For2
              // Vamos restando los litros una vez que se van imprimiendo.
            if (i > lineasAntes && litros > 0) {
                litros--;
            }
            //Vamos restando los espacios antes de los litros.
            lineas --;
            //Salto de linea para dibujar la siguiente
            System.out.println("");
        } // End For
        System.out.printf("La cuba tiene una capacidad de %2d litros y contiene %2d litros de agua.", capacidadCuba,
                litrosGenerados);
    }
}
