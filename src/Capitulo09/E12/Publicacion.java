package Capitulo09.E12;

public class Publicacion {
    private String isbn;
    private String titulo;
    private int anoPublicacion;

    public Publicacion(String isbn, String titulo, int anio){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacion = anio;
    }

    @Override
    public String toString(){
        return "ISBN: " + this.isbn + ", título: " + this.titulo + ", año de publicación: " + this.anoPublicacion;
    }
}
