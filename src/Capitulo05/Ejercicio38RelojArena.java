package Capitulo05;

/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
 * El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 * error.
 * Ejemplo:
 * Por favor, introduzca la altura del reloj de arena: 5
 *****
 ***
 *
 ***
 *****
 */
public class Ejercicio38RelojArena {
    public static void main(String[] args) {
        //Comprobamos de que se introduzca un número impar mayor que 3
        int alturaIntroducida = 0;
        do {
            System.out.print("Por favor, introduzca la altura del reloj de arena: ");
            alturaIntroducida = Integer.parseInt(System.console().readLine());
            if(alturaIntroducida <= 3 || alturaIntroducida %2 ==0){
                System.out.println("El número tiene que  ser un impar mayor que 3.");
                continue;
            }else{
                break;
            }
        } while (true);

        // Parte de arriba//////////////////////
        int altura = 1;
        int espaciosDelante = 0;
        int relleno = alturaIntroducida;
        while (altura <= alturaIntroducida / 2) {
            for (int i = 1; i <= espaciosDelante; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= relleno; i++) {
                System.out.print("*");
            }

            altura++;
            espaciosDelante++;
            relleno -= 2;
            System.out.println("");
        } // while

        // Parte de abajo//////////////////////
        altura = 1;
        espaciosDelante = alturaIntroducida / 2;
        relleno = 1;
        while (altura <= alturaIntroducida / 2 + 1) {
            for (int i = 1; i <= espaciosDelante; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= relleno; i++) {
                System.out.print("*");
            }

            altura++;
            espaciosDelante--;
            relleno += 2;
            System.out.println("");
        } // while
    }
}
