package Capitulo05;

/**
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición a partir de la cual quiere partir el número: 5
 * Los números partidos son el 4067 y el 83.
 */
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numIntro = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicionIntroducida = Integer.parseInt(System.console().readLine());

        int numero = numIntro;
        int numReves = 0;
        int posiciones = 0;
        int primeraParte = 0;
        int segundaParte = 0;

        // Para calcular las posiciones del número
        // y virar el número al revés.
        while (numero > 0) {
            int digito = numero % 10;
            numReves += digito;
            posiciones++;
            if (numero > 9) {
                numReves *= 10;
            }
            numero /= 10;
        }

        // Sacar primera posición
        for (int i = 1; i <= posicionIntroducida; i++) {
            int digito = numReves % 10;
            primeraParte += digito;
            if (i != posicionIntroducida) {
                primeraParte *= 10;
            }
            numReves /= 10;
        }

        // Sacar segunda parte
        for (int i = 1; i <= posiciones - posicionIntroducida; i++) {
            int digito = numReves % 10;
            segundaParte += digito;
            if (i != posiciones - posicionIntroducida) {
                segundaParte *= 10;
            }
            numReves /= 10;
        }

        System.out.println("Los números partidos son el " + primeraParte + " y el " + segundaParte + ".");

        System.exit(0);
    }
}
