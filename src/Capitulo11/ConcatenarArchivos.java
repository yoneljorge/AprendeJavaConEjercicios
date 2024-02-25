package Capitulo11;

/*
 * Escriba un programa denominado ConcatenarArchivos que concatene el contenido de 
 * varios archivos en uno solo. Por ejemplo:
 * java ConcatenarArchivos archivo1.txt archivo2.txt archivo3.txt todos.txt
 * El archivo todos.txt contendrá los archivos: archivo1. txt, archivo2.txt y archivo3.txt.  
 *
*/

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenarArchivos {
    public static void main(String[] args) {
        /*
         * En caso de que el usuario no introduzca la cantidad de archivos indicados se
         * le envia el mensaje de como debe de utilizarse.
         */
        if (args.length < 2) {
            System.out.println("Se deben introducir más de dos archivos para juntar" +
                    "\nuso: java ConcatenarAchivos File1.txt File2.txt File3.txt ... ");
            return;
        }

        /*
         * Creamos el BufferedWriter para el fichero de salida
         */
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("todos.txt"));

            /*
         * Creamos un array de Bufferes para introducir todos los archivos que vamos a
         * leer.
         */
        ArrayList<BufferedReader> listaArchivos = new ArrayList<BufferedReader>();
        for (String a: args) {
            System.out.print("Leyendo archivo ->" + a);
            listaArchivos.add(new BufferedReader(new FileReader(a)));
            System.out.println(" ok");
        }
        for(BufferedReader br: listaArchivos){
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                bw.write(linea);
                bw.newLine();
            }
        }
        bw.close();
        System.out.println("Fichero de salida todos.txt");
        } catch (IOException ioe) {
            ioe.getMessage();
            ioe.printStackTrace();
        }
    }
}