package MisFunciones;

public class Aleatorio {
    /**
     * Gernera un número entero aleatorio teniendo en cuenta el "limiteInferior" y
     * el "limiteSuperior" que se desea.
     * 
     * @param limiteInferior un número entero positivo mayor o igual a 0. Para
     *                       definir hasta donde se desea el rango inferior.
     * @param limiteSuperior un número entero positivo mayor al limiteInferior. Para
     *                       defini hasta donde se desea el rango Superior.
     * @return <code>numeroAleatorio</code> retorna un número entero positvo.
     */
    public static int NumeroRandom(int limiteInferior, int limiteSuperior) {
        // Si se introduce un valor menor a uno se produce un error.
        if (limiteInferior < 0) {
            throw new IllegalArgumentException("El valor tiene que ser mayor o igual a 0");
        }
        // Si el limite superior es igual o menor al limite superior salta un error.
        if (limiteSuperior < limiteInferior + 1) {
            throw new IllegalArgumentException(
                    "El valor del limiteSuperior tiene que ser mayor en 1 que el limite inferior");
        }
        int numeroAleatorio = 0;
        // Mientras el numeroALeatorio sea menor al limite inferior se sigue buscando un
        // número.
        do {
            // Se generan números hasta donde se ha especificado en el límite superior.
            if (limiteInferior == 0) {
                numeroAleatorio = (int) (Math.random() * (limiteSuperior + 1));
            } else {
                numeroAleatorio = (int) (Math.random() * limiteSuperior + 1);
            }
            // Si el numeroAleatorio es mayor al limiteInferior se envia ese número.
            if (numeroAleatorio >= limiteInferior) {
                break;
            } else {
                continue;
            }
        } while (true);
        return numeroAleatorio;
    }

    /**
     * Función que crea un arreglo de número aleatorios.
     * 
     * @param tamano         tamaño del arreglo.
     * @param limiteInferior se le indica desde que número quiere que se generen los
     *                       números aleatorios.
     * @param limiteSuperior se le indica hasta donde quiere que se generen los
     *                       número aleatorios.
     * @return <code>arreglo</code> retorna el arreglo de número aleatorios creado.
     */
    public static int[] ArregloEnteros(int tamano, int limiteInferior, int limiteSuperior) {
        // *Creamos el arreglo de enteros */
        int[] arreglo = new int[tamano];

        // *Llenandolo con números aleatorios */
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = NumeroRandom(limiteInferior, limiteSuperior);
        }
        return arreglo;
    }

    /**
     * Función que crea una matriz de números aleatorios.
     * 
     * @param filas          la cantidad de filas de la matriz
     * @param columnas       la cantidad de columnas de la matriz.
     * @param limiteInferior se le indica desde que número quiere que se generen los
     *                       números aleatorios.
     * @param limiteSuperior se le indica hasta donde quiere que se generen los
     *                       número aleatorios
     * @return <code>matriz</code> retorna la matriz de números enteros creada.
     */
    public static int[][] MatrizEnteros(int filas, int columnas, int limiteInferior, int limiteSuperior) {
        // *Creamos la matriz de enteros */
        int[][] matriz = new int[filas][columnas];

        // *Llenamos la matriz con número aleatorios*/
        for (int fi = 0; fi < filas; fi++) {
            for (int co = 0; co < columnas; co++) {
                matriz[fi][co] = NumeroRandom(limiteInferior, limiteSuperior);
            }
        }
        return matriz;
    }
}