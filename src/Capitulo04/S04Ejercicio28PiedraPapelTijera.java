package Capitulo04;

/**
 * Implementa el juego piedra, papel y tijeras. Primero, el usuario 1 introduce 
 * su jugada y luego el usuario 2. Su alguno de los ususarios introduce una opción 
 * incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * @author Yonel J. Sánchez
 * 
 */

import java.util.Scanner;

public class S04Ejercicio28PiedraPapelTijera {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = leer();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = leer();

        if (jugador1.equals(jugador2)) {
            System.out.println("Estan empatados");
        } else {
            if (jugador1.equals("piedra") && jugador2.equals("papel")) {
                System.out.println("Gana Jugador 2");
            }
            if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
                System.out.println("Gana Jugador 1");
            }
            if (jugador1.equals("papel") && jugador2.equals("piedra")) {
                System.out.println("Gana Juagor 1");
            }
            if (jugador1.equals("papel") && jugador2.equals("tijera")) {
                System.out.println("Gana Jugador 2");
            }
            if (jugador1.equals("tijera") && jugador2.equals("piedra")) {
                System.out.println("Gana Jugador 2");
            }
            if (jugador1.equals("tijera") && jugador2.equals("papel")) {
                System.out.println("Gana Jugador 1");
            }
        }
    }

    public static String leer() {
        String cadena = "";
        do {
            cadena = sc.next().toLowerCase();
            if (cadena.equals("piedra") || cadena.equals("papel") || cadena.equals("tijera")) {
                break;
            } else {
                System.out.println("No se encuentra la selección");
                continue;
            }
        } while (true);
        return cadena;
    }
}
