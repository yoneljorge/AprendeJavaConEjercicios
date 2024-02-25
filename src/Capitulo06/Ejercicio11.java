package Capitulo06;
/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        int numSuspensos = 0;
        int numSuficiente = 0;
        int numBien = 0;
        int numNotable = 0;
        int numSobresaliente = 0;

        for (int i = 1; i <= 20; i++) {
            String notas = Notas();
            System.out.println(notas);

            switch (notas) {
                case "suspenso":
                    numSuspensos++;
                    break;
                case "suficiente":
                    numSuficiente++;
                    break;
                case "bien":
                    numBien++;
                    break;
                case "notable":
                    numNotable++;
                    break;
                case "sobresaliente":
                    numSobresaliente++;
                    break;
                default:
                    break;
            }// ?Switch
        } // ?For

        System.out.printf("\n\n%-13s: %2d\n", "Suspenso", numSuspensos);
        System.out.printf("%-13s: %2d\n", "Suficiente", numSuficiente);
        System.out.printf("%-13s: %2d\n", "Bien", numBien);
        System.out.printf("%-13s: %2d\n", "Notable", numNotable);
        System.out.printf("%-13s: %2d\n", "Sobresaliente", numSobresaliente);
    }

    public static String Notas() {
        int numRandom = (int) (Math.random() * 5 + 1);
        String notas = "";
        switch (numRandom) {
            case 1:
                notas = "suspenso";
                break;
            case 2:
                notas = "suficiente";
                break;
            case 3:
                notas = "bien";
                break;
            case 4:
                notas = "notable";
                break;
            case 5:
                notas = "sobresaliente";
                break;
            default:
                break;
        }
        return notas;
    }
}
