package Capitulo06;

/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería
 * el 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n)
 * 
 * 
 * @author Yonel J. Sánchez
 * 
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.printf("%-2s de %s\n", RandomCarta(), RandomPalo());
    }

    // Genera un número aleatorio del 1 al 13 para las cartas.
    public static String RandomCarta() {
        String carta = "";
        int valor = (int) (Math.random() * 13) + 1;

        switch (valor) {
            case 1:
                carta = "A";
                break;

            case 11:
                carta = "J";
                break;

            case 12:
                carta = "Q";
                break;

            case 13:
                carta = "K";
                break;

            default:
                carta = String.valueOf(valor);
                break;
        }// switch
        return carta;
    }

    public static String RandomPalo() {
        String palo = "";
        int valor = (int) (Math.random() * 4) + 1;
        switch (valor) {
            case 1:
                palo = "pica";
                break;

            case 2:
                palo = "corazones";
                break;

            case 3:
                palo = "diamantes";
                break;

            case 4:
                palo = "tréboles";
                break;

            default:
                palo = "";
                break;
        }// switch
        return palo;
    }
}
