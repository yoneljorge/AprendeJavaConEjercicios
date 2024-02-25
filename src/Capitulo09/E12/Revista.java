package Capitulo09.E12;

public class Revista extends Publicacion{
    private int numero;
    public Revista(String isbn, String titulo, int ano, int numero){
        super(isbn, titulo, ano); 
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    
}
