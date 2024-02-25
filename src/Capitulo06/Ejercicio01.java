package Capitulo06;

/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        int dado1 = Tirada();
        System.out.println("Dado #1: " + dado1);

        int dado2 = Tirada();
        System.out.println("Dado #2: " + dado2);

        int dado3 = Tirada();
        System.out.println("Dado #3: " + dado3);

        System.out.println("Total: " + (dado1 + dado2 + dado3));
    }

    public static int Tirada() {
        int valor = 0;
        valor = (int) (Math.random() * 6) + 1;
        return valor;
    }
}
