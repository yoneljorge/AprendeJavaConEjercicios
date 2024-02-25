package Capitulo06;
/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        int dado1 = 0;
        int dado2 = 0;
        do {
            dado1 = Dado1();
            dado2 = Dado2();

            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("");
        } while (dado1 != dado2);
    }

    // ?Simula la tirada del dado uno
    public static int Dado1() {
        int valor = (int) (Math.random() * 7);
        return valor;
    }

    // ?Simula la tirada del dado dos
    public static int Dado2() {
        int valor = (int) (Math.random() * 7);
        return valor;
    }
}
