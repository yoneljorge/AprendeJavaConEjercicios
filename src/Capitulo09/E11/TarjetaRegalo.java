package Capitulo09.E11;

import MisFunciones.Aleatorio;
import java.text.DecimalFormat;

public class TarjetaRegalo {
    // *Atributos de instancia */
    private double saldo;
    private int id;

    // *Constructor */
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.id = Aleatorio.NumeroRandom(10000, 99999);
    }

    public TarjetaRegalo(TarjetaRegalo tr1, TarjetaRegalo tr2){
        this.saldo = tr1.getSaldo() + tr2.getSaldo();
        tr1.setSaldo(0);
        tr2.setSaldo(0);
        this.id = Aleatorio.NumeroRandom(10000, 99999);
    }

    //*Getters and Setters */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getSaldo() {
        return saldo;
    }

    //*Métodos */
    public void gasta(double gasto){
        if(this.saldo > gasto){
            this.saldo -= gasto;
        }else{
            System.out.printf("No tienes suficiente saldo para gastar %.2f €", saldo );
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        double newSaldo = this.saldo + t.saldo;
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(newSaldo);
    }

    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Targeta nº " + this.id + " - Saldo " + formatoEuros.format(this.saldo) + "€";
    }
}
