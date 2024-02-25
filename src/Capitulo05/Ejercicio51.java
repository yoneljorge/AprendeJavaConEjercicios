package Capitulo05;

/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y
 * el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 * Ejemplo 1:
 * Introduzca un número entero (mayor que cero): 51803458
 * Después de haber sido comido por el gusano numérico se queda en 51345
 * Ejemplo 2:
 * Introduzca un número entero (mayor que cero): 29614
 * El gusano numérico no se ha comido ningún dígito.
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio51 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int numIntro = Integer.parseInt(System.console().readLine());

        int numReves = 0;
        boolean comido = false;
        while (numIntro > 0) {
            int d = numIntro % 10;
            if (d == 0 || d == 8) {
                comido = true;
            } else {
                numReves += d;
                if (numIntro > 9) {
                    numReves *= 10;
                }
            }
            numIntro /= 10;
        } // while

        /**
         * Como el número introducido se paso al revés y sin los dígitos comidos
         * entonces hay que volver a enderzarlo
         */
        while (numReves > 0) {
            int d = numReves % 10;
            numIntro += d;
            if (numReves > 9) {
                numIntro *= 10;
            }
            numReves /= 10;
        } // while

        if (comido) {
            System.out.println("Después de haber sido comido por el gusano numérico se queda en " + numIntro);
        }
        else{
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }

    }
}
