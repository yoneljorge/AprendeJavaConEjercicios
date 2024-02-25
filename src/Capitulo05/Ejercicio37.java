package Capitulo05;

public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numIntro = Long.parseLong(System.console().readLine());
        long numero = numIntro;

        long numReves = 0;
        String numRevesString = "";
        int digito = 0;

        while (numero >= 1) {
            numRevesString = numRevesString + String.valueOf(numero % 10);
            numero /=10;
        }
        numReves = Long.parseLong(numRevesString);

        System.out.print("El " + numIntro + " en decimal es el ");
        while (numReves >= 1) {
            digito = (int) numReves % 10;
            numReves /= 10;

            for (int i = 1; i <= digito; i++) {
                System.out.print(" |");
            }
            if (numReves != 0) {
                System.out.print(" - ");
            }
        }
        System.out.print(" en el sistema de palotes.");

        System.exit(0);
    }
}
