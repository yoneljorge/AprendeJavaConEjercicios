package Capitulo06;

/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
 */
import MisFunciones.Aleatorio;
import MisFunciones.MaquinaTragaperras;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        // ?Cantidad de monedas con las que comienza el usuario.
        int cantMonedas = 0;
        // *******PRIMER MENU********* */
        System.out.println("**********************************");
        System.out.println("PREPARADO PARA JUGAR");
        System.out.print("Ingrese la cantidad de monedas: ");
        cantMonedas = Integer.parseInt(System.console().readLine());
        System.out.print("Presione ENTER para COMENZAR..");
        System.console().readLine();
        do {
            cantMonedas--;
            //////// ?Generamos las figuras/////////////
            String figura1 = MaquinaTragaperras.GenerarFiguras(Aleatorio.NumeroRandom(1, 5));
            String figura2 = MaquinaTragaperras.GenerarFiguras(Aleatorio.NumeroRandom(1, 5));
            String figura3 = MaquinaTragaperras.GenerarFiguras(Aleatorio.NumeroRandom(1, 5));
            // *******IMPRIMIMOS LAS FIGURAS******* */
            System.out.println("**********************************");
            System.out.println(figura1 + "--" + figura2 + "--" + figura3);
            // ******COMPROBAMOS QUE SEAN IGUALES************ */
            System.out.println("**********************************");
            if (figura1.equals(figura2) && figura1.equals(figura3)) {
                System.out.println("Enhorabuena, ha ganado 10 monedas.");
                cantMonedas += 10;
            } else if (figura1.equals(figura2) || figura2.equals(figura3) || figura3.equals(figura1)) {
                System.out.println("Bien, ha recuperado su moneda.");
                cantMonedas++;
            } else {
                System.out.println("Lo siento, ha perdido.");
            }

            if (cantMonedas == 0) {
                System.out.println("Se le han acabado las monedas");
                System.out.print("Desea introducir más(s/n): ");
                boolean siMasMonedas = System.console().readLine().toLowerCase().equals("s");
                if (siMasMonedas) {
                    System.out.println("Ingrese la cantidad de monedas: ");
                    cantMonedas = Integer.parseInt(System.console().readLine());
                } else {
                    System.out.println("Vuelva pronto. ");
                    break;
                }
            } else {
                // ******MENU******** */
                System.out.println("**********************************");
                System.out.println("Monedero: " + cantMonedas);
                System.out.println("1. Jugar de nuevo.");
                System.out.println("2. Salir");
                int seleccion = 0;
                // Verificamos que se introudzca el 1 o el 2.
                do {
                    System.out.print("Introduzca su selección: ");
                    seleccion = Integer.parseInt(System.console().readLine());
                    if (seleccion == 1 || seleccion == 2) {
                        System.out.println("Vuelva pronto. ");
                        break;
                    }
                } while (true);

                if (seleccion == 2) {
                    break;
                }
            } // else
        } while (true);

    }//MAIN
}
