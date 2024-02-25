package Capitulo05;
/**
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco.
 * Suponemos que el usuario introduce una altura mayor o igual a 4.
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio59ArbolitoNavidad {
    public static void main(String[] args) {

        int alturaIntro = 0;

        do {
            System.out.print("Introduzca la altura del árbol (mayor o igual a 4): ");
            alturaIntro = Integer.parseInt(System.console().readLine());
            if (alturaIntro >= 4) {
                break;
            } else {
                System.out.println("La altura debe de ser mayor o igual a 4.");
                continue;
            }
        } while (true);

        // Base del arbolito
        int baseArbolito = 2 * (alturaIntro - 4) + 3;
        int espaciosAnterior = baseArbolito / 2;
        int espaciosMedio = 1;

        for (int i = 1; i <= alturaIntro; i++) {
            ///////// ESTRELLA///////////
            if (i == 1) {
                for (int j = 1; j <= baseArbolito / 2 + 1; j++) {
                    if (j == baseArbolito / 2 + 1) {
                        System.out.print("*");
                    } // if
                    else {
                        System.out.print(" ");
                    } // else
                } // for
            } // if

            ///////// CUERPO/////////////
            else if (i > 1 && i < alturaIntro - 1) {
                // Pintamos los espacios anteriores del cuerpo del arbolito
                for (int j = 1; j <= espaciosAnterior; j++) {
                    System.out.print(" ");
                } // for

                // Pintamos la primera hoja del cuerpo
                System.out.print("^");

                // Pintamos los espacios del medio
                for (int j = 1; j < espaciosMedio; j++) {
                    System.out.print(" ");
                }

                // Pintamos la segunda hoja del cuerpo del arbolito
                if (i > 2) {
                    System.out.print("^");
                }
                espaciosAnterior--;

                //Con este if corregimos el desplazamiento del medio
                if(i == 2){
                    espaciosMedio += 1;
                }else{
                    espaciosMedio += 2;
                }
            } // else if

            //////// BASE/////////////
            else if (i == alturaIntro - 1) {
                for (int j = 1; j <= baseArbolito; j++) {
                    System.out.print("^");
                } // for
            } // else if

            ///////// -->TRONCO<--////////////
            else {
                for (int j = 1; j <= baseArbolito / 2 + 1; j++) {
                    if (j == baseArbolito / 2 + 1) {
                        System.out.print("Y");
                    } // if
                    else {
                        System.out.print(" ");
                    } // else
                } // for
            } // else if

            System.out.println("");// ->Damos el salto de línea
        } // ***1er*for****/
    }
}
