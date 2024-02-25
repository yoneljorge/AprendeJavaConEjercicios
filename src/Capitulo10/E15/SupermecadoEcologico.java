package Capitulo10.E15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SupermecadoEcologico {

    // *Declaramos las listas de las compras */
    static ArrayList<String> compra = new ArrayList<String>();
    static ArrayList<Integer> cantCompra = new ArrayList<Integer>();

    public static void main(String[] args) {
        // *Creamos el diccionario con los productos */
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
        boolean codigoDescuento = false;
        do {
            System.out.print("Producto: ");
            producto = System.console().readLine();
            // *Cuando el cliente escriba fin termina la compra */
            if (!producto.equals("fin")) {
                // *En caso de que el cliente ya halla mencionado el producto solo se agrega al
                // computo la cantidad */
                if (!yaComprado(producto)) {
                    compra.add(producto);
                    System.out.print("Cantidad: ");
                    int cantidad = Integer.parseInt(System.console().readLine());
                    cantCompra.add(cantidad);
                } else {
                    System.out.print("Cantidad: ");
                    int cantidad = Integer.parseInt(System.console().readLine());
                    // *Se busca el índice del producto para agregar la canidad a la que ya estaba
                    // antes en caso de existir la compra del producto */
                    cantCompra.add(posicionComprado(producto), (cantCompra.get(posicionComprado(producto)) + cantidad));
                }

            } else {
                // *Cuando se va a terminar de pedir los productos se le pregunta si tiene
                // código de descuento */
                System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
                codigoDescuento = System.console().readLine().toUpperCase().equals("ECODTO");
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

        if (codigoDescuento) {
            System.out.printf("----------------------------------\nDescuento: %.2f\n----------------------------------",
                    (double) total / 10);
            System.out.printf("\nTOTAL: %.2f", (double) total - total / 10);
        } else {
            System.out.printf("\nTOTAL: %.2f", total);
        }

    }

    public static boolean yaComprado(String producto) {
        for (String pro : compra) {
            if (producto.equals(pro)) {
                return true;
            }
        }
        return false;
    }

    public static int posicionComprado(String producto) {
        int i = 0;
        for (String pro : compra) {
            if (producto.equals(pro)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
