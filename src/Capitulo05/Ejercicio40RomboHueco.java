package Capitulo05;

/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * Ejemplo:
 * Por favor, introduzca la altura del rombo: 5
 */

public class Ejercicio40RomboHueco {
    public static void main(String[] args) {
        int alturaIntroducida = 0;
        do {
            System.out.print("Por favor, introduzca la altura del rombo: ");
            alturaIntroducida = Integer.parseInt(System.console().readLine());
            if (alturaIntroducida <= 3 || alturaIntroducida % 2 == 0) {
                System.out.println("El número tiene que ser un impar mayor que 3.");
                continue;
            } else {
                break;
            }
        } while (true);

        // Parte de arriba /////////////////////
        int planta = 1;
        int espaciosDelante = alturaIntroducida / 2;
        int espaciosMedio = 0;
        while (planta <= alturaIntroducida / 2 + 1) {
            for (int i = 0; i < espaciosDelante; i++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int i = 1; i < espaciosMedio; i++) {
                System.out.print(" ");
            }

            if (planta != 1) {
                System.out.print("*");
            }
            planta++;
            espaciosDelante--;
            espaciosMedio+=2;
            System.out.println("");
        } // while

        // Parte de abajo /////////////////////
        planta = 1;
        espaciosDelante = 1;
        espaciosMedio = alturaIntroducida -3;
        while (planta <= alturaIntroducida / 2) {
            for (int i = 0; i < espaciosDelante; i++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int i = 1; i < espaciosMedio; i++) {
                System.out.print(" ");
            }

            if (planta != alturaIntroducida / 2) {
                System.out.print("*");
            }
            planta++;
            espaciosDelante++;
            espaciosMedio-=2;
            System.out.println("");
        } // while
    }
}
