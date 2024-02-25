package Capitulo05;

/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*/
/**
 *@author Yonel J. Sánchez  
*/

public class Ejercicio22 {
    public static void main(String[] args) {
        int primo = 0;
        System.out.println("Mostrando todos los números primos");
        for(int i =2; i < 100; i++){
            primo =0;
            for(int j = 2; j < i; j ++){
                if(i % j == 0){
                    primo ++;
                }
            }
            if(primo == 0){
                System.out.println(i);
            }
        }
        System.out.println("100");
    }
}
