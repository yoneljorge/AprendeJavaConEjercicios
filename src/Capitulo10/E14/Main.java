package Capitulo10.E14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<String, Double>() {
            {
                put("avena", 2.21);
                put("garbanzos", 2.39);
                put("tomate", 1.59);
                put("jengibre", 3.13);
                put("quinoa", 4.50);
                put("guisantes", 1.60);
            }
        };

        ArrayList<String> compra = new ArrayList<String>();
        ArrayList<Integer> cantCompra = new ArrayList<Integer>();

        // *Imprimimos los productos */
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.printf(" %-10s", producto.getKey());
        }
        System.out.println("");
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.printf(" %-10.2f", producto.getValue());
        }
        System.out.println("\n");
        // *Pedimos la compra al cliente */
        String producto = "";
        do {
            System.out.print("Producto: ");
            producto = System.console().readLine();
            if (!producto.equals("fin")) {
                compra.add(producto);
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(System.console().readLine());
                cantCompra.add(cantidad);
            } else {
                break;
            }

        } while (true);

        // *Realizamos el computo de la compra */
        System.out.println("\nProducto  Precio Cantidad Subtotal" +
                "\n----------------------------------");
        int i = 0;
        double total = 0;
        for (String pro : compra) {
            System.out.printf("%-10s %-6.2f %-8d %.2f\n", pro, productos.get(pro), cantCompra.get(i),
                    (double) productos.get(pro) * cantCompra.get(i));
            total += productos.get(pro) * cantCompra.get(i);
            i++;
        }

        System.out.println("\nTOTAL: " + total);
    }

}
