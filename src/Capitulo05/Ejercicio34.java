package Capitulo05;
/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97

Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379
 */

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.print("Por favor introduzca un número: ");
        long numeroUno = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca otro número: ");
        long numeroDos = Integer.parseInt(System.console().readLine());

        // Se imprimen los números impares y pares se agrega (long) antes de devolver la
        // función NumeroPar y NumeroImpar para que convierta a long el número y no se
        // quede en int evitando un error.
        System.out.println("El número formado por los dígitos pares es " + (long) NumeroPar(numeroUno, numeroDos));
        System.out.println("El número formado por los dígitos impares es " + (long) NumeroImpar(numeroUno, numeroDos));
    }

    // Función con la cual vamos a extraer los dígitos pares de cada número,
    // agregarlas a una cadena de texto y devolver o retornar el número par.
    public static long NumeroPar(long numeroUno, long numeroDos) {

        String numeroCadena = "";
        /**
         * Convertimos el número en una cadena para que sea más facil extrer dígito por
         * dígito, hasta el momento no conozco otra forma, es la forma más fácil que
         * conozco hasta el momento
         */
        String numeroUnoCadena = String.valueOf(numeroUno);
        String numeroDosCadena = String.valueOf(numeroDos);
        /*
         * Con este if evitamos de que si el númeroUno tiene solo 3 dígitos y el
         * númeroDos tiene 5 dígitos el programa termine y no busque los demás dígitos
         * que tiene el númeroDos, lo cual se soluciona con el el else en el otro bloque
         * de código.
         */
        if (numeroUno > numeroDos) {
            for (int i = 0, aux = 1; i < numeroUnoCadena.length(); i++, aux++) {
                try {// ->Con este try catch evitamos cualquier error que tenga el código a la hora
                     // de extraer los dígitos y que continúe con la ejecución del código.
                    if (Integer.parseInt(numeroUnoCadena.substring(i, aux)) % 2 == 0) {
                        numeroCadena = numeroCadena + numeroUnoCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }

                try {
                    if (Integer.parseInt(numeroDosCadena.substring(i, aux)) % 2 == 0) {
                        numeroCadena = numeroCadena + numeroDosCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }
            }
        } else {
            for (int i = 0, aux = 1; i < numeroDosCadena.length(); i++, aux++) {
                try {
                    if (Integer.parseInt(numeroUnoCadena.substring(i, aux)) % 2 == 0) {
                        numeroCadena = numeroCadena + numeroUnoCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }

                try {
                    if (Integer.parseInt(numeroDosCadena.substring(i, aux)) % 2 == 0) {
                        numeroCadena = numeroCadena + numeroDosCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }
            }
        }

        return (long) Integer.parseInt(numeroCadena);
    }

    /*
     * Esta función es igual que la anterior con la diferencia de que a la hora de
     * comparar lo que hacemos es que el residuo de dividir entre dos el dígito sea
     * distinto de cero.
     */
    public static long NumeroImpar(long numeroUno, long numeroDos) {
        String numeroCadena = "";
        String numeroUnoCadena = String.valueOf(numeroUno);
        String numeroDosCadena = String.valueOf(numeroDos);

        if (numeroUno > numeroDos) {
            for (int i = 0, aux = 1; i < numeroUnoCadena.length(); i++, aux++) {
                try {
                    if (Integer.parseInt(numeroUnoCadena.substring(i, aux)) % 2 != 0) {
                        numeroCadena = numeroCadena + numeroUnoCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }

                try {
                    if (Integer.parseInt(numeroDosCadena.substring(i, aux)) % 2 != 0) {
                        numeroCadena = numeroCadena + numeroDosCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }
            }
        } else {
            for (int i = 0, aux = 1; i < numeroDosCadena.length(); i++, aux++) {
                try {
                    if (Integer.parseInt(numeroUnoCadena.substring(i, aux)) % 2 == 0) {
                        numeroCadena = numeroCadena + numeroUnoCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }

                try {
                    if (Integer.parseInt(numeroDosCadena.substring(i, aux)) % 2 == 0) {
                        numeroCadena = numeroCadena + numeroDosCadena.substring(i, aux);
                    }
                } catch (Exception e) {
                }
            }
        }

        return (long) Integer.parseInt(numeroCadena);
    }
}
