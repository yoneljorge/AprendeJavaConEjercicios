package Capitulo09.E05;

public class Main {
    public static void main(String[] args) {

        Pizza p1 = new Pizza(Tipo.MARGARITA, Tamano.MEDIANA);
        Pizza p2 = new Pizza(Tipo.FUNGHI, Tamano.FAMILIAR);

        p2.sirve();
        Pizza p3 = new Pizza(Tipo.CUATRO_QUESOS, Tamano.MEDIANA);

        System.out.println(p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3 + "\n");
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPizzaPedido());
        System.out.println("servidas: " + Pizza.getTotalPizzaServido());
    }
}
