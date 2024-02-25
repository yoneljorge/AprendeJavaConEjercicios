package Capitulo10.E11;

import java.util.HashMap;

public class DicInglesEspanol {
    private static HashMap<String, String> d = new HashMap<String, String>() {
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

    public static String getClave(String key){
        return d.get(key);
        
    }
    public static boolean containsKey(String key) {
        return d.containsKey(key);
    }
}
