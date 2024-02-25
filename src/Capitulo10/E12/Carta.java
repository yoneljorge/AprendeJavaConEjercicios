package Capitulo10.E12;

import java.util.Objects;

import MisFunciones.Aleatorio;

public class Carta implements Comparable<Carta>{
    private static String[] n = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey" };
    private static String[] p = { "bastos", "copas", "espadas", "oros" };

    private String numero;
    private String palo;

    public Carta() {
        this.numero = n[Aleatorio.NumeroRandom(0, 9)];
        this.palo = p[Aleatorio.NumeroRandom(0, 3)];
    }

    private Integer getValorNumero() {
        int i = 0;
        while (i < n.length) {
            if (n[i].equals(numero)) {
                break;
            }
            i++;
        }
        return (i + 1);
    }

    public String getNumero() {
        return this.numero;
    }

    public String getPalo() {
        return this.palo;
    }

    @Override
    public String toString() {
        return this.numero + " de " + this.palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Carta other) {
        int orden = 0;
        orden = (this.palo).compareTo(other.getPalo());
        if (this.palo == other.palo) {
            orden = (this.getValorNumero()).compareTo(other.getValorNumero());
        }
        return orden;
    }

    public int getValor(){
        switch (this.numero) {
            case "as" ->{
                return 11;
            }
            case "tre" ->{
                return 10;
            }
            case "sota" ->{
                return 2;
            }
            case "caballo" ->{
                return 3;
            }
            case "rey" ->{
                return 4;
            }
            default ->{
                return 0;
            }
        }
    }
}
