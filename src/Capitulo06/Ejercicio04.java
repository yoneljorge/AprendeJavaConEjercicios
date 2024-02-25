package Capitulo06;

/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
 * dos por espacios
 * 
 * @author Yonel J. Sánchez
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        for(int i =1; i <=20; i++){
            System.out.printf("%2d  ", (int)(Math.random() * 11));
        }
    }
}
