package Capitulo05;

/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 94026782
 * Dígitos pares: 4 0 2 6 8 2
 * Suma de los dígitos pares: 22
 * 
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 31779
 * Dígitos pares:
 * Suma de los dígitos pares: 0
 * 
 * Ejemplo 3:
 * Por favor, introduzca un número entero positivo: 2404
 * Dígitos pares: 2 4 0 4
 * Suma de los dígitos pares: 10
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.print("Por favor introduzca un número entero positivo: ");
        String numeroCadena = System.console().readLine();

        int cantPares = 0;
        String paresCadena = "";

        for (int i = 0, aux = 1; i < numeroCadena.length(); i++, aux++) {
            if (Integer.parseInt(numeroCadena.substring(i, aux)) % 2 == 0) {
                if (cantPares >= 1) {
                    paresCadena = paresCadena + ",";
                }
                paresCadena = paresCadena + numeroCadena.substring(i, aux);
                cantPares++;
            }
        }
        String[] paresArray = paresCadena.split(",");

        int suma = 0;

        if (cantPares > 0) {
            System.out.print("Dígitos pares: ");
            for (int i = 0; i < cantPares; i++) {
                suma = suma + Integer.parseInt(paresArray[i]);
                System.out.print(paresArray[i] + " ");
            }
                System.out.println("\nLa suma de los dígitos pares es: " + suma);
        }else{
            System.out.println("No se encontraron pares");
        }

    }
}
