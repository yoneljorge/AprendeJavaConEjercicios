package Capitulo08;

import MisFunciones.Matematica;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Yonel J. Sánchez
 * 
*/

public class Ejercicio16 {
    public static void main(String[] args) {
        for(int i =1; i <= 99999; i++){
            if(Matematica.esCapicua(i)){
                System.out.print(i + "  ");
            }
        }
    }
}
