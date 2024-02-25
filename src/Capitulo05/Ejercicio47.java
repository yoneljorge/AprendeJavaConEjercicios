package Capitulo05;

/**
 * Ejercicio 47
Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.
Ejemplo 1:
Por favor, introduzca la altura (número impar mayor o igual a 5): 8
La altura introducida no es correcta
Ejemplo 2:
Por favor, introduzca la altura (número impar mayor o igual a 5): 3
La altura introducida no es correcta
Ejemplo 3:
Por favor, introduzca la altura (número impar mayor o igual a 5): 5

 */

/**
 * @author Yonel J. Sánchez
 */

public class Ejercicio47 {
    public static void main(String[] args) {
        int alturaIntro = 0;
        //Para comrpobar que se introduzca la altura correctamente
        do {
            System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
            alturaIntro = Integer.parseInt(System.console().readLine());

            if (alturaIntro < 5 || alturaIntro % 2 == 0) {
                System.out.println("La altura debe de ser un número impar mayor o igual a 5.");
                continue;
            }
            else{
                break;
            }
        } while (true);

        int altura =1;

        while (altura <=alturaIntro) {
            for(int i =1; i <= alturaIntro; i ++){
                if(i ==1 || i ==alturaIntro || altura ==1 || altura == alturaIntro/2 +1 || altura == alturaIntro){
                    System.out.print("M");
                }
                else{
                    System.out.print(" ");
                }
            }
            altura++;
            System.out.println("");
        }
    }
}
