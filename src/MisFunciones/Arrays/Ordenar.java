package MisFunciones.Arrays;

public class Ordenar {
    /**
     * Función con la cual vamos a ordenar un arreglo de numeros enteros mediante el
     * método de la burbuja.
     * Como los array se pasan como referencia no es necesario devolver el valor del
     * array.
     * 
     * @param arreglo[] un arreglo de enteros.
     * @return <code>arregloOrdenado[]</code> retorna el arreglo ordenado.
     */

    public static void Integer(int[] arreglo) {
        // Definimos una variable booleana "cambio" y la establecemos en true
        boolean cambio = true;
        // Mientras "cambio" sea verdadero, sigue ordenando la lista
        while (cambio) {
            // Establecer "cambio" en false para indicar que no se han hecho cambios todavía
            cambio = false;
            // Recorrer la lista de números hasta el penúltimo elemento
            for (int i = 0; i < arreglo.length - 1; i++) {
                // Si el elemento actual es mayor que el siguiente, intercambiarlos
                if (arreglo[i] > arreglo[i + 1]) {
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temporal;

                    // Establecer "cambio" en true para indicar que se ha hecho un cambio
                    cambio = true;
                } // End If
            } // End For
        } // En While
    }

    /**
     * Función con la cual vamos a ordenar un arreglo de numeros de tipo double
     * mediante el
     * método de la burbuja.
     * Como los array se pasan como referencia no es necesario devolver el valor del
     * array.
     * 
     * @param arreglo[] un arreglo de dobles.
     * @return <code>arregloOrdenado[]</code> retorna el arreglo ordenado.
     */

    public static void Double(double[] arreglo) {
        // Definimos una variable booleana "cambio" y la establecemos en true
        boolean cambio = true;
        // Mientras "cambio" sea verdadero, sigue ordenando la lista
        while (cambio) {
            // Establecer "cambio" en false para indicar que no se han hecho cambios todavía
            cambio = false;
            // Recorrer la lista de números hasta el penúltimo elemento
            for (int i = 0; i < arreglo.length - 1; i++) {
                // Si el elemento actual es mayor que el siguiente, intercambiarlos
                if (arreglo[i] > arreglo[i + 1]) {
                    double temporal = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temporal;

                    // Establecer "cambio" en true para indicar que se ha hecho un cambio
                    cambio = true;
                } // End If
            } // End For
        } // En While

        
    }
}
