package MisFunciones;

/**
 * Funciones para el juego de Ajedrés.
 * 
 * @author Yonel J. Sánchez
 */
public class Ajedres {

    public static void Mostrar(String[][] tablero) {

        // *Imprimimos la fila que muestra las letras */
        System.out.println("    A  B  C  D  E  F  G  H");
        for (int i = 0, fila = 1; i < tablero.length; i++, fila++) {
            // *Imprimimos los número que van delante */
            System.out.print(fila + "  ");
            // *Imprimimos el contenido del tablero */
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.printf(" %s ", tablero[i][j]);
            }
            // *Imprimimos los número que van al final */
            System.out.print(" " + fila);
            // *Damos un salto de línea */
            System.out.println("");
        }
        // *Imprimimos la fila que muestra las letras */
        System.out.print("    A  B  C  D  E  F  G  H");
    }

    /**
     * Función que muestra las posiciones a las que se puede mover un alfil.
     * 
     * @param posicionAlfil : cadena que contiene la posicion del alfil de la forma.
     *                      Ej: "a1".
     * @return reotorna todas las posiciones a las que se puede mover el alfil.
     */
    public static void Alfil(String posicionAlfil) {

        /**
         * Como la letra 'a' al convertirse caracter a entero equivale a 97 se le resta
         * 96 para obtener el valor de la columna y como el 1 equivale a 49 se le resta
         * 48 para obtener el valor de la fila.
         */
        int columnaAlfil = (int) (posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int) (posicionAlfil.charAt(1)) - 48;

        // *Imprime por pantalla las posiciones a las que se puede mover un alfil */
        for (int fila = 8; fila >= 1; fila--) {
            for (int columna = 1; columna <= 8; columna++) {
                /**
                 * Si el valor absoluto de la resta de la filaALfil y fila , y el valor absoluto
                 * de la resta de la columnaAlfil y columna son iguales entones el alfil puede
                 * avanzar hacia esa posición. Es decir el alfil se puede mover a esa posición.
                 */
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (!((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char) (columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}
