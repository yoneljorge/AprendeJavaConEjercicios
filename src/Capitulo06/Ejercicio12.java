package Capitulo06;

/**
 * @author Yonel J. Sánchez
 * 
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        while (true) {
            char a = (char)Random();

            System.out.print(a);
        }
    }

    public static int Random(){
        int numero = (int)(Math.random() * 127 +32);
        return numero;
    }
}