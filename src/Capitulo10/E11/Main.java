package Capitulo10.E11;

import java.util.HashMap;

import MisFunciones.Aleatorio;

public class Main {
    public static void main(String[] args) {
        //*Creamos el diccionario */
        HashMap<String, String> d = new HashMap<String, String>() {
            {
                put("hello", "hola");
                put("house", "casa");
                put("sky", "cielo");
                put("dog", "perro");
                put("tree", "arbol");
                put("book", "libro");
                put("water", "agua");
                put("sun", "sol");
                put("food", "comida");
                put("love", "amor");
                put("family", "familia");
                put("time", "tiempo");
                put("music", "musica");
                put("friend", "musica");
                put("health", "salud");
                put("work", "trabajo");
                put("sleep", "dormir");
                put("happy", "feliz");
                put("school", "escuela");
                put("beach", "playa");
            }
        };
        //*Inicializamos las variables */
        int error =0;
        int aciertos = 0;

        //*Creamos la list de palabras en ingles */
        String[] listaIngles = d.keySet().toArray(new String[0]);

        //*Le vamos dando palabras en ingles aleatorias  */
        System.out.println("Escriba la traducción al español de las siguientes palabras: ");
        for(int i =0; i < 5; i ++){
            String palabraIngles = listaIngles[Aleatorio.NumeroRandom(0, 19)];
            System.out.print(palabraIngles + ": ");
            String palabraEspanol = System.console().readLine();

            //*Comprobamos si hacierta */
            if(d.get(palabraIngles).equals(palabraEspanol)){
                aciertos ++;
                System.out.println("Lo has conseguido");
            }else{
                error ++;
                System.out.println("Lo siento te has equivocado");
            }
        }

        //*Mostramos el resultado */
        System.out.printf("Has acertado en %d palabras, te has equivocado en %d, para una puntuación de %d", aciertos,error, (5- error));
        
    }
}
