package Capitulo06;

/**
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
 */

import MisFunciones.Aleatorio;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio22Serpiente {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());

        int planta = 1;
        int serpenteo = 0;
        int espacios = 13;
        while (planta <= longitud) {

            if (planta != 1) {
                serpenteo = Aleatorio.NumeroRandom(1, 3);
                espacios = 11 + serpenteo;
            }
            for (int i = 1; i <= espacios; i++) {
                if (i == espacios) {
                    if (planta == 1) {
                        // *Dibujamos la cabeza de la serpiente */
                        System.out.print("@");
                    } else {
                        // *Dibujamos el cuerpo de la serpiente */
                        System.out.print("*");
                    }
                } else {
                    //*Ponemos los espacios delante */
                    System.out.print(" ");
                }
            } // End For
            planta++;
            System.out.println("");
        } // End While
    }
}
