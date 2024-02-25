package Capitulo05;

/**
 * Ejercicio 35
Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
  *        *
     *   *
       *
     *   *
  *         *
*/
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        int alturaIntroducida = 0;
        do {
            System.out.print("Por favor, introduzca la altura de la X: ");
            alturaIntroducida = Integer.parseInt(System.console().readLine());
            if (alturaIntroducida <= 3 || alturaIntroducida % 2 == 0) {
                System.out.println("La altura tiene que ser un número impar menor que 3.");
                continue;
            } else {
                break;
            }
        } while (true);

        // Parte de arriba ///////////////////////////
        int altura = 1;
        int espaciosDelante = 0;
        int espaciosMedio = alturaIntroducida / 2 + 1;

        while (altura < alturaIntroducida / 2 + 1) {
            // Imprimimos los espacios por delante, como al principio no hay se iguala a 0.
            for (int i = 1; i <= espaciosDelante; i++) {
                System.out.print(" ");
            }

            // Este asterisco es el primero el cual se imprime si o si
            System.out.print("*");

            // Imprimimos los espacios del medio
            for (int i = 1; i <= espaciosMedio; i++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println("");
            altura++;
            espaciosDelante++;
            espaciosMedio -= 2;
        } // while parte de arriba

        altura = 1;
        espaciosDelante = alturaIntroducida / 2;

        while (altura <= alturaIntroducida / 2 + 1) {
            for (int i = 0; i < espaciosDelante; i++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int i = 1; i <= espaciosMedio; i++) {
                System.out.print(" ");
            }

            if (altura != 1) {
                System.out.print("*");
            }
            System.out.println("");
            altura++;
            espaciosDelante--;
            espaciosMedio += 2;
        }
    }

}
