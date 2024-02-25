package Capitulo09.E14;

public class FichaDomino {
    // *Atributos de instancia */
    private int lado1;
    private int lado2;

    // *Constructor */
    public FichaDomino(int l1, int l2) {
        this.lado1 = l1;
        this.lado2 = l2;
    }

    // *Métodos */
    public FichaDomino voltea() {
        return new FichaDomino(lado2, lado1);
    }

    public boolean encaja(FichaDomino ficha) {
        return (this.lado1 == ficha.lado1) || (this.lado1 == ficha.lado2) 
            || (this.lado2 == ficha.lado1) || (this.lado2 == ficha.lado2);
    }

    @Override
    public String toString() {
        return "[ " + (lado1 == 0 ? " " : lado1) + " | " + (lado2 == 0 ? " " : lado2) + " ]";
    }
}
