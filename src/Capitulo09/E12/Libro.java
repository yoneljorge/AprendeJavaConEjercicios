package Capitulo09.E12;

public class Libro extends Publicacion implements Prestable{
    //*Atributos de instancia */
    private boolean prestado;

    //*Constructor */
    public Libro(String isbn, String titulo, int anio){
        super(isbn, titulo, anio);
        prestado = false;
    }

    //*Métodos */
    @Override
    public void presta(){
        if (this.prestado) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        this.prestado = true;
    }

    @Override
    public void devuelve(){
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado(){
        return prestado;
    }

    @Override 
    public String toString(){
        return super.toString() + " (" + (this.prestado ? "prestado": "no prestado" ) +")";
    }

}
