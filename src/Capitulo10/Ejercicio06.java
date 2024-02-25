package Capitulo10;

/**
 * Programa que implementa el control de acceso al área restringida de un programa.
 */
/**
 * @author Yonel J. Sánchez
 */

import java.util.HashMap;

public class Ejercicio06 {
    public static void main(String[] args) {
        HashMap<String, String> usersList = new HashMap<String, String>();
        usersList.put("yonel", "yonel");
        usersList.put("cheila", "cheila");
        usersList.put("marlis", "marlis");

        int intent = 0;
        do {
            intent ++;
            System.out.print("user: ");
            String user = System.console().readLine();
            System.out.print("passwd: ");
            String passw = System.console().readLine();

            if(usersList.containsKey(user)){
                if(usersList.get(user).equals(passw)){
                    System.out.println("Has entrado al sistema");
                    break;
                }else{
                    System.out.println("Usuario o contraseña incorrectos");
                }
            }else{
                System.out.println("Usuario o contraseña incorrectos");
            }

            if(intent == 3){
                System.out.println("Lo siento, no tiene acceso al area restringida");
                break;
            }
        } while (true);
    }
}
