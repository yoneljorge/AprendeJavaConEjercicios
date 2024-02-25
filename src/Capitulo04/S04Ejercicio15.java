package Capitulo04;

/**
 * Programa en el cual se pinta una piramide rellena con un caracter que seleccione el
 * usuario, tambien se le pide que introduzca el tamaño de la pirámide, hacia donde debe de 
 * apuntar el vértice y si la quiere vacía o llena.
 * 
 * 
 *--> Para imprimir:
 *    Imprime la piramide hacia abajo con solo cambiar la variable fila y columna 
 *    de lugar luego de pasarla del comparador a igualar el indice en el for. Es decir
 *    invierte la piramide hacia abajo
 *           
 * 
 * @author Yonel J. Sánchez
 *  
 */
import java.util.Scanner;
import java.io.*;

public class S04Ejercicio15 {

    static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
    //Función para verificar que solo se introduzcan números enteros
    static int leerInt(){
        int retorno;
        do{
            if(sc.hasNextInt()){
                retorno =  sc.nextInt();
                break;
            }else{
                System.out.println("Solo números");
                sc.next();
                continue;
            }
        }while(true);
        return retorno;
    }        
     
    public static void main(String[] args) {
        int vertice = 0;
        int reductor = 0;
        int filas = 0; 
        int columnas = 0; 
        String simbolo = "";

        //-->Menu para seleccionar los diferentes características de la pirámide<--
        //Verificamos que se introduzca un número impar y que no sea 1
        do{  
            System.out.println("   De qué tamaño quiere la pirámide,\n" + 
                               "la base debe de ser un némero impar\n" + 
                               "       e igual o mayor a 3 \n");
            columnas = leerInt();
            if(columnas == 1){
                System.out.println("El tamano no puede ser 1\n");
                continue;
            }else{
                if(columnas % 2 != 0){
                    System.out.println("OK, la pirámide será de " + columnas + " *\n");
                    break;
                }else{
                    System.out.println("Solo se permiten números impares\n");
                    continue;
                }
            } 
        }while(true);

        //Le pedimos con que símbolo quiere que se cree la pirámide
        System.out.println("Introduzca el símbolo con el que usted desea que cree la pirámide");
        simbolo = sc.next();

        filas = columnas / 2;
        
        System.out.println("Hacia donde quiere que apunte el vértice");
        System.out.println("1- Hacia Arriba");
        System.out.println("2- Hacia Abajo");
        System.out.println("3- Hacia la Derecha");
        System.out.println("4- Hacia la Izquierda");

        //controlamos que el número introducido este entre el 1 y el 4
        do{
            vertice = leerInt();
            if(vertice >= 1 || vertice <= 4){
                break;
            }else{
                System.out.println("El número debe de estar entre el 1 y el 4");
                continue;
            }
        }while (true);
        
        
        //Creamos el arreglo
        int x = 0;
        int y = 0;
        if(vertice == 1 || vertice == 2){
            y = filas + 1;
            x = columnas;
        }else{
            //Arreglamos el error de cuando se crea la pirámide a la derecha.
            y = columnas;
            x = filas +1;
        }
        String[][] piramide = new String[y][x];

        
        
        //Si el vértice es 1 o 2 la pirámide se crea hacia arriba
        //y si el vértice es 3 o 4 se crea hacia la derecha
        if(vertice == 1 || vertice == 2){
            for(int i = filas; i >= 0; i --){
                for(int j = 0; j < columnas; j ++){
                    int limiteInferior = 0 + reductor;  
                    int limiteSuperior = (columnas - 1) - reductor;
                    if(j >= limiteInferior && j <= limiteSuperior){
                        piramide[i][j] = simbolo;
                    }else{
                        piramide[i][j] = " ";
                    }
                }
                reductor ++;
            }
        }else if(vertice == 3 || vertice == 4){
            for(int i = filas; i >= 0; i --){
                for(int j = 0; j < columnas; j ++){
                    int limiteInferior = 0 + reductor;  
                    int limiteSuperior = (columnas - 1) - reductor;
                    if(j >= limiteInferior && j <= limiteSuperior){
                        piramide[j][i] = simbolo;
                    }else{
                        piramide[j][i] = " ";
                    }
                }
                reductor ++;
            }
        }

        //Imprimimos la pirámide
        switch (vertice) {
            case 1:
                for(int i = 0; i <= filas; i ++){
                    for(int j = 0; j < columnas; j ++){
                        System.out.print(piramide[i][j] + "    ");
                    }
                    System.out.println("\n");
                }
                break;
            
            case 2:
                for(int i = filas; i >= 0; i --){
                    for(int j = columnas - 1; j >= 0; j --){
                        System.out.print(piramide[i][j] + "    ");
                    }
                    System.out.println("\n");
                }
                break;

            case 3:
                for(int i = 0; i < columnas; i ++){
                    for(int j = 0; j <= filas; j ++){
                        System.out.print(piramide[i][j] + "    ");
                    }
                    System.out.println("\n");
                }
                break;

            case 4:
                for(int i = columnas - 1; i >= 0; i --){
                    for(int j = filas; j >= 0; j --){
                        System.out.print(piramide[i][j] + "    ");
                    }
                    System.out.println("\n");
                }
                break;

            default:
                break;
        }
    }
}
