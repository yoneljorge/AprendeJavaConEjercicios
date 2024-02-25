package Capitulo09.E13;

import java.util.ArrayList;
import java.text.DecimalFormat;

import MisFunciones.Aleatorio;

public class CuentaCorriente {
    // *Atributos de instancia */
    private ArrayList<String> registro = new ArrayList<String>();
    private long id = 0;
    private double saldo;

    // *Constructores */
    public CuentaCorriente() {
        this.id = Aleatorio.NumeroRandom(1, 9);
        for (int i = 1; i < 10; i++) {
            this.id *= 10;
            this.id += Aleatorio.NumeroRandom(1, 9);
            // id2 *= 10;
            // id2 += Aleatorio.NumeroRandom(1, 9);
        }
        this.saldo = 0;
        registro.add("Saldo inicial: " + this.saldo + "euros.");
    }

    public CuentaCorriente(double saldoInicial) {
        this.id = Aleatorio.NumeroRandom(0, 9);
        for (int i = 1; i < 10; i++) {
            this.id *= 10;
            this.id += Aleatorio.NumeroRandom(0, 9);
        }
        this.saldo = saldoInicial;
        registro.add("Saldo inicial: " + this.saldo + "euros.");
    }

    // *Getters and Setters */

    // *Métodos */
    public void ingreso(double ingreso) {
        this.saldo += ingreso;
        registro.add("Ingreso de " + ingreso + "€. --> Saldo: " + this.saldo);
    }

    public void cargo(double gasto) {
        this.saldo -= gasto;
        registro.add("Cargo de " + gasto + "€. --> Saldo: " + this.saldo);
    }

    public void transferencia(CuentaCorriente cc, double saldo) {
        if (saldo > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            cc.saldo += saldo;
            this.saldo -= saldo;
            registro.add("Transf. emitida de " + saldo + " € la cueta " + cc.id + "-->Saldo " + this.saldo + "€");
            cc.registro.add(
                    "Transf. recibida de " + saldo + " € de la cuenta " + this.id + "-->Saldo " + cc.saldo + "€");
        }

    }

    @Override
    public String toString() {
        DecimalFormat formatEuros = new DecimalFormat("0.00");
        return "Número de cta: " + this.id + " Saldo: " + formatEuros.format(saldo) + " €";
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + this.id + "\n-----------------------------------");
        for (String a : registro) {
            System.out.println(a);
        }
    }
}
