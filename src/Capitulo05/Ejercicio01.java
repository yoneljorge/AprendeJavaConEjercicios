/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 */
package Capitulo05;

/**
 *
 * @author Yonel
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100;i++){
            if(i % 5 == 0){
                System.out.printf("%d, ", i);
            }
            
        }
    }
}
