package Capitulo09.E10;

public class Ameba {
    // *Atributos de instancia */
    private int peso;

    // *Constructor */
    public Ameba() {
        peso = 3;
    }

    private void setPeso(int p) {
        this.peso = p;
    }

    // *Métodos */
    public void come(int particula) {
        this.peso += particula -1;
    }

    public void come(Ameba otra) {
        this.peso += otra.peso - 1;
        otra.setPeso(0);
    }

    @Override
    public String toString(){
        return "Soy una ameba y peso " + this.peso + " microgramos";
    }
}
