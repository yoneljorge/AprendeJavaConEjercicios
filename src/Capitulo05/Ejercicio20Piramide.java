package Capitulo05;

/*
*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*/
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio20Piramide {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el carácter de relleno: ");
        String relleno = System.console().readLine();

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida - 1;

        while (planta <= alturaIntroducida) {
            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                if (i == 1 || i == longitudDeLinea || planta == alturaIntroducida) {
                    System.out.print(relleno);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
