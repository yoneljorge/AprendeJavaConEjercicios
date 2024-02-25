package Capitulo08;

import MisFunciones.Matematica;

public class Ejercicio17 {
    public static void main(String[] args) {
        long decimal = 0;
        System.out.print("Introduzca un número binario: ");
        
        long binario = Long.parseLong(System.console().readLine());
        int bits = Matematica.digitos(binario);
        for (int i = 0; i < bits; i++) {
            decimal += Matematica.digitoN(binario, bits - i - 1) * Matematica.potencia(2, i);
        }
        System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
}
