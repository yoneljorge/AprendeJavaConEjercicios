package MisFunciones;

public class Pecera {

    /**
     * Funcion que imprime una pecera con peces dentro.
     * 
     * @param alto      : alto de la pecera el cual no puede ser menor que 4.
     * @param ancho     : ancho de la perecer el cual no puede ser menor que 4.
     * @param cantPeces : es la cantidad máxima de peces que se van a poner en la
     *                  pecera.
     */
    public static void Generar(int alto, int ancho, int cantPeces) {
        if (alto < 4) {
            throw new IllegalArgumentException("Alto no se encuentra en los límites.");
        }
        if (ancho < 4) {
            throw new IllegalArgumentException("Ancho no se encuentra en los límites.");
        }
        if (cantPeces < 1) {
            throw new IllegalArgumentException("Cantidad no se encuentra en los límites.");
        }

        for (int al = 1; al <= alto; al++) {
            for (int an = 1; an <= ancho; an++) {
                if (al == 1 || al == alto || an == 1 || an == ancho) {
                    System.out.print("* ");
                } else {
                    // Mientras no se halla superado la cantidad máxima de pecese se siguen
                    // generando peces al azar.
                    if (cantPeces > 0) {
                        // Para poner el pez de forma aleatoria se genera un número del 1 al 4 y si el
                        // número generado es 1 entonces se pone el pez
                        boolean pez = String.valueOf(Aleatorio.NumeroRandom(1, 4)).equals("1");
                        if (pez) {
                            cantPeces--;
                            System.out.print("& ");
                        } else {
                            System.out.print("  ");
                        }
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.println("");// ?Salto de línea
        }
    }
}
