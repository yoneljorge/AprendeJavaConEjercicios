package Capitulo06;

/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 */

/**
 * @author Yonel J. Sánchez
 */

import MisFunciones.Aleatorio;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.print("Piensa en un número entre 0 y 100 para intentar adivinarlo luego presiona ENTER.");
        // * Esperamos a que se presione el enter
        System.console().readLine();

        int intento = 0;
        int limiteSuperior = 100;
        int limiteInferior = 1;
        int numeroPensado = 0;
        boolean esPensado = false;
        boolean mayor = false;

        do {
            // Acumulamos los intentos que se ejecuten.
            intento++;
            // Si entre el límite superior y el inferior queda una diferencia de 2 pues se
            // le dice que su número es el que está en el medio.
            if (limiteSuperior - limiteInferior == 2) {
                System.out.printf("El número que usted eligió es el %d. Te he jodido. Jajaja.", limiteInferior + 1);
                break;
            }
            // Mediante la funcion NumeroRandom de la clase aleatorio se genera un número
            numeroPensado = Aleatorio.NumeroRandom(limiteInferior, limiteSuperior);
            System.out.printf("¿El número que estás pensando es %3d? (s/n):", numeroPensado);
            // Si es cierta la afirmacion anterior "esPensado" se iguala a true.
            esPensado = System.console().readLine().toLowerCase().equals("s");
            if (!esPensado) {
                // Si es el 5to intento pues ya no se pregunta nada más ya que se acabaron los
                // intentos.
                if (intento == 5) {
                    System.out.println("Me la pusiste dificil");
                    break;
                } else {
                    // Se le pregunta para corregir los límites.
                    System.out.print("El número que estás pensando es menor o mayor al que te mostré: ");
                    mayor = System.console().readLine().toLowerCase().equals("mayor");
                    if (mayor) {
                        // Si el "numeroPensado" es mayor al que piensa el usuario se iguala el
                        // limiteInferior al numeroPensado.
                        limiteInferior = numeroPensado;
                    } else {
                        // Si el "numeroPensado" es menor al que piensa el usuario se iguala el
                        // limiteSuperior al numeroPensado.
                        limiteSuperior = numeroPensado;
                    } // if
                } // else
                // Si adivina.
            } else {
                String intentoString = "";
                switch (intento) {
                    case 1:
                        intentoString = "1er";
                        break;

                    case 2:
                        intentoString = "2do";
                        break;

                    case 3:
                        intentoString = "3er";
                        break;

                    case 4:
                        intentoString = "4to";
                        break;

                    case 5:
                        intentoString = "5to";
                        break;

                    default:
                        break;
                }
                System.out.printf("Jajaja. He adivinado en mi %3s intento \n", intentoString);
                break;
            } // * IF
        } while (true);

    }
}
