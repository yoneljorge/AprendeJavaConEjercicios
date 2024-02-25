package Capitulo09.E08;

import java.text.DecimalFormat;

public class Movil extends Terminal {
    // *Atributos de instancia */
    private double valorTarifa;
    private int totalTarificado;

    // *Constructor */
    public Movil(String numero, Tarifa tarifa) {
        super(numero);
        this.valorTarifa = Tarifa.obtenerValorDeElemento(tarifa);
        this.totalTarificado = 0;
    }

    // *Getters y Setters */

    // *Métodos */

    @Override
    public void llama(Terminal t, int segundosDeLlamada) {
        super.llama(t, segundosDeLlamada);
        double minutos = (double) segundosDeLlamada / 60;
        this.totalTarificado += minutos * valorTarifa;
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.getNumero()
                + " - " + this.getTiempoDeConversacion()
                + "s de conversación - tarificados "
                + formatoEuros.format(this.totalTarificado) + " euros";
    }
}
