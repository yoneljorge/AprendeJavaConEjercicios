package Capitulo05;

/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
*/
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());

        String numeroCadena = String.valueOf(numero);
        String digitoCadena = String.valueOf(digito);

        boolean encontrdo = false;
        String posiciones = "";

        for (int i = 0, aux = 1, contador = 0; i < numeroCadena.length(); i++, aux++) {
            // ->En caso de que valla hallando las posiciones de los dígitos
            // se va almacenando en la cadena "posiciones" y encontrdo se hace verdadero
            if (digitoCadena.equals(numeroCadena.substring(i, aux))) {
                if(contador >= 1){
                    posiciones = posiciones + ",";
                }
                posiciones = posiciones + String.valueOf(aux);
                encontrdo = true;
                contador ++;
                
            }
        }
        if (encontrdo) {
            if (posiciones.length() > 1) {
                // Si posiciones es mayor que 1 entonces se crea el arreglo "posicionesArray"
                String[] posicionesArray = posiciones.split(",");
                System.out.print("El dígito " + digito + " se encuentra en las posiciones ");
                // Con un bucle for vamos iterando de forma tal que vamos imprimiendo las
                // posiciones
                for (int i = 0; i < posicionesArray.length; i++) {
                    if (i == posicionesArray.length - 1) {
                        // Aquí imprimimos antes de la última posición "y"
                        System.out.print(" y " + posicionesArray[i] + ".");
                    } else {
                        // Antes de la penultima posición
                        System.out.print(posicionesArray[i]);
                        if (i != posicionesArray.length - 2) {
                            System.out.print(", ");
                        }
                    }

                }
            } else {
                System.out.println("El dígito " + digito + " se encuentra en la posición " + posiciones + ".");
            }
        } else {
            System.out.println("El dígito " + digito + " no se ha encontrado");
        }
    }
}
