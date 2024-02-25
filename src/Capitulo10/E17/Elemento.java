package Capitulo10.E17;

public class Elemento {
    //*Atributos de instancia */
    private String producto;
    private double precio;
    private int cantidad;

    //*Constructor */
    public Elemento(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //*Métodos */
    @Override
    public String toString(){
        String cadena = "Producto: " + this.producto +
                        "\nPrecio: " + this.precio + 
                        "\nCantidad: " + this. cantidad; 
        return cadena;
    }

    public double getTotal(){
        return this.precio * this.cantidad;
    }
}
