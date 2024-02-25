package Capitulo06;
/**
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7
Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0
 */

import MisFunciones.Aleatorio;
import MisFunciones.Matematica;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(System.console().readLine());
        
        int cantDigitos = Matematica.digitos(numero);
        int digitoAleatorio = Aleatorio.NumeroRandom(1, cantDigitos);

        System.out.println(Matematica.digitoN(numero, digitoAleatorio));
    }
}
