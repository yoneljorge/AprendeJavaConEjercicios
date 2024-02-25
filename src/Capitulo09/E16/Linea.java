package Capitulo09.E16;

public class Linea {
    Punto p1;
    Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea formada por los puntos " + this.p1 + " y " + this.p2;
    }
}
