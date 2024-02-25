package Capitulo06;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * de-
 * be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 * 
 * @author Yonel J. Sánchez
 * 
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        for (int i = 1, intentos = 4; i <= 5; i++, intentos--) {
            System.out.print("Prueve su suerte, introduzca un número entre 0 y 100: ");
            int numeroIntro = Integer.parseInt(System.console().readLine());
            int numeroRandom = Random();
            if (numeroIntro == numeroRandom) {
                System.out.println("Acertaste. Tienes que tener mucha suerte.");
                break;
            } else {
                if (intentos > 0) {
                    String aproximacion = "";
                    if (numeroIntro > numeroRandom) {
                        aproximacion = "arriba";
                    } else {
                        aproximacion = "abajo";
                    }
                    System.out.printf("No has hacertado, te fuiste por %s.\n", aproximacion);
                    System.out.printf("Te quedan %d intentos.\n", intentos);
                } // if
                else {
                    System.out.println("No es tu día de suerte.");
                }
            } // else
        } // for
    }// main

    private static int Random() {
        int numero = 0;
        numero = (int) (Math.random() * 101);
        return numero;
    }
}
