package Capitulo10.E17;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Elemento> listaCompra = new ArrayList<Elemento>();

    public Carrito(){
    }

    public void agrega(Elemento x){
        listaCompra.add(x);
    }

    @Override
    public String toString(){
        String cadena = "Contenido del carrito" + 
                        "\n=====================";
        for(Elemento a: listaCompra){
            cadena += "\n";
            cadena += a;
            cadena += "\n";
        }
        return cadena;
    }

    public int numeroDeElementos(){
        return listaCompra.size();
    }

    public double importeTotal(){
        double total = 0;
        for(Elemento a: listaCompra){
            total += a.getTotal();
        }
        return total;
    }
}
