package Capitulo09.E08;

public class Terminal {

    // *Atributos de instancia */
    private int tiempoDeConversacion;
    private String numero;

    // *Constructor */
    public Terminal(String numero) {
        this.numero = numero;
        this.tiempoDeConversacion = 0;
    }

    // *Getters y Setters */
    public String getNumero() {
        return numero;
    }

    public int getTiempoDeConversacion() {
        return tiempoDeConversacion;
    }

    private void setTiempoDeConversacion(int s) {
        this.tiempoDeConversacion += s;
    }

    // *Métodos */
    public void llama(Terminal t, int segundosDeLlamada) {
        this.tiempoDeConversacion += segundosDeLlamada;
        t.setTiempoDeConversacion(segundosDeLlamada);
    }

    @Override
    public String toString() {
        return "Nº " + this.numero + " - " + String.valueOf(tiempoDeConversacion) + "s de conversación";
    }

}
