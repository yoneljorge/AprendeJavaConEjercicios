package Capitulo03;

/**
 * Programa en el cual se introducen dos numeros y luego se le pide al usuario que operación 
 * aritmética se desea realizar
 * 
 * @author Yonel J. Sánchez
 * 
 */

 import java.util.Scanner;
import java.io.*;

 public class S03Ejercicio04{
    static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    //Función para verificar que se introduzca un número
    static int LeerInt(){
        int valor;
        do{
            if(sc.hasNextInt()){
                valor = sc.nextInt();
                break;
            }else{
                System.out.println("Solo se permiten números");
                sc.next();
                continue;
            }
        }while (true);
        return valor;
    }
    public static void main(String[] args) {
        int seleccion, valor1, valor2, resultado = 0;
        String operacion = "", salir = "";
        do{
            System.out.println("1- Para sumar");
            System.out.println("2- Para restar");
            System.out.println("3- Para dividir");
            System.out.println("4- Para multiplicar");
            //Para verificar que se seleccione una de las opciones propuestas
            do{
                seleccion = LeerInt();
                if(seleccion  >= 1 && seleccion <= 4){
                    break;
                }else{
                    System.out.println("La selección no se encuentra en el rango esperado");
                    sc.next();
                    continue;
                }
            }while(true);

            switch (seleccion) {
                case 1:
                    System.out.println("Dame el primer valor");
                    valor1 = LeerInt();
                    System.out.println("Dame el segundo valor");
                    valor2 = LeerInt();
                    resultado = valor1 + valor2;
                    operacion = "suma";
                    break;
                case 2: 
                    System.out.println("Dame el primer valor");
                    valor1 = LeerInt();
                    System.out.println("Dame el segundo valor");
                    valor2 = LeerInt();
                    resultado = valor1 - valor2;
                    operacion = "resta";
                    break; 
                case 3:
                    System.out.println("Dame el primer valor");
                    valor1 = LeerInt();
                    System.out.println("Dame el segundo valor");
                    valor2 = LeerInt();
                    resultado = valor1 / valor2;
                    operacion = "división";
                    break;  
                case 4:
                    System.out.println("Dame el primer valor");
                    valor1 = LeerInt();
                    System.out.println("Dame el segundo valor");
                    valor2 = LeerInt();
                    resultado = valor1 * valor2;
                    operacion = "multiplicación";
                    break;             
            
                default:
                    break;
             
            }
            System.out.println("El resultado de la " + operacion + " es: " + resultado);
           
            System.out.println("Desea volver a realizar otra operación: si(s), no(n).");
           
            //Validar que solo entre una s o n
            do{
                String input = sc.nextLine();
                if(input.equals("n") || input.equals("s")){
                        salir = input;
                        break;
                    }else{
                        continue;
                    }
            }while(true);

        }while (salir.equals("s"));
    }
 }