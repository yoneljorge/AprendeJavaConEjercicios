package Capitulo05;

/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 * Ejemplo:
 * Por favor, vaya introduciendo números enteros positivos. Para terminar,
 * introduzca un número primo:
 * 6
 * 8
 * 15
 * 12
 * 23
 * Ha introducido 4 números no primos.
 * Máximo: 15
 * Mínimo: 6
 * Media: 10.25
 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio49 {
    public static void main(String[] args) {
        System.out.println(
                "Por favor, vaya introduciendo números enteros positivos. \nPara terminar, introduzca un número primo: ");
        int numero = 0;
        int cantNoPrimos = 0; // ->Acumula la cantidad de número no prios.
        
        String numeroString = "";// Cadena en la cual vamos a ir almacenando los números para

        /**
         * Aquí vamos recogiendo los número que introduce el usuario y almacenando en la
         * cadena y cuando introduzca un número primo se termina.
         */
        boolean salir = false; // Bandera con la cual vamos a salir
        do {
            boolean isPrimo = true;
            numero = Integer.parseInt(System.console().readLine());
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                } 
            }
            if(!isPrimo){
                cantNoPrimos++;
                numeroString = numeroString + numero + ",";
            }
            else{
                salir = true;
            }
        } while (!salir);

        // Pasamos el arreglo de cadena a int
        String[] numeroStringArray = numeroString.split(",");

        int minimo = Integer.parseInt(numeroStringArray[0]);
        int maximo = 0;
        double media = 0;
        for (int i = 0; i < numeroStringArray.length; i++) {
            if (Integer.parseInt(numeroStringArray[i]) < minimo) {
                minimo = Integer.parseInt(numeroStringArray[i]);
            }
            if (Integer.parseInt(numeroStringArray[i]) > maximo) {
                maximo = Integer.parseInt(numeroStringArray[i]);
            }
            media += Integer.parseInt(numeroStringArray[i]);
        }

        System.out.println("Ha introducido " + cantNoPrimos + " números no primos.");
        System.out.println("Maximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media / cantNoPrimos);
    }
}
