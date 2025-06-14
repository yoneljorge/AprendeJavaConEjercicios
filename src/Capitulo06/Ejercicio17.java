package Capitulo06;
/**
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
 */

import MisFunciones.Pecera;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.print("Por favor introduzca el alto de la pecera (como mínimo 4): ");
        int alto = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int ancho = Integer.parseInt(System.console().readLine());

        System.out.println("\n");

        Pecera.Generar(alto, ancho, 3);
    }
}
