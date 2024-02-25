package Capitulo05;

/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que
 * comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * Ejemplo 1:
 * Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
 * Ahora introduzca la altura (como mínimo 2): 1
 * Lo siento, los datos introducidos no son correctos, el valor mínimo para la
 * anchura y la altur\
 * a es 2.
 * Ejemplo 2:
 * Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
 * Ahora introduzca la altura (como mínimo 2): 4
 * * * * * *
 *
 *
 *
 *
 * * * * * *
 */

/**
 * @author Yonel J. Sánchez
 */


public class Ejercicio46 {
    public static void main(String[] args) {
    
        int anchura = LeerInt("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int alturaIntro = LeerInt("Ahora introduzca la altura (como mínimo 2): ");

        int altura =1;
        while (altura <= alturaIntro) {
            for(int i =1; i <= anchura; i++ ){
                if(i ==1 || i == anchura || altura ==1 || altura == alturaIntro){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            altura ++;
            System.out.println("");
        }
    }

    public static int LeerInt(String texto){
        int valor =0;
        do {
            System.out.print(texto);
            valor = Integer.parseInt(System.console().readLine());
            if(valor < 2){
                System.out.println("Debe introducir un valor igual o mayor a 2.");
                continue;
            }
            else{
                break;
            }
        } while (true);
        return valor;
    }
}
