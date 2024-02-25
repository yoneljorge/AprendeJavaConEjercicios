package Capitulo10.E21;

import java.util.HashMap;

public class AmigosDeLosAnfibios {
    public static void main(String[] args) {
        HashMap<String, String> diccionarioAnfibioHabitat = new HashMap<String, String>(){{
            put("rana","En los trópicos y cerca de las zonas húmedas y acuáticas.");
            put("salamandra","Ecosistemas húmedos.");
            put("sapo", "En cualquier sitio salvo el desierto y la Antártida.");
            put("tritón", "América y África");
        }};
        HashMap<String, String> diccionarioAnfibioAlimentacion = new HashMap<String, String>(){{
            put("rana","Lasvas e insectos.");
            put("salamandra","Pequeños crustáceos e insectos.");
            put("sapo", "Insectos, lombrices y pequeños roedores.");
            put("tritón", "Insectos.");
        }};

        System.out.println("A S O C I A C I Ó N   A M I G O S   D E   L O S   A N F I B I O S");
        do {
            System.out.print("Introduzca el tipo de anfibio: ");
            String tipoDeAnfibio = System.console().readLine();
            if(!tipoDeAnfibio.equals("salir")){
                if(diccionarioAnfibioHabitat.containsKey(tipoDeAnfibio)){
                    System.out.println("Habitad: " + diccionarioAnfibioHabitat.get(tipoDeAnfibio));
                    System.out.println("Alimentación: " + diccionarioAnfibioAlimentacion.get(tipoDeAnfibio) + "\n");
                }else{
                    System.out.println("Ese tipo de anfibio no existe.  ");
                }
            }else{
                break;
            }
        } while (true);
    }
}
