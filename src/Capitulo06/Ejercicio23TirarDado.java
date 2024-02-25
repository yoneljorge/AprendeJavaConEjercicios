package Capitulo06;
/**
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As 7
 */

import MisFunciones.Aleatorio;
import MisFunciones.Dado;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio23TirarDado {
    public static void main(String[] args) {
        for(int i =1; i <=5; i++){
            System.out.print(Dado.Tirar(Aleatorio.NumeroRandom(1, 6)) + " ");
        }
    }
}
