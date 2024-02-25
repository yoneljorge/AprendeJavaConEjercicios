package Capitulo05;

/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
    1
   121
  12321
 1234321
*/

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());

        int planta = 1;
        int espaciosEnBlanco = altura - 1;
        int relleno = 1;

        while (planta <= altura) {
            // Dibujar los espacios
            for (int i = 1; i <= espaciosEnBlanco; i++) {
                System.out.print(" ");
            }

            // Dibujar el relleno
            int contador = 1;
            for (int i = 1; i <= relleno; i++) {
                if(i > 1){
                    if (i <= planta) {
                        contador ++;
                    }else{
                        contador --;
                    }
                }
                System.out.print(contador);
            }

            System.out.println("");
            planta++;
            espaciosEnBlanco--;
            relleno = relleno + 2;
        }
    }

}
