package Capitulo04;

/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima 
 * calidad y nos ha pedido hacer un configurador que calcule el precio según
 *  e alto y el ancho. El precio base de una bandera es de un céntimo de euro el 
 * céntimo cuadrado. Si la queremos con un escudo bordado, el precio se incrementa 
 * en 2.50 € independientemente del tamaño. Los gastos de envío son de 3.25 €.
 *  El IVA ya está incluido en todas las tarifas. 
 * 
 * @author Yonel J. Sánchez
 * 
 */

 /**
  * Como lo hice yo <--
  Scanner sc = new Scanner(System.in);

        double alto = 0;
        double ancho =0;
        double area = 0;
        double precioBase = 0;
        double precioFinal = 0;
        
        System.out.print("Intoduzca el alto de la bandera: ");
        alto = sc.nextDouble();
        System.out.println("");

        System.out.print("Introduzca el ancho de la bandera: ");
        ancho = sc.nextDouble();
        System.out.println("");

        area = alto * ancho; //Calculamos el area la bandera
        precioBase = area / 100; //El precio base de una bandera es de un céntimo de euro el centímetro cuadrado

        String escudoString = ""; 
        System.out.print("¿Desea la bandera con un escudo? (s/n): ");
        escudoString = sc.next();

        precioFinal = precioBase + 3.25; //Se agregan los gastos de envío
        
        System.out.println("Gracias. Aquí tiene el desglose de su compra. ");
        System.out.println("Bandera de " + area + " cm2: " + precioBase + " €");
        if(escudoString.equals("s") ){
            System.out.println("Con escudo:          2.50 €" );
            precioFinal = precioFinal + 2.50;
        }else{
            System.out.println("Sin escudo:          0,00 €");
        }
        System.out.println("Gastos de envío:           3,25 €");
        System.out.println("Total:              " + precioFinal);
        sc.close();
  */
import java.util.Scanner;

public class S04Ejercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Intoduzca la altura de la bandera en cm:");
        int altura = Integer.parseInt(s.nextLine());
        System.out.print("Ahora introduzca la anchura: ");
        int anchura = Integer.parseInt(s.nextLine());
        System.out.print("¿Quiere escudo boradado? (s/n): ");
        boolean conEscudo = (s.nextLine().toLowerCase()).equals("s");

        String escudoCadena;
        float precioEcudo;

        if(conEscudo){
            escudoCadena = "Con escudo";
            precioEcudo = 2.50f;
        }else {
            escudoCadena = "Sin escudo";
            precioEcudo = 0;
        }
        System.out.println("Gracias. Aquí tiene el desglose de su compra. ");
        System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
        System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEcudo);
        System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
        System.out.printf("Total:                %5.2f €\n", (float)anchura *altura / 100 + precioEcudo + 3.25);
        s.close();;
    }    
}
