package Capitulo11.E04;

import java.util.ArrayList;
import java.util.Collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OrdenarFichero {
    public static void main(String[] args) {

        ArrayList<String> listaPalabras = new ArrayList<String>();
        String nombreArchivo = "";
        String nuevoNombre = "";
        /**
         * En caso de que no se pase el archivo como argumento se pasa a explicar el
         * funcionamiento del programa
         */

        if (args.length == 1) {
            nombreArchivo = args[0];
            /**
             * Se intenta inicializar el archivo del cual se va a leer.
             */
            try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea = "";
                // Leemos del texto y lo almacenamos en el ArrayList
                System.out.println("Palabras desordenadas.");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    listaPalabras.add(linea + "\n");
                }

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
                ioe.printStackTrace();
            }

            // Organizamos las palabras en el array
            Collections.sort(listaPalabras);

            /**
             * Intentamos inicializar el archivo en el cual se va a leer.
             */
            nuevoNombre = modificarNombre(nombreArchivo);
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoNombre))) {
                // Escribimos en el otro fichero
                System.out.println("Palabras ordenadas");
                for (String a : listaPalabras) {
                    System.out.println(a);
                    bw.write(a);
                }

                System.out.println("Palabras organizadas correctamente en el fichero " + nuevoNombre);
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
                ioe.printStackTrace();
            }

        } else {
            System.out.println("Funcionamiento del programa \njava OrdenarFichero fichero.txt");
        }
    }

    /**
     * Función con la cual renombramos un archivo agregandole 'sort' antes de la
     * extensión.
     * 
     * @param nombreArchivo que se quiere modificar el nombre
     * @return nombreArchivo mas sort
     */
    public static String modificarNombre(String nombreArchivo) {
        // Obtenemos la posición del último punto
        int indexPunto = nombreArchivo.lastIndexOf(".");
        // En caso de que no tenga extensión se agrega el sort
        if (indexPunto == -1) {
            return nombreArchivo + "sort";
        } else {
            // Si tiene extension, entonces se separa del nombre y se le agrega el sort
            // antes de la extensión.
            String nombre = nombreArchivo.substring(0, indexPunto);
            String extension = nombreArchivo.substring(indexPunto);
            return nombre + "_sort" + extension;
        }
    }
}
