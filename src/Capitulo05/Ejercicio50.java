package Capitulo05;

/**
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.
 */
/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        //Verificamos que se introduzca como altura un número mayor que 5.
        int alturaIntro = 0;
        do {
            System.out.print("Introduzca la altura (5 como mínimo): ");
            alturaIntro = Integer.parseInt(System.console().readLine());
            if (alturaIntro < 5) {
                System.out.println("La altura tiene que ser mayor que 5.");
                continue;
            } else {
                break;
            }
        } while (true);

        //Verificamos que se introduzca como espacio un número mayor que 1.
        int espacios = 0;
        do {
            System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
            espacios = Integer.parseInt(System.console().readLine());
            if (alturaIntro < 5) {
                System.out.println("La altura tiene que ser mayor que 5.");
                continue;
            } else {
                break;
            }
        } while (true);

        

        int altura = 1;
        int asteriscos = 4;
        while (altura <= alturaIntro) {

            System.out.print("*");

            // Imprimimos la cantidad de espacios entre el 1 y el 5
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // Imprimimos los astericos del PRIMER 5///////////////
            for (int i = 1; i <= 4; i++) {
                if (asteriscos == 1) {
                    if (altura == 2) {
                        if (i == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (i == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                } else {
                    System.out.print("*");
                }

            }

            // Imprimimos la cantidad de espacios entre los dos 5
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // Imprimimos los astericos del SEGUNDO 5///////////////
            for (int i = 1; i <= 4; i++) {
                if (asteriscos == 1) {
                    if (altura == 2) {
                        if (i == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (i == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                } else {
                    System.out.print("*");
                }

            }

            // Con este if igualamos los asteriscos a 4
            if (altura == 2 || altura == alturaIntro - 1) {
                asteriscos = 4;
            } else {
                asteriscos = 1;
            }

            System.out.println("");// ->Para comenzar en una nueva línea
            altura++;
        }
    }
}
