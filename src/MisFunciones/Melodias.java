package MisFunciones;

public class Melodias {

    /**
     * Función que genera las notas musicales "do, re, mi, fa, sol, la, si" en
     * dependencia del valor que se le pase del 1 al 7 en ese orden.
     * 
     * @param x entero positivo mayor que 1.
     * @return <code>nota:</code> do, re, mi, fa, sol, la, si.
     */
    public static String GenerarNota(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("El valor de x tiene que ser mayor igual a 1.");
        }
        String nota = "";
        switch (x) {
            case 1 -> {
                nota = "do";
                break;
            }
            case 2 -> {
                nota = "re";
                break;
            }
            case 3 -> {
                nota = "mi";
                break;
            }
            case 4 -> {
                nota = "fa";
                break;
            }
            case 5 -> {
                nota = "sol";
                break;
            }
            case 6 -> {
                nota = "la";
                break;
            }
            case 7 -> {
                nota = "si";
                break;
            }
        }

        return nota;
    }

    /**
     * Función que genera una melodia a partir de la cantidad de notas que se desee,
     * recordando siempre que la cantidad de notas tiene que ser mayor e igual a 4,
     * menor e igual a 28 y ser múltiplo de 4.
     * 
     * @param x entero positivo mayor e igual a 1 y menor e igual a 7.
     */

    public static String GenerarMelodia(int x) {
        // ! Verificamos que no se pase un valor menor que 1 y mayor que 7 porque sino
        // ! genera un error el programa.
        if (x < 1 && x > 7) {
            throw new IllegalArgumentException("El valor de x tiene que estar entre 1 y 7.");
        }
        // Como la cantidad de notas de una melodia es un múltiplo de 4 entonces se
        // multiplica por 4.
        int cantNotas = x * 4;
        //La última nota tiene que ser igual a la primera.
        String primeraNota = "";
        //Cadena donde almacenamos la melodía.
        String melodia ="";

        for (int i = 1; i <= cantNotas; i++) {
            String nota = Melodias.GenerarNota(Aleatorio.NumeroRandom(1, 7));
            if (i == 1) {
                primeraNota = nota;
            }
            if (i == cantNotas) {
                System.out.print(primeraNota + " ");
                melodia = melodia + "||";
            } else if (i % 4 == 0) {
                melodia = melodia + nota + " " + "| ";
            } else {
                melodia = melodia + nota + " ";
            }//End If
        }//End For
        return melodia;
    }//End Funcion.
}
