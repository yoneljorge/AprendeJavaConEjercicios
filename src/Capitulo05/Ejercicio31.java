package Capitulo05;

/** 
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *

*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la L: ");
        int altura = Integer.parseInt(System.console().readLine());
        int base = altura / 2 + 1;
        int planta = 1;

        while (planta <= altura) {
            if (planta != altura) {
                System.out.print(" * ");
            }else{
                for(int i = 0; i < base ; i ++){
                    System.out.print(" *");
                }
            }
            System.out.println("");
            planta ++;
        }
    }
}
