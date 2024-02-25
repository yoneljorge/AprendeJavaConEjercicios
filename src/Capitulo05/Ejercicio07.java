package Capitulo05;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será
 * un número de 4 cifras. El programa nos pedirá la combinación para
 * abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa
 * no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 * ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para
 * abrir la caja fuerte.
 * 
 * @author Yonel J. Sánchez
 */
import java.io.Console;

public class Ejercicio07 {

    public static void main(String[] args) {
        Console console = System.console();
        int i = 1;
        int clave = 1234;
        int claveComparar = 0;

        if (console == null) { //-> En caso de que no se ejecute el programa en una consola este se cierra
            System.out.println("No se encuentra en una consola");
            System.out.println("Por favor ejecutar el programa desde una consola");
            System.exit(0);
        }
        do {
            System.out.print("Introduzca su clave: ");
            char[] paswr = console.readPassword(); //-> Pide la contraseña y cuando se esta escribiendo muestra asteriscos
            claveComparar = Integer.parseInt(String.valueOf(paswr));//-> Convierte el arreglo paswr en una cadena y luego lo convierte a un entero
            if (clave == claveComparar) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                i++;
                continue;
            }
        } while (i <= 4);
        if (i == 4) {
            System.out.println("Ha superado el máximo número de intentos");
        }
    }
}
