package Capitulo09.E05;

public class Pizza {
    //*Atributos de clase */
    private static int totalPizzaPedido = 0;
    private static int totalPizzaServido = 0;

    //*Atributos de instancia */
    private Estado estado;
    private Tamano tamano;
    private Tipo tipo;

    //*Constructor */
    public Pizza(Tipo ti, Tamano ta){
        this.tipo = ti;
        this.tamano = ta;
        this.estado = Estado.PEDIDA;
        Pizza.totalPizzaPedido ++;
    }

    //*Métodos */
    /**
     * Sirve la pizza.
     */
    public void sirve(){
        if(this.estado.equals(Estado.PEDIDA)){
            this.estado = Estado.SERVIDA;
            Pizza.totalPizzaServido ++;
        }else{
            System.out.println("esa pizza ya se ha servido");
        }
        
    }

    /**
     * Imprime el estado de la pizza.
     */
    public String toString(){
        return "Estado: " + this.estado +
             "\nTamaño: " + this.tamano +
             "\nTipo: " + this.tipo;
    }

    

    //*Getter y Setter */
    public static int getTotalPizzaPedido() {
        return totalPizzaPedido;
    }

    public static int getTotalPizzaServido() {
        return totalPizzaServido;
    }


}
