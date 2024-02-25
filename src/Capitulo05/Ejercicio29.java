
package Capitulo05;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
*/
/** 
 * @author Yonel J. Sánchez
*/
public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        int numero1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el segundo número: ");
        int numero2 = Integer.parseInt(System.console().readLine());

        boolean encontrado = false;
        for(int i = numero1; i > 0; i --){
            if(i % numero2 == 0){
                System.out.println(i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay número divisibles por " + numero2 + " menores que " + numero1 + ".");
        }
    }
}
