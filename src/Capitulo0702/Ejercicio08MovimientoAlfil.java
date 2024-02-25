package Capitulo0702;

import MisFunciones.Ajedres;

/**
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como
 * se
 * indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta
 * con
 * 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las
 * filas
 * se indican del 1 al 8.
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio08MovimientoAlfil {
    public static void main(String[] args) {
        // *Creamos el arreglo del tablero */
        String[][] tablero = new String[8][8];
        //Lo rellenamos con espacios para que no se imprima un "null".
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] =" ";
            }
        }

        // *Pedir las coordenadas del alfil */
        System.out.println("Introduzca las cooredenadas del alfil.");
        System.out.print("Coordenada y: ");
        int y = Integer.parseInt(System.console().readLine());
        System.out.print("Coordenada x: ");
        int x = Integer.parseInt(System.console().readLine());

        int yAumento;
        int xAumento;
        // *Trazar diagonal superior izquierda */
        yAumento = y - 1;
        xAumento = x - 1;
        while (yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0) {
            yAumento--;
            xAumento--;
            if(yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0){
                tablero[yAumento][xAumento] = "♗";
            }
            
        }

        // *Trazar diagonal superior derecha */
        yAumento = y - 1;
        xAumento = x - 1;
        while (yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0) {
            yAumento--;
            xAumento++;
            if(yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0){
                tablero[yAumento][xAumento] = "♗";
            }
        }

        // *Trazar diagonal inferior izquierda */
        yAumento = y - 1;
        xAumento = x - 1;
        while (yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0) {
            yAumento++;
            xAumento--;
            if(yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0){
                tablero[yAumento][xAumento] = "♗";
            }
        }

        // *Trazar diagonal inferior derecha */
        yAumento = y - 1;
        xAumento = x - 1;
        while (yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0) {
            yAumento++;
            xAumento++;
            if(yAumento <= 7 && yAumento >= 0 && xAumento <= 7 && xAumento >= 0){
                tablero[yAumento][xAumento] = "♗";
            }
        }

        //Mostramos las casillas a las que podría saltar el alfil
        System.out.println("\nMostrando las casillas a las que podría saltar el alfil\n");
        Ajedres.Mostrar(tablero);

        Ajedres.Alfil("f4");
    }
}
