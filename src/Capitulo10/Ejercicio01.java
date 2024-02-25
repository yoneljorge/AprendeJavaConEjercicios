package Capitulo10;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 */

/**
  * @author Yonel J. Sánchez
  */
import java.util.ArrayList;

public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<String> companerosClase = new ArrayList<String>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Introduzca el nombre de el compañero #" + (i + 1) + ": ");
            String valor = System.console().readLine();
            companerosClase.add(valor);
        }

        System.out.println("Imprimiendo el ArrayList");
        for(String valor: companerosClase){
            System.out.println(valor);
        }
    }
}
