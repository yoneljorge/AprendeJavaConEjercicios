package Capitulo05;

/**
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe
 * introducir
 * la altura total y la fila en la que debe aparecer el palito horizontal
 * (contando
 * desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
 * horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
 * introduce algún dato incorrecto, el programa debe mostrar un mensaje de
 * error.
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio65 {
    public static void main(String[] args) {

        //////// PIDIENDO Y VERIFICANDO LA ALTURA//////////////
        int alturaIntro = 0;
        do {
            System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
            alturaIntro = Integer.parseInt(System.console().readLine());
            if (alturaIntro >= 3) {
                break;
            } else {
                System.out.println("La altura debe de ser mayor o igual a 3.");
                continue;
            }
        } while (true);

        ////////// PIDIENDO Y VERIFICANDO LA FILA DEL PALITO////////////////
        int filaPalito = 0;
        do {
            System.out.printf("Introduzca la fila del palito horizontal (entre %d y %d): ", 2, alturaIntro - 1);
            filaPalito = Integer.parseInt(System.console().readLine());
            if (filaPalito > 1 && filaPalito < alturaIntro) {
                break;
            } else {
                System.out.printf("La fila del palito no está entre el 2 y %.\n", alturaIntro - 1);
                continue;
            }
        } while (true);

        //////////DIBUJANDO LA A////////////////
        int espaciosAnterior = alturaIntro;
        int espaciosMedio = 0;

        for (int i = 1; i <= alturaIntro; i++) {
            ////// DIBUJANDO LOS ESPACIOS ANTERIORES/////////
            for (int j = 1; j <= espaciosAnterior; j++) {
                System.out.print(" ");
            }
            espaciosAnterior--;

            ///// DIBUJANDO EL PRIMER ASTERISCO//////////
            if (i != filaPalito) {
                System.out.print("*");
            }

            ////// DIBUJANDO LOS ESPACIOS DEL MEDIO///////
            if (i != 1 && i != filaPalito) {
                for (int j = 1; j <= espaciosMedio; j++) {
                    System.out.print(" ");
                } // for
            } // if
            if (i == 1) {
                espaciosMedio = i;
            } else {
                espaciosMedio = i + i - 1;
            }

            /////// DIBUJANDO EL SEGUNDO ASTERISCO//////////
            if (i != filaPalito && i != 1) {
                System.out.print("*");
            }

            ////// DIBUJANDO EL PAlITO DEL MEDIO///////////
            if(i == filaPalito){
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            //////SALTO DE LÍNEA PARA UNA NUEVA//////////
            System.out.println("");
        } // Primer_FOR
    }
}
