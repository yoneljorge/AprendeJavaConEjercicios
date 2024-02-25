package Capitulo05;
/**
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 */


/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio60CalcetinNavidad {
    public static void main(String[] args) {
        int alturaIntro = 0;

        do {
            System.out.print("Introduzca la altura del árbol (mayor o igual a 4): ");
            alturaIntro = Integer.parseInt(System.console().readLine());
            if (alturaIntro >= 4) {
                break;
            } else {
                System.out.println("La altura debe de ser mayor o igual a 4.");
                continue;
            }
        } while (true);

        int planta = 1;
        while (planta <= alturaIntro) {
            
            ////////PRIMER CALCETIN//////////
            System.out.print("***");
        
            if (planta == alturaIntro - 1 || planta == alturaIntro) {
                //Si se encuentra en las ultimas dos plantas se pintan los astericos
                System.out.print("***");
            }
            else{
                System.out.print("   ");
            }

            ////////DIVIDIMOS LOS CALCETINES/////////
            System.out.print("  ");

            ////////SEGUNDO CALCETIN/////////
            System.out.print("***");
        
            if (planta == alturaIntro - 1 || planta == alturaIntro) {
                //Si se encuentra en las ultimas dos plantas se pintan los astericos
                System.out.print("***");
            }
            else{
                System.out.print("   ");
            }
            ////////SALTO DE LINEA//////////
            System.out.println("");
            planta ++;
        }
    }
}
