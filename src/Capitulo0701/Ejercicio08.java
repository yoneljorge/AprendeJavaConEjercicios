package Capitulo0701;

import MisFunciones.Aleatorio;
import MisFunciones.Calendario;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
 */
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        int[] listaTemp = new int[12];
        System.out.println("Ingrese la temperatura media que ha hecho en cada mes\n");
        for (int i = 0; i < listaTemp.length; i++) {
            System.out.print("Introduzca la temperatura del mes de " + Calendario.Mes(i) + ": ");
            listaTemp[i] = Aleatorio.NumeroRandom(0, 40);
        }

        for(int i =0; i < listaTemp.length; i++){
            for(int j =1; j <= listaTemp[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
