package MisFunciones.Arrays;

public class Mostrar {

    /**
     * Función que imprime de forma horizontal y separados por lo que se desee todos
     * los enteros de un arreglo de enteros.
     * 
     * @param array : Arrglo de enteros.
     * @param a     : cadena con la cual se espera separar los elementos de arreglo.
     *              La caul va antes.
     * @param d     : cadena con la cual se espera separar los elementos de arreglo.
     *              La caul va despues.
     * @return <code>Imprime los valores</code>
     */
    public static void EnterosHorizontal(String a, int[] array, String d) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(a + array[i] + d);
        }
        System.out.println("");
    }

    public static void TablaEnteros(int[][] lista, boolean siSumaFila, boolean siSumaColumna) {
        // *Imprimimos la línea de las columnas */
        System.out.print("            ");
        for (int i = 0; i < lista[0].length; i++) {
            System.out.printf("Col %2d  ", i + 1);
        }
        System.out.println("");
        // *Imprimimos cada fila */
        for (int fi = 0; fi < lista.length; fi++) {
            int sumaFila = 0;
            System.out.printf("Fila %2d ", fi + 1); // -> Imprimimos delante de la fila su número
            for (int co = 0; co < lista[0].length; co++) {
                sumaFila += lista[fi][co];
                System.out.printf("  %6d", lista[fi][co]);
            }
            // Imprimimos la suma de la fila
            if (siSumaFila) {
                System.out.printf("   suma %4d", sumaFila);
            }
            System.out.println("");
        } // End For

        // *Imprimimos la línea de la suma de las columnas */
        if (siSumaColumna) {
            System.out.print("Suma    ");//-> Imprimimos antes de los valores la cadena "suma".
            int co =0;      
            //*Vamos iterando por cada columna y sumandola */
            while (co < lista[0].length) {
                int sumaColumna =0;
                for (int fi = 0; fi < lista.length; fi++) {
                    sumaColumna += lista[fi][co];
                }
                System.out.printf("  %6d", sumaColumna);
                co ++;
            }//End While
            System.out.println("\n");
        }//End If
    }

    /**
     * Función que muestra un arreglo bidimensional de enteros.
     * 
     * @param lista : el arreglo bidimensional de enteros que se quiere mostrar.
     * @return Imprime por pantalla el contenido del arreglo bidimensional.
     */
    public static void MatrizEnteros(int[][] lista){
        for(int i =0; i < lista.length; i++){
            for(int j =0; j <lista[0].length; j++){
                System.out.printf(" %4d ",lista[i][j]);
            }
            System.out.println("");
        }
    }

    /**
     * Función que muestra un arreglo bidimensional de tipo String.
     * 
     * @param lista : el arreglo bidimensional de cadenas que se quiere mostrar.
     * @return Imprime por pantalla el contenido del arreglo bidimensional.
     */
    public static void MatrizCadena(String[][] lista){
        for(int i =0; i < lista.length; i++){
            for(int j =0; j <lista[0].length; j++){
                System.out.printf(" %4s ",lista[i][j]);
            }
            System.out.println("");
        }
    }
}
