package Capitulo04;

/**
 * Realiza un programa que, dado un día de la semana(de lunes a viernes) y 
 * una hora(hora y minutos), calcule cuántos minutos faltan para el fin de 
 * semana. Se considerará que el fin de semana comienza el viernes a las 
 * 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, 
 * anterior al viernes a las 15:00h.
 * 
 * @author  Yonel J. Sánchez
 * 
 */
import java.util.Scanner;

public class S04Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        int hora = 0;
        int minutos = 0;
        int totalMinutos = 0;
        String horaIngresada;

        System.out.println("Programa con el cual podremos saber cuantos minutos\n" + 
                           " faltan para el fin de semana");
        System.out.println("Seleccione un día de la semana: ");
        System.out.println("1- Lunes");
        System.out.println("2- Martes");
        System.out.println("3- Miercoles");
        System.out.println("4- Jueves");
        System.out.println("5- Viernes");


        
        //Verificar que se ha introdicido un número en el rango de 1 a 5


        do{
            do{
                if(sc.hasNextInt()){
                    dia = sc.nextInt();
                    break;
                }else{
                    System.out.println("No introduciste un número");
                    sc.next();
                    continue;
                }
            }while(true);

            if(dia >= 1 && dia <= 5){
                break;
            }else{
                System.out.println("El número introducido no está en la lista");
                continue;
            }
        }while(true);
        System.out.println("Introduzca la hora en formato HH:MM. Ej: 14:30");



        //Verificar que se ha introducido un número en la hora y que esta en el rango 


        do{
            horaIngresada = sc.next();
            String[] componentesHora =  horaIngresada.split(":"); 
            //hora = Integer.parseInt(componentesHora[0]);
            //minutos = Integer.parseInt(componentesHora[1]);


            //Verificando de que se halla introducido una hora correcta
            if(esNumero(componentesHora[0]) && esNumero(componentesHora[1])){
                hora = Integer.parseInt(componentesHora[0]);
                minutos = Integer.parseInt(componentesHora[1]);

                if(hora > 23 || hora < 0){
                    System.out.println("La hora no se encuentra en el rango esperado");
                    //sc.next();
                    continue;
                }else if(minutos >= 60 || minutos < 00){
                    System.out.println("Los minutos no se encuentran en el rango esperado");
                    //sc.next();-->si se activa pide dos veces el número
                    continue;
                }else{
                    break;
                }
            }else{
                System.out.println("La hora introducida no es un número");
            }
        }while (true);



        if(dia == 5){
            if(hora >= 13){
                System.out.println("Ya estás en el fin de semana !A Gozar Carajo¡");
            }else{
                totalMinutos = ((12 - hora) * 60) + (60 - minutos);
                System.out.println("Para el fin de semana faltan " + totalMinutos + " minutos.");
            }
        }else{
            switch (dia) {
                case 4:
                    totalMinutos = ((24 - hora) + 12) * 60 + (60 - minutos);
                    System.out.println("Para el fin de semana faltan " + totalMinutos + " minutos.");
                    break;
                case 3:
                    totalMinutos = (24 + (24 - hora) + 12) * 60 + (60 - minutos);
                    System.out.println("Para el fin de semana faltan " + totalMinutos + " minutos.");
                    break;
                case 2:
                    totalMinutos = (24 * 2 + (24 - hora) + 12) * 60 + (60 - minutos);
                    System.out.println("Para el fin de semana faltan " + totalMinutos + " minutos.");
                    break;            
                case 1:
                    totalMinutos = (24 * 3 + (24 - hora) + 12) * 60 + (60 - minutos);
                    System.out.println("Para el fin de semana faltan " + totalMinutos + " minutos.");
                    break;

                
                default:
                    break;
            }
        }
        sc.close();
    }    

    //Función para identificar si es un número o una cadena
    private static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
