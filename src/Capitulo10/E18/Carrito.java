package Capitulo10.E18;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Elemento> listaCompra = new ArrayList<Elemento>();

    public Carrito() {
    }

    /**
     * Función con la cula vamos a agregar un elemento "a" a la lista de compra, en
     * caso de que no exista entonces se incrementa la cantidad del mismo producto.
     * 
     * @param a Elmento que se va a agregar.
     */
    public void agrega(Elemento a) {
        boolean existe = false;
        for (Elemento b : listaCompra) {
            if (b.equals(a)) {
                existe = true;
                b.incrementarCantidad(a.getCantidad());
                break;
            }
        }
        if (!existe) {
            listaCompra.add(a);
        }
    }

    @Override
    public String toString() {
        String cadena = "Contenido del carrito" +
                "\n=====================";
        for (Elemento a : listaCompra) {
            cadena += "\n";
            cadena += a;
            cadena += "\n";
        }
        return cadena;
    }

    public int numeroDeElementos() {
        return listaCompra.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento a : listaCompra) {
            total += a.getTotal();
        }
        return total;
    }
}
