package Capitulo06;

import MisFunciones.Aleatorio;

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio21GeneraMonedas {

    /**
     * Función que genera de forma aleatoria la cara o la cruz de una moneda.
     * 
     * @return <code>caraocruz</code> devuelve una de las caras de la moneda.
     */
    public static String CaraoCruz() {
        String caraocruz = "";
        if (Aleatorio.NumeroRandom(1, 2) == 1) {
            caraocruz = "cara";
        } else {
            caraocruz = "cruz";
        }
        return caraocruz;
    }

    /**
     * Función que genera de forma aleatoria una moneda junto con su cara.
     * 
     * @return
     */
    public static String GeneraModeda() {
        int monedaInt = Aleatorio.NumeroRandom(1, 8);
        String monedaCadena = "";
        switch (monedaInt) {
            case 1 -> {
                monedaCadena = "1 céntimo";
            }
            case 2 -> {
                monedaCadena = "2 céntimos";
            }
            case 3 -> {
                monedaCadena = "5 céntimos";
            }
            case 4 -> {
                monedaCadena = "10 céntimos";
            }
            case 5 -> {
                monedaCadena = "20 céntimos";
            }
            case 6 -> {
                monedaCadena = "50 céntimos";
            }
            case 7 -> {
                monedaCadena = "1 euro";
            }
            case 8 -> {
                monedaCadena = "2 euross";
            }
        }
        return monedaCadena;
    }

    public static void main(String[] args) {
        String moneda1 = GeneraModeda();

        // *Generar moneda2 */
        String moneda2 = "";
        do {
            moneda2 = GeneraModeda();
            if (!moneda2.equals(moneda1)) {
                break;
            }
        } while (true);

        // *Generar moneda3 */
        String moneda3 = "";
        do {
            moneda3 = GeneraModeda();
            if (!moneda3.equals(moneda2) && !moneda3.equals(moneda1)) {
                break;
            }
        } while (true);

        // *Generar moneda4 */
        String moneda4 = "";
        do {
            moneda4 = GeneraModeda();
            if (!moneda4.equals(moneda3) && !moneda4.equals(moneda2) && !moneda4.equals(moneda1)) {
                break;
            }
        } while (true);

        // *Generar moneda5 */
        String moneda5 = "";
        do {
            moneda5 = GeneraModeda();
            if (!moneda5.equals(moneda4) && !moneda5.equals(moneda3) && !moneda5.equals(moneda2) && !moneda5.equals(moneda1)) {
                break;
            }
        } while (true);
        
        //* Imprimiendo las monedas */
        System.out.printf("%-12s - %s\n",moneda1,CaraoCruz());
        System.out.printf("%-12s - %s\n",moneda2,CaraoCruz());
        System.out.printf("%-12s - %s\n",moneda3,CaraoCruz());
        System.out.printf("%-12s - %s\n",moneda4,CaraoCruz());
        System.out.printf("%-12s - %s\n",moneda5,CaraoCruz());
        
    }
}
