package Capitulo06;


/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int longitudLineas = Random();
            String caracter = Caracter();
            for (int j = 1; j <= longitudLineas; j++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }

    }

    private static String Caracter() {
        String caracter = "";
        int valor = (int) (Math.random() * 6 + 1);

        switch (valor) {
            case 1:
                caracter = "*";
                break;
            case 2:
                caracter = "-";
                break;
            case 3:
                caracter = "=";
                break;
            case 4:
                caracter = ".";
                break;
            case 5:
                caracter = "|";
                break;
            case 6:
                caracter = "@";
                break;
            default:
                break;
        }
        return caracter;
    }// ?Función Caracter

    private static int Random() {
        int valor = (int) (Math.random() * 41 + 1);
        return valor;
    }
}
