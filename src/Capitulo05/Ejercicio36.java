package Capitulo05;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda
 * usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 678
 * El 678 no es capicúa.
 * 
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 2019102
 * El 2019102 es capicúa.
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numIntro = Integer.parseInt(System.console().readLine());
        long numero = numIntro;
        long numReves = 1;
        String numRevesString = "";

        while (numero >= 1) {
            numRevesString = numRevesString + String.valueOf(numero % 10);
            numero /=10;
        }
        numReves = Long.parseLong(numRevesString);

        if(numIntro == numReves){
            System.out.println("El número " + numIntro + " es capicúa.");
        }
        else{
            System.out.println("El número " + numIntro + " no es capicúa.");
        }
        System.exit(0);
    }
}
