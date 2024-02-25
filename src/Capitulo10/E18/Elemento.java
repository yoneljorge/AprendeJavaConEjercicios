package Capitulo10.E18;

import java.text.DecimalFormat;
import java.util.Objects;

public class Elemento {
    // *Atributos de instancia */
    private String producto;
    private double precio;
    private int cantidad;

    // *Constructor */
    public Elemento(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // *Métodos */
    @Override
    public String toString() {
        DecimalFormat formatEuros = new DecimalFormat("0.00");
        String cadena = "Producto: " + this.producto +
                "\nPrecio: " + this.precio +
                "\nCantidad: " + this.cantidad +
                "\nSubtotal: " + formatEuros.format(this.getTotal());
        return cadena;
    }

    public double getTotal() {
        return this.precio * this.cantidad;
    }

    /**
     * Función con la cual incrementamos el número de unidades de este producto.
     * 
     * @param c cantidad que se va a incrementar.
     */
    public void incrementarCantidad(int c) {
        if (c > 0) {
            this.cantidad += c;
        } else {
            System.out.printf("No se puede agregar esta cantidad (%d)\n", c);
        }

    }

    public int getCantidad() {
        return this.cantidad;
    }

    /**
     * Función con la cual comparamos el objeto actual con otro pasado como
     * parámetro, primero se verifica si el objeto pasado es nulo, luego se compara
     * si la clase del objeto pasado como parámetro es igual a esta, y luego de
     * hacer un casting a Elemento al objeto pasado como parámetro se verifica si
     * tienen el mismo producto, en caso de que todo esto sea verdadero se pasa
     * verdadero.
     * 
     * @param obj Elemento que se desea comparar.
     * @return <code>false</code> si el obj pasado como parámetro es nulo.
     * @return <code>false</code> si el objeto pasado como parámetro no pertenece a
     *         esta clase.
     * @return <code>false</code> si el objeto pasado como parámetro no tiene el
     *         mismo producto.
     * @return <code>true</code> si los dos objetos tienen el mismo producto.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Elemento other = (Elemento) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return true;
    }
}
