package Capitulo05;

/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
 * El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * 
 * Ejemplo 1:
 * Introduzca la altura de la U: 5
 * 
 * *        *
 * *        *
 * *        *
 * *        *
 *   *  *  *    
 */
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la U: ");
        int altura = Integer.parseInt(System.console().readLine());
        int base = 0;

        // Si la altura es par, la base va a ser igual a la mitad de la altura
        // Pero si es impar entonces va a ser igual a la mitad + 1
        if (altura % 2 == 0) {
            base = altura / 2;
        } else {
            base = altura / 2 + 1;
        }

        int planta = 1;

        while (planta <= altura) {
            if (planta != altura) {
                //Imprimimos el primer asterisco
                System.out.print(" * ");
                // Para imprimir los espacios
                for (int i = 0; i < base; i++) {
                    System.out.print("  ");
                }
                //Imprimimos el segundo asterisco
                System.out.print("*");
            }else{
                //Imprimos la base
                System.out.print("  ");
                for(int i = 0; i < base ; i ++){
                    System.out.print(" *");
                }
            }
            System.out.println("");
            planta++;
        }

    }
}
