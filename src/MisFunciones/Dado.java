package MisFunciones;

public class Dado {

    /**
     * Funcion que al introducirle un número del 1 al 6 genera la cara de un dado de
     * poker.
     * 
     * @param x : entero positivo entre 1 y 6.
     * @return <code>tirada</code> retorna la cara del dado de poker.
     */
    public static String Tirar(int x) {
        String tirada = "";
        switch (x) {
            case 1 -> {
                tirada = "As";
                break;
            }
            case 2 -> {
                tirada = "K";
                break;
            }
            case 3 -> {
                tirada = "Q";
                break;
            }
            case 4 -> {
                tirada = "J";
                break;
            }
            case 5 -> {
                tirada = "7";
                break;
            }
            case 6 -> {
                tirada = "8";
                break;
            }

        }
        return tirada;
    }
}
