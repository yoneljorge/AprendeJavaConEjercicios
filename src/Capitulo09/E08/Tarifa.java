package Capitulo09.E08;

public enum Tarifa {
    RATA(0.06),
    MONO(0.12),
    BISONTE(0.30);

    private final double valor;

    Tarifa(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public static double obtenerValorDeElemento(Tarifa tarifa) {
        return tarifa.getValor();
    }
}
