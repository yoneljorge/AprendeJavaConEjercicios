package Capitulo06;

/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 */

/**
 * @author Yonel J. Sánchez
 *
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        int cantidad =0;
        int numero = 0;

        while (true) {
            cantidad ++;
            numero = Random();

            if (numero == 24) {
                System.out.printf("Se generaron %3d números sin contar el 24.", cantidad -1 );
                break;
            }else{
                System.out.println(numero);
                continue;
            }

            
        }
    }

    private static int Random() {
        int numero = 0;
        do {
            numero = (int) (Math.random() * 101);
            if (numero % 2 == 0) {
                break;
            } else {
                continue;
            }

        } while (true);
        return numero;
    }
}
