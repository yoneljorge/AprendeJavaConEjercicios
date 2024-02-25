package Capitulo05;

/**
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
 * números
 * largos.
 * Ejemplo 1:
 * Introduzca un número entero: 67706
 * Dígitos que aparecen en el número: 0 6 7
 * Dígitos que no aparecen: 1 2 3 4 5 8 9
 * Ejemplo 2:
 * Introduzca un número entero: 555
 * Dígitos que aparecen en el número: 5
 * Dígitos que no aparecen: 1 2 3 4 6 7 8 9
 * Ejemplo 3:
 * Introduzca un número entero: 9876543210
 * Dígitos que aparecen en el número: 0 1 2 3 4 5 6 7 8 9
 * Dígitos que no aparecen:
 * Ejemplo 4:
 * Introduzca un número entero: 13247721
 * Dígitos que aparecen en el número: 1 2 3 4 7
 * Dígitos que no aparecen: 0 5 6 8 9
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio48 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        long numero = Long.parseLong(System.console().readLine());

        String apareceString = ""; // ->Cadena en la cual vamos a agregar los números que aparecen
        String noApareceString = ""; // ->Cadena en la cual vamos a agregar los números que no aparecen

        /**
         * Declaro todos los nombres de los número como boolean para luego agregarlos a
         * las cadenas
         */
        boolean cero = false, uno = false, dos = false, tres = false, cuatro = false,
                cinco = false, seis = false, siete = false, ocho = false, nueve = false;

        while (numero > 0) {
            long d = numero % 10;
            /**
             * Primero con el for vamos iterando desde el cero hasta el 9 y con cada if
             * vamos comprobando de que ese número se encuentre en la cadena y de ser así lo
             * evaluamos como verdadero.
             */

            if (d == 0) {
                cero = true;
            }
            if (d == 1) {
                uno = true;
            }
            if (d == 2) {
                dos = true;
            }
            if (d == 3) {
                tres = true;
            }
            if (d == 4) {
                cuatro = true;
            }
            if (d == 5) {
                cinco = true;
            }
            if (d == 6) {
                seis = true;
            }
            if (d == 7) {
                siete = true;
            }
            if (d == 8) {
                ocho = true;
            }
            if (d == 9) {
                nueve = true;
            }

            numero /= 10;
        } // while

        /**
         * Se agrega el número a encontrado en caso de que se halla encontrado en caso
         * contrario no se agrega.
         */
        if (cero) {
            apareceString = apareceString + " 0";
        } else {
            noApareceString = noApareceString + " 0";
        }

        if (uno) {
            apareceString = apareceString + " 1";
        } else {
            noApareceString = noApareceString + " 1";
        }

        if (dos) {
            apareceString = apareceString + " 2";
        } else {
            noApareceString = noApareceString + " 2";
        }

        if (tres) {
            apareceString = apareceString + " 3";
        } else {
            noApareceString = noApareceString + " 3";
        }

        if (cuatro) {
            apareceString = apareceString + " 4";
        } else {
            noApareceString = noApareceString + " 4";
        }

        if (cinco) {
            apareceString = apareceString + " 5";
        } else {
            noApareceString = noApareceString + " 5";
        }

        if (seis) {
            apareceString = apareceString + " 6";
        } else {
            noApareceString = noApareceString + " 6";
        }

        if (siete) {
            apareceString = apareceString + " 7";
        } else {
            noApareceString = noApareceString + " 7";
        }

        if (ocho) {
            apareceString = apareceString + " 8";
        } else {
            noApareceString = noApareceString + " 8";
        }

        if (nueve) {
            apareceString = apareceString + " 9";
        } else {
            noApareceString = noApareceString + " 9";
        }

        System.out.println("Dígitos que aparecen en el número: " + apareceString);
        System.out.println("Dígitos que no aparecen: " + noApareceString);

    }
}
