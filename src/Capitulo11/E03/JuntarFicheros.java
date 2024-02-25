package Capitulo11.E03;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class JuntarFicheros {
    public static void main(String[] args) {
        ArrayList<BufferedReader> listaDeFicheros = new ArrayList<>();
        if (args.length > 1) {
            try {
                // *Creamos los Buffer de lectura y los aggregamos a la listaDeFicheros*/
                /*
                 * El programa se va a adaptar a la cantidad de ficheros que se le pase como
                 * argumento por lo que creamos una lilsta de BufferedReader.
                 */
                for (String a : args) {
                    String nombreBufferReader = "br" + a;
                    BufferedReader nomBufferedReader;
                    System.out.println("Creando el Buffer de lectura para el fichero --> " + a + " Buffer-->"
                            + nombreBufferReader);
                    listaDeFicheros.add(nomBufferedReader = new BufferedReader(new FileReader(a)));
                }

                // *Creamos el Buffer de escritura */
                System.out.println("Creamos el Buffer de escritura para el fichero --> juntos.txt");
                BufferedWriter bw = new BufferedWriter(new FileWriter("juntos.txt"));

                // *Leemos de cada archivo de texto y lo escribimos en uno solo. */
                String linea = "";
                while (linea != null) {
                    for (BufferedReader br : listaDeFicheros) {
                        linea = br.readLine();
                        if(linea != null){
                            bw.write(linea + "\n");
                        }
                        //br.close();
                    }
                    
                }
                
                bw.close();

            } catch (IOException ioe) {
                System.out.println("Se ha producido un error de escritura/lectura.");
            }

        } else {
            System.out.println(
                    "El programa funciona de la siguiente forma\njava JuntarFicheros fichero1.txt fichero2.txt");
        }
        System.exit(0);
    }
}
