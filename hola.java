package Capitulo04;

asdfsad/*
* Una pastelería nos ha pedido realizar un programa que haga presupuestos de
* tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
* @author Yonel J. Sánchez
*
*/sadfasdfs
import java.util.Scanner;

public class S04Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a nuestra pastelería");

        System.out.println("1- Manzana");
        System.out.println("2- Fresa");
        System.out.println("3- Chocolate");
        System.out.print("Seleccione un sabor (1-3): ");
        int sabor = Integer.parseInt(sc.next());
        String saborString = "";
        String saborChocolateColor = "";

        double precioTarta = 0;
        double total = 0;

        switch (sabor) {
            case 1 -> {
                precioTarta = 18;
                saborString = "Manzana";
                break;
            }
            case 2 -> {
                precioTarta = 16;
                saborString = "Fresa";
                break;
            }
            case 3 -> {
                saborString = "chocolate";
                System.out.print("¿Lo quiere negro o blanco?: ");
                saborChocolateColor = sc.next().toLowerCase();
                if (saborChocolateColor.equals("negro")) {
                    precioTarta = 14;
                }
                if (saborChocolateColor.equals("blanco")) {
                    precioTarta = 15;
                }
                break;
            }

            default -> {
                break;
            }
        }

        System.out.print("¿Le añadimos nata? (s/n): "); //Preguntamos si le agregamos nata
        boolean nata = (sc.next().toLowerCase()).equals("s");

        System.out.print("¿Personalizar con un nombre? (s/n): "); //Preguntamos si le agregamos nombre
        boolean nombre = (sc.next().toLowerCase()).equals("s");

        System.out.println("\nGracias por visitarnos. Aquí tiene el desglose de su compra");

        if (saborString.equals("chocolate")) { //Si es de chocolate imprimos que es de chocolate mas el si es blanco o negro
            System.out.printf("Tarta de chocolate %-7s %4.2f\n",saborChocolateColor, precioTarta);
            total = total + precioTarta;
        }else{//De lo contrario imprimimos el sabor de la tarta
            System.out.printf("Tarta de %-7s %4.2f\n",saborString, precioTarta);
            total = total + precioTarta;
        }

        if (nata) { //Si pide con nata lo imprimimos y agregamos el valor al total
            System.out.printf("Con nata: 2.50 €\n");
            total = precioTarta + 2.50;
        }

        if (nombre) {//Si pide personalizar con un nombre lo imprimimos y agregamos el valor al total
            System.out.printf("Con nombre: 0.75 €\n");
            total = total + 0.75;
        }
        System.out.printf("Total: %5.2f €", total);
        sc.close();
    }
}
