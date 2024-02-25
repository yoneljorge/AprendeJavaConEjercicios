package Capitulo11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OcurrenciasPalabra {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso del programa: java OcurrenciasPalabras Fichero.txt palabra");
            return;
        }

        String nombreArchivo = args[0];
        String palabraBuscar = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = "";
            int ocurrencias = 0;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabraBuscar)) {
                    while (linea.contains(palabraBuscar)) {
                        ocurrencias++;
                        linea = quitarPalabraBuscada(linea, palabraBuscar);
                    }
                }
            }
            br.close();
            System.out.printf("La palabra %s se encuentra %d veces.", palabraBuscar, ocurrencias);
        } catch (IOException ioe) {
            ioe.getMessage();
            ioe.printStackTrace();
        }
    }

    /**
     * Con esta función buscamos en la línea la palabra que estamos buscando y si
     * existe se borra y se retorna la línea sin la palabra buscada.
     * 
     * @param linea la linia que se le quiere borrar los caracteres.
     * @param palabra palabra que vamos a borrar.
     * @return la linea sin la palabra que se esta buscando.
     */
    public static String quitarPalabraBuscada(String linea, String palabra) {
        int indicePalabra = linea.indexOf(palabra);
        linea = linea.substring(indicePalabra + palabra.length());
        System.out.println("->Ver lo que se borra: " + linea);
        return linea;
    }
}
