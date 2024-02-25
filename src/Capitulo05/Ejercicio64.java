package Capitulo05;
/**
 * Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracte-
res de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
orientación, los valores de anchura y altura se intercambian. El valor mínimo
de la altura o la anchura es 2.
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio64 {
    public static void main(String[] args) {

        int ancho = 6;
        int alto = 3;
        do {

            ///////// DIBUJANDO RECTÁNGULO///////////
            for (int i = 1; i <= alto; i++) {
                for (int j = 1; j <= ancho; j++) {
                    if (i == 1 || i == alto || j == 1 || j == ancho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } // 2do FOR
                System.out.println("");
            } // 1er FOR

            ////////// MENU/////////////
            System.out.println("1. Agrandar rectángulo.");
            System.out.println("2. Achicar rectángulo.");
            System.out.println("3. Cambiar la orientación.");
            System.out.println("4. Salir.");

            // Para verificar que se introduzca una de las opciones del menú
            int opcion = 0;
            do {
                System.out.print("Indique que quiere hacer con el rectángulo: ");
                opcion = Integer.parseInt(System.console().readLine());
                if (opcion > 0 && opcion <= 4) {
                    break;
                } else {
                    System.out.println(opcion + " no es una opción.");
                    continue;
                }
            } while (true);// 2do DoWhile

            //////// SWITCH CON OPCIONES//////////
            switch (opcion) {
                case 1:
                    System.out.println("Agrandando rectángulo...\n\n");
                    ancho += 1;
                    alto += 1;
                    break;

                case 2:
                    if (ancho == 2 || alto == 2) {
                        System.out.println("No se puede achicar más.\n\n");
                    } else {
                        System.out.println("Achicando rectángulo...\n\n");
                        ancho -= 1;
                        alto -= 1;
                    }
                    break;
                case 3:
                    System.out.println("Cambiando orientación...\n\n");
                    int aux = ancho;
                    ancho = alto;
                    alto = aux;
                    break;
                case 4:
                    System.out.println("Salienodo...");
                    System.exit(0);
                default:
                    break;
            }
        } while (true); // 1ER DoWhile
    }
}
