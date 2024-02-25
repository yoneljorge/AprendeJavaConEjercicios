package Capitulo09.E17;

public class Rectangulo {
    //*Atributos de instancia */
    int base;
    int altura;

    //*Atributos de clase */
    static int total = 0;

    //*Constructor */
    public Rectangulo(int b, int a){
        this.base = b;
        this.altura = a;
        total ++;
    }

    //*Métodos */
    @Override
    public String toString(){
        String dibujo = "";
        for(int i = 1; i <= this.altura; i++){
            for(int j = 1; j <= this.base ; j ++){
                dibujo += "*";
            }
            dibujo += "\n";
        }
        return dibujo;
    }


    public static int getTotal(){
        return total;
    }
}
