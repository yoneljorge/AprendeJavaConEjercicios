package Capitulo06;
/**
 * Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25])
 */

import MisFunciones.Aleatorio;
import MisFunciones.Arrays.Mostrar;
import MisFunciones.Arrays.Multiplo;
import MisFunciones.Arrays.Primos;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        // * Creamos la lista
        int[] lista = new int[100];
        for(int i =0; i < lista.length; i ++){
            lista[i] = Aleatorio.NumeroRandom(10, 200);
        }
        //*-> Mostramos la lista */
        Mostrar.EnterosHorizontal("",lista," ");

        //*->Generamos y mostramos la lista de primos */
        int[] primos = Primos.GenerarLista(lista);
        System.out.println("Numeros primos");
        Mostrar.EnterosHorizontal("#", primos, "# ");

        //*->Generamos y mostramos los múltiplos de 5 */
        System.out.println("Múltiplos de 5");
        int[] multiplosCinco = Multiplo.GenerarLista(lista, 5);
        Mostrar.EnterosHorizontal("[", multiplosCinco, "] ");

    }
}
