package Capitulo05;

/**
 * Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio45 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numIntro = Long.parseLong(System.console().readLine());
        long numero = 0;
        System.out.print("Introduzca la posición dentro del número: ");
        long posicion = Long.parseLong(System.console().readLine());

        System.out.print("Introduzca el nuevo dígito: ");
        long digito = Long.parseLong(System.console().readLine());

        long numReves = 0;
        int posiciones = 0;

        // Para calcular las posiciones del número///////////////
        // y virar al revés el número
        while (numIntro > 0) {
            long d = numIntro % 10;
            numReves += d;
            posiciones++;
            if (numIntro > 9) {
                numReves *= 10;
            }
            numIntro /= 10;
        } // while

        // Insertar el dígito en la posición indicada /////////////////
        for (int i = 1; i <= posiciones; i++) {
            long d = numReves % 10; // Extraermos el último dígito

            if (i == posicion) { // Cuando i llegue a la posición indicada se agrega el dígito
                numero += digito;
                numero *= 10;
            } else {
                // Se van agregando los dígitos al número final
                numero += d;
                // Se multiplica por 10 para ir agregando los lugares
                if (i != posiciones) {
                    numero *= 10;
                }
            }

            numReves /= 10;
        } // while

        System.out.println("El número resultante es " + numero);
    }
}
