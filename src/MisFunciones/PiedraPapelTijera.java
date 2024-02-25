package MisFunciones;

public class PiedraPapelTijera {
    public static String GenerarPiedraPapelTijera(int x){
        String ca = "";
        switch (x) {
            case 1 -> {
                ca = "Piedra";
                break;
            }

            case 2 -> {
                ca = "Papel";
                break;
            }
            case 3 -> {
                ca = "Tijera";
                break;
            }
        }

        return ca;
    }



    public static String Jugada(int ju1, int ju2){
        String jugador1 = GenerarPiedraPapelTijera(ju1).toLowerCase();
        String jugador2 = GenerarPiedraPapelTijera(ju2).toLowerCase();
        String resultado = "";

        if (jugador1.equals(jugador2)) {
            resultado ="empate";
        } else {
            if (jugador1.equals("piedra") && jugador2.equals("papel")) {
                resultado = "jugador2";
            }
            if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
                resultado = "jugador1";
            }
            if (jugador1.equals("papel") && jugador2.equals("piedra")) {
                resultado = "jugador1";
            }
            if (jugador1.equals("papel") && jugador2.equals("tijera")) {
                resultado = "jugador2";
            }
            if (jugador1.equals("tijera") && jugador2.equals("piedra")) {
                resultado = "jugador2";
            }
            if (jugador1.equals("tijera") && jugador2.equals("papel")) {
                resultado = "jugador1";
            }
        }
        return resultado;
    }
}
