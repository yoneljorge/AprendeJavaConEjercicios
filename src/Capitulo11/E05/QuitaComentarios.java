package Capitulo11.E05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

public class QuitaComentarios {
    public static void main(String[] args) {
        // En caso de que no se pasen los dos argumentos entonces se retorna el mensaje
        // de como debe de utilizarse el programa
        if (args.length != 2) {
            System.out.println("Uso: java QuitaComentario FiCHERO_ENTRADA FICHERO_SALIDA");
            return;
        }

        /*
         * Obtenemos los argumentos de entrada y lo pasamos a una cadena con el nombre
         * de los ficheros
         */
        String ficheroEntrada = args[0];
        String ficheroSalida = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroEntrada));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {

            String linea = "";
            // Para saber cuando estamos dentro de un comentario
            boolean dentroComentario = false;

            while ((linea = br.readLine()) != null) {
                // Si no nos encontramos dentro de un comentario
                if (!dentroComentario) {
                    // Si la línea contiene "/*" entonces estamos dentro de un comentario
                    if (linea.contains("/*")) {
                        dentroComentario = true;
                        int indiceInicioComentario = linea.indexOf("/*");
                        /*
                         * Si es distinto de cero entonces imprime todo lo que esta antes del comentario
                         */
                        if (indiceInicioComentario > 0) {
                            System.out.println(linea.substring(0, indiceInicioComentario));
                            bw.write(linea.substring(0, indiceInicioComentario));
                            bw.newLine();
                        }
                        /*
                         * Si tiene dos barras invertidas es que estamos en presencia de un comentario
                         * de una linea e imprime todo lo que está antes de las do barras si las barras
                         * invertidas tienen una posición mayor que 0.
                         */
                    } else if (linea.contains("//")) {
                        int indiceComentario = linea.indexOf("//");

                        if (indiceComentario != 0) {
                            System.out.println(linea.substring(0, indiceComentario));
                            bw.write(linea.substring(0, indiceComentario));
                            bw.newLine();
                        }
                        /*
                         * En caso contratio de que no encuentre nada es porque estamos en presencia de
                         * una línea de código sin comentarios por lo que la i
                         * primimos ta cual.
                         */
                    } else {
                        System.out.println(linea);
                        bw.write(linea);
                        bw.newLine();
                    }
                    /*
                     * Si estamos dentro de un comentario no imprimimos nada excepto todo lo que se
                     * encuentra después del final del comentario.
                     */
                } else {
                    if (linea.contains("*/")) {
                        dentroComentario = false;
                        int indiceFinComentario = linea.indexOf("*/");
                        System.out.println(linea.substring(indiceFinComentario +2));
                        bw.write(linea.substring(indiceFinComentario +2));
                        bw.newLine();
                    }

                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
