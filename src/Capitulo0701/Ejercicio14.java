package Capitulo0701;

/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
 */
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        // *Declaramos y llenamos la lista de colores */
        String[] listaColores = { "rojo", "amarillo", "verde", "blanco", "negro", "azul", "naranja", "rosa",
                "moradao" };

        // *Declaramos el array de palabras */
        String[] listaPalabras = new String[8];
        String[] listaPalabrasOrdenada = new String[8];

        // *Llenamos la lista con un bucle for */
        System.out.println("Introduzca 8 palabras");
        for (int i = 0; i < listaPalabras.length; i++) {
            System.out.print("Introduzca la palabra #" + (i + 1) + ": ");
            listaPalabras[i] = System.console().readLine();
        }

        /**
         * Recorremos la lista de palabras para comparar cada palabra con la lista de
         * colores.
         */
        for (int i = 0, contadorColor = 0, contadorNoColor = listaPalabras.length - 1; i < listaPalabras.length; i++) {
            // con la lista de colores.
            boolean isColor = false;
            for (int j = 0; j < listaColores.length; j++) {
                if (listaPalabras[i].equals(listaColores[j])) {
                    isColor = true;
                }
            }
            if (isColor) {
                listaPalabrasOrdenada[contadorColor] = listaPalabras[i];
                contadorColor++;
            } else {
                listaPalabrasOrdenada[contadorNoColor] = listaPalabras[i];
                contadorNoColor--;
            }
        }

        // *Imprimir listaPalabras */
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for (String p : listaPalabras) {
       System.out.printf("│%-8s", p);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        // Muestra el array resultado.
        System.out.println("\n\nArray resultado:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for (String r : listaPalabrasOrdenada) {
            System.out.printf("│%-8s", r);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    }

}
