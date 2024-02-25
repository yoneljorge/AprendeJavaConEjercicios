package Capitulo0701;
/**
 * Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º.
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio20 {  
    public static void main(String[] args) {
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int cantReyes = Integer.parseInt(System.console().readLine());

        //*Generando el arreglo */
        String[] reyes = new String[cantReyes];
        String[] reyesMod = new String[cantReyes];

        
        //*Llenando el arreglo de reyes */
        System.out.println("Valla introduciendo los nombres de los reyes y pulsando INTRO");
        for(int i =0; i < reyes.length; i++){
            reyes[i] = System.console().readLine();
        }

        //*Gestionando ordinal */
        int contador;
        for(int i = 0; i <reyes.length; i++){
            contador =0;
            for(int j =0; j <= i; j++){
                if(reyes[i].equals(reyes[j])){
                    contador ++;
                }
            }
            reyesMod[i] = reyes[i] + " " + String.valueOf(contador) + "º";
        }
        //*Imprimiendo los resultados */
        System.out.println("\nLos reyes introducidos son: ");
        for(int i =0; i < reyesMod.length; i++){
            System.out.println(reyesMod[i]);
        }
    }

}
