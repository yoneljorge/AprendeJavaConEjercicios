package Capitulo11;

/**
 * Escriba un programa denominado Buscador que explore en
 * _todos los archivos dados como argumentos y muestre todas
 * las líneas que contengan una palabra reservada enviada como
 * argumento. Por ejemplo:
 * java Buscador programa archivo1.txt archivo2.txt archivo3.txt
 * Como salida debe mostrarse, para cada archivo, la línea en donde
 * se encuentre la palabra buscada. En el ejemplo se quiere buscar la palabra
 * “programa” en los archivos: archivo1.txt, archivo2.txt y archivo3.txt.
 */

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso del programa: java Buscador palabra File1.txt File2.txt ...");
            return;
        }
        // Creamos una lista para almancenar los ficheros.
        ArrayList<BufferedReader> listaArchivos = new ArrayList<BufferedReader>();
        ArrayList<Integer> listaLineas = new ArrayList<Integer>();
        String palabraBuscar = args[0];
        try {
            for (int i = 0; i < args.length; i++) {
                if (i != 0) {
                    listaArchivos.add(new BufferedReader(new FileReader(args[i])));
                }
            }

            /*
             * Buscamos en cada línea de cada archivo donde se encuentra la palabra
             * introducida como argumentos y si se encuentra se almacena la posición de
             * la/las línea/s en el array listaLineas en el índice correspondiente al
             * archivo que se está leyendo.
             */
            for (BufferedReader br : listaArchivos) {
                String linea = "";
                int indice = 0;
                boolean encontrada = false;
                while ((linea = br.readLine()) != null) {
                    if (linea.contains(palabraBuscar)) {
                        encontrada = true;
                        // listaLineas.add(listaArchivos.indexOf(br),
                        // listaLineas.get(listaArchivos.indexOf(br)) +
                        // "linea " + (indice + 1));
                        listaLineas.add(indice);
                    }
                    indice++;
                }

                if (encontrada) {
                    if (listaLineas.size() != 1) {
                        System.out.printf("Palabra %s encontrada en el archivo %s en las líneas: \n", palabraBuscar,
                                args[1 + listaArchivos.indexOf(br)]);
                        for (int a : listaLineas) {
                            System.out.println("Línea " + a);
                        }
                        listaLineas.clear();
                    }else{
                        System.out.printf("Palabra %s encontrada en el archivo %s en la línea: \n", palabraBuscar,
                                args[1 + listaArchivos.indexOf(br)]);
                        for (int a : listaLineas) {
                            System.out.println("Línea " + a);
                        }
                        listaLineas.clear();
                    }

                } else {
                    System.out.printf("Palabra %s no encontrada en el archivo %s.\n", palabraBuscar,
                            args[listaArchivos.indexOf(br)]);
                }

            }
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
