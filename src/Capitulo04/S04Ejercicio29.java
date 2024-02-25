package Capitulo04;

/**
 * Realiza un programa que calcule el precio de un desayuno. El programa 
 * pregunrará primero que ha tomado el usuario de comer: palmera, 
 * donut o pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de 
 * tomar pitufo, el programa debe pregutar además si era con aceite o 
 * con tortilla; el primero vale 1.20 € y el segundo 1.60 €. Por último
 *  se pregunta por la bebida: zumo o café a 1.50 € y 1.20 € respectivamente.
 * 
 * @author Yonel J. Sánchez 
 *
 */

import java.util.Scanner;

public class S04Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué ha tomado el usuario de comer? (palmera, donut o pitufo): ");
        String desayunoComida = sc.next().toLowerCase();

        double precioComida = 0;
        double precioBebida = 0;

        String pitufoComo = "";

        switch (desayunoComida) {
            case "palmera" -> {
                precioComida = 1.40;
                break;
            }
            case "donut" -> {
                precioComida = 1;
                break;
            }
            case "pitufo" -> {
                System.out.print("¿Con aceite o tortilla?: ");
                pitufoComo = sc.next().toLowerCase();
                if (pitufoComo.equals("aceite")) {
                    precioComida = 1.20;
                }
                if (pitufoComo.equals("tortilla")) {
                    precioComida = 1.60;
                }
                break;
            }
            default -> {
                break;
            }
        }

        //Pregunta por la bebida y agrega el valor a la variable precioBebida
        System.out.print("¿Que desea tomar? (zumo o cafe): ");
        String desayunoBebida = sc.next().toLowerCase();
        if (desayunoBebida.equals("zumo")) {
            precioBebida = 1.50;
        }
        if (desayunoBebida.equals("cafe")) {
            precioBebida = 1.20;
        }

        //En dependencia de la comida que halla seleccionado el usuario se imprime con el precio
        System.out.println("\nGracias por su compra. Aquí tiene el desglose de su compra.");
        if (desayunoComida.equals("pitufo")) {
            System.out.printf("Pitufo con %-10s : %4.2f €\n",pitufoComo,precioComida);
        }else{
            System.out.printf("%-10s : %4.2f €\n", desayunoComida, precioComida);
        }

        //En dependencia de la bebida que halla seleccionado el usuario se imprime con el precio
        System.out.printf("%-6s : %4.2f €\n", desayunoBebida, precioBebida);
        System.out.printf("Total : %4.2f €\n", (double)precioComida + precioBebida);
        sc.close();
    }
}
