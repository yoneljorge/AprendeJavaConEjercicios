package Capitulo06;

import MisFunciones.Aleatorio;

/**
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
Ejemplo 1:
Introduzca la anchura de la tableta: 6
Introduzca la altura de la tableta: 4
******
*****
******
******
 */
/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        // ***Pedimos los datos al usuario */
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchoIntro = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta: ");
        int altoIntro = Integer.parseInt(System.console().readLine());

        // *Generamos donde va a ser la mordida aleatoria */
        int filaAleatoria = Aleatorio.NumeroRandom(1, altoIntro);
        int columnaAleatoria = 0;
        do {
            columnaAleatoria = Aleatorio.NumeroRandom(1, anchoIntro);
            // * Si filaAleatoria es 1 o es igual al altoIntro entonces columna aleatoria
            // * puede ser cualquier número.
            if (filaAleatoria != 1 || filaAleatoria != altoIntro) {
                if(columnaAleatoria == 1 || columnaAleatoria == anchoIntro){
                    break;
                }
            } else {
                break;
            }
        } while (true);

        for (int i = 1; i <= altoIntro; i++) {
            for (int j = 1; j <= anchoIntro; j++) {
                if(i == filaAleatoria && j == columnaAleatoria){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                
            }
            // *Salto de línea para separar */
            System.out.println("");
        }
    }
}
