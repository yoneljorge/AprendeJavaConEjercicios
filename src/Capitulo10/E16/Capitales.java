package Capitulo10.E16;

import java.util.HashMap;

public class Capitales {
    static HashMap<String, String> capitales = new HashMap<String, String>(){{
        put("España", "Madrid");
        put("Portugal","Lisboa");
        put("Francia", "París");
    }};

    public static void main(String[] args) {

        String pais = "";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = System.console().readLine();
            if(!pais.equals("salir")){
                if(capitales.containsKey(pais)){
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais) + ".");
                }else{
                    System.out.printf("No conozco la respuesta, ¿Cuál es la capital de %s?: ", pais);
                    String capital = System.console().readLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }else{
                break;
            }
            
        } while (true);
    }
}
