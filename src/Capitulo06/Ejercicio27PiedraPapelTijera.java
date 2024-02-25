package Capitulo06;

/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
 */

import MisFunciones.Aleatorio;
import MisFunciones.PiedraPapelTijera;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio27PiedraPapelTijera {
    public static void main(String[] args) {

        int opcion = 0;
        do {
            // *Menu para la selección del usuario */
            System.out.println("");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.print("Seleccione una opción(1-3): ");
            int jugador1 = 0;
            // * Comprobamos que el usuario introduzca una opción correcta */
            do {
                jugador1 = Integer.parseInt(System.console().readLine());
                if (jugador1 <= 3 && jugador1 >= 1) {
                    break;
                }
            } while (true);

            // *Turno del ordenador */
            int jugador2 = Aleatorio.NumeroRandom(1, 3);
            System.out.print("\n-> Turno del ordenador: ");
            System.out.println(PiedraPapelTijera.GenerarPiedraPapelTijera(jugador2) + "\n");

            // *Buscamos el ganador */
            String jugada = PiedraPapelTijera.Jugada(jugador1, jugador2).toLowerCase();

            // *Imprimimos el resultado */
            switch (jugada) {
                case "empate" -> {
                    System.out.println("Hay un empate.\n");
                    break;
                }
                case "jugador1" -> {
                    System.out.println("¡Epa! Has ganado.\n");
                    break;
                }
                case "jugador2" -> {
                    System.out.println("Gana la computadora.\n");
                    break;
                }
            }

            // *Menu para seleccinar que hacer. */
            System.out.println("1. Repetir");
            System.out.println("2. Salir");
            System.out.println("Seleccione una opción(1-2): ");

            // *Comprobamos datos de la selección */
            do {
                opcion = Integer.parseInt(System.console().readLine());
                if (opcion <= 2 && opcion >= 1) {
                    break;
                }
            } while (true);

        } while (opcion != 2);

    }
}
