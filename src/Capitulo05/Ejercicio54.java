package Capitulo05;
/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio54 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = 1, relleno = altura; i <= altura; i++, relleno --) {
            for(int j = 1 ; j <= relleno; j ++){
                if (j == 1 || j == relleno || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }//else
            }//for j
            System.out.println("");
        }//for i
    }
}
