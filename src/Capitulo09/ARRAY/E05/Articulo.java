package Capitulo09.ARRAY.E05;

public class Articulo {
    // *Atributos de instancia */
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    // *Constructor */
    public Articulo() {
        this.codigo = "LIBRE";
    }

    public Articulo(String codgo, String descripcion,
            double precioCompra, double precioVenta, int stock) {
        this.codigo = codgo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString() {
        String cadena = "------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nDescripción: " + this.descripcion;
        cadena += "\nPrecio de compra: " + this.precioCompra;
        cadena += "\nPrecio de venta: " + this.precioVenta;
        cadena += "\nStock: " + this.stock + " unidades";
        cadena += "\n------------------------------------------";
        return cadena;
    }

}
