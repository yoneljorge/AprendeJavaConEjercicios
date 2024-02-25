package Capitulo04;

/**
 * Realizar un prograna que nos diga si hay probabilidad de que nuestra pareja nos está 
 * siendo infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero
 * o falso. Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas 
 * con falso no sumaran puntos. A continuación se listan las preguntas del test.
 * 
 * @author Yonel J. Sánchez
 * 
 */

import java.util.Scanner;

public class S04Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntuacion = 0;
        String respuesta = " ";


        System.out.println("Programa en cual se sabe si nuestra pareja nos está siendo infiel");    
        System.out.println("Ingrese verdadero(V) o falso(F)\n\n");
        System.out.println("1- Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("2- Ha aumentado sus gastos de vestuario");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("3- Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("4- Ahora se afeita y se asea con más frecuencia (si es mujer).");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("5- No te deja que mires la agenda de su teléfono movil.");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("6- A veses tiene llamadas que dice ni querer contestar cuando estás tú delante.");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("7- Últimamente se procupa más en cuidar la línea y/o estar bronceado/a.");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("8- Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("9- Has notado que últimamente se perfuma más.");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }
        System.out.println("10- Se confunde y te dice que has estado en sitiios donde no ha ido contigo.");
        respuesta = sc.nextLine();
        if(respuesta.equals("v")){
            puntuacion = puntuacion + 3;
        }

        if(puntuacion <= 10){
            System.out.println("!Enhorabuena¡ tu pareja parece ser totalmente fiel.");
        }else if(puntuacion <= 22){
            System.out.println("Quizás exista el peligro de otra persona en su vida \n" + 
                               "o en su mente, aunque seguramente será algo sin importancia.\n" + 
                               "No bajes la guardia.");
        }else if(puntuacion <= 30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance\n"+ 
                               "con otra persona. Te aconsejamos que indagues un poco más y averigües\n" +
                               "que es lo que está pasando por su cabeza.");
        }
        sc.close();
    }
    
    
}
