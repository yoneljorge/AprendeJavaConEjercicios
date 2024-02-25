package Capitulo10.E10;

import java.util.HashMap;

public class Diccionario {
    private HashMap<String, String> d = new HashMap<String, String>() {
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
    private String key;
    public Diccionario(String key){
        this.key = key;
    }

    @Override
    public String toString(){
        return d.get(this.key);
    }
    
    public boolean containsKey(String key){
        return d.containsKey(key);
    } 
}
