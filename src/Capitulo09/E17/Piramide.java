package Capitulo09.E17;

public class Piramide {
    int altura;
    static int total;

    public Piramide(int a){
        this.altura = a;
        total ++;
    }

    //*Métodos */
    public String toString(){
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = this.altura - 1;
        String dibujo = "";
        
        while (planta <= this.altura) {
            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                dibujo +=" ";

            }
            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                dibujo += "*";
            }
            dibujo += "\n";
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
        
        return dibujo;
    }

    public static int getTotal(){
        return total;
    }
}
