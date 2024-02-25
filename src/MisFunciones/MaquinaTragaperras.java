package MisFunciones;

public class MaquinaTragaperras {
    /**
     * Función que genera una figura de la máquina de tragaperras.
     * 
     * @param x entero positivo mayor e igual a 1 y menor e igual a 5.
     * @return
     */
    public static String GenerarFiguras(int x) {
        // Si se introduce un parámetro inválido se detiene el programa.
        if (x < 1 || x > 7) {
            throw new IllegalArgumentException("El valor se encuentra fuera de los límites.");
        }
        String figura = "";
        switch (x) {
            case 1 -> {
                figura = "corazón";
                break;
            }
            case 2 -> {
                figura = "diamante";
                break;
            }
            case 3 -> {
                figura = "herradura";
                break;
            }
            case 4 -> {
                figura = "campana";
                break;
            }
            case 5 -> {
                figura = "limón";
                break;
            }
        }
        return figura;
    }
}
