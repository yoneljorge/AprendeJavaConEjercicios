package Capitulo05;

/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito,
 * se
 * queda igual.
 * Bucles
 * 76
 * Ejemplo 1:
 * Introduzca un número: 609831
 * El número resultado es 98316
 * Ejemplo 2:
 * Introduzca un número: 78201345
 * El número resultado es 82013457
 * Ejemplo 3:
 * Introduzca un número: 24
 * El número resultado es 42
 * Ejemplo 4:
 * Introduzca un número: 8
 * El número resultado es 8
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio52 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int numIntro = Integer.parseInt(System.console().readLine());

        int numReves = 0;
        int primerDigito = 0;

        while (numIntro > 0) {
            int d = numIntro % 10;
            if (numIntro < 10) {
                primerDigito = d;
            } else {
                numReves += d;
                if (numIntro > 99) {
                    numReves *= 10;
                }
            }
            numIntro /= 10;
        } // while
        //boolean ok = false;
        while (numReves >= 0) {
            if (numReves == 0) {
                numIntro += primerDigito;
                break;
            } else {
                int d = numReves % 10;
                numIntro += d;
                numIntro *= 10;
                numReves /= 10;
            }
        } // While

        System.out.print("El número resultado es: " + numIntro);
    }
}
