package Capitulo06;
/**
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja
 */

import MisFunciones.Aleatorio;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio18{
    public static void main(String[] args) {
        String color1, color2, color3;
        //Generamos el primer color
        color1 = Color(Aleatorio.NumeroRandom(1,6));
        //Hasta que no se genere un color diferente del primero continua generando
        do {
            color2 = Color(Aleatorio.NumeroRandom(1,6));
            if(!color2.equals(color1)){
                break;
            }
        } while (true);
        //Hasta que no se genere un color diferente del primero y del segundo sigue generando.
        do {
            color3 = Color(Aleatorio.NumeroRandom(1,6));
            if(!color3.equals(color1)  && !color3.equals(color2)){
                break;
            }
        } while (true);
        
        System.out.println(color1 + "  " + color2 + "  " + color3);
    }

    /**
     * Funcion que genera un color en dependencia del número que se le introduzca.
     * => 1- Rojo; 2- Azul; 3-Verde; 4-Amarillo; 5-Violeta; 6-Naranja.
     * @param x : numero entero que positivo entre 1 y 6.
     * @return <code>color</code>
     */
    private static String Color(int x) {
        if (x > 6) {
            throw new IllegalArgumentException(x + "esta fuera de los limites.");
        }
        String color = "";
        switch (x) {
            case 1 ->{
                color = "Rojo";
                break;
            }
            case 2 ->{
                color = "Azul";
                break;
            }
            case 3 ->{
                color = "Verde";
                break;
            }
            case 4 ->{
                color = "Amarillo";
                break;
            }
            case 5 ->{
                color = "Violeta";
                break;
            }
            case 6 ->{
                color = "Naranja";
                break;
            }
        }//?Switch
        return color;
    }
}
