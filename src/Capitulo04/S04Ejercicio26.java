package Capitulo04;

/*
 * * Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).
 */


/**
 *
 * @author Yonel
 */
import java.util.Scanner;

public class S04Ejercicio26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ventas de entrada CineCampa");
        System.out.print("Número de entradas: ");
        int entradas = Integer.parseInt(sc.nextLine());
        
        System.out.print("Día de la semana: ");
        String dia = sc.nextLine().toLowerCase();
        
        System.out.print("Tiene targeta CineCampa (s/n): ");
        boolean targeta = (sc.next().toLowerCase()).equals("s");
        
        int entradasIndividuales = 0;
        int entradasParejas = 0;
        int precioEntradasIndividual = 8;
        int precioEntradasParejas = 11;
        boolean parejas = false;
        boolean individuales = false;
        double total = 0 , descuento = 0, apagar = 0;
        
        switch(dia){
            case "miercoles" -> {
                individuales = true;
                precioEntradasIndividual = 5;
                entradasIndividuales = entradas;
                total = entradasIndividuales * precioEntradasIndividual; 
            }
            case "jueves" -> {
                parejas = true;
                entradasParejas = entradas / 2;
                if(entradas % 2 != 0) {
                    entradasIndividuales = 1;
                    individuales = true;
                }
                total = entradasParejas * precioEntradasParejas + entradasIndividuales * precioEntradasIndividual;
            }
            default -> {
                individuales = true;
                entradasIndividuales = entradas;
                total = entradasIndividuales * precioEntradasIndividual; 
            } 
        }
        
        if(targeta){
            descuento = total / 10;
        }

        apagar = total - descuento;
        
        System.out.println("\n\nAquí tiene sus entradas. Gracias por su compra");
        if(parejas){
            System.out.printf("%-35s %7d\n", "Entradas de parejas", entradasParejas);
            System.out.printf("%-35s %7d\n", "Precio por entradas de parejas", precioEntradasParejas);
        }
        if(individuales){
            System.out.printf("%-35s %7d\n", "Entradas individuales", entradasIndividuales);
            System.out.printf("%-35s %7d\n", "Precio por entrada individual", precioEntradasIndividual);
        }
        System.out.printf("%-35s %7.2f\n", "Total",total);
        System.out.printf("%-35s %7.2f\n", "Descuento",descuento);
        System.out.printf("%-35s %7.2f\n", "A pagar",apagar);
        sc.close();
    }
}
