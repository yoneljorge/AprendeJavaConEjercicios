package Capitulo05;
/** 
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
Ejemplo:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*/

/**
 * @author Yonel J. Sánchez
 */
public class Ejercicio30CalcularHora {
    public static void main(String[] args) {
        System.out.println("Por favor introduzca la primera hora");
        String diaPrimero = LeerDia();
        int horaPrimera = LeerHora();

        System.out.println("Por favor introduzca la segunda hora");
        String diaSegundo = "";
        do {
            diaSegundo = LeerDia();
        } while (!ComprobarDia(diaPrimero, diaSegundo));
        int horaSeunda = LeerHora();

        int cantHoras = (24 - horaPrimera) + horaSeunda;
        
        System.out.println("Entre las " + horaPrimera + ":00h del " + diaPrimero + " y las " + horaSeunda + ":00h del " + diaSegundo + " hay " + cantHoras + " horas/s.");
    }

    /*
     * Función con la cual vamos a leer y comprobar que se introduzca un día de la
     * semana entre lunes y domingo
     */
    public static String LeerDia() {
        String dia = "";
        do {
            System.out.print("Día: ");
            dia = (System.console().readLine()).toLowerCase(); // ->Obtiene la cadena del dia y la convierte a
                                                               // minúsculas
            // Comprobamos que se introduzca un día de la semana
            if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles")
                    || dia.equals("jueves") || dia.equals("viernes") || dia.equals("sabado")
                    || dia.equals("domingo")) {
                break;
            } else {
                System.out.println(dia + "-> no es un día de la semana");
                continue;
            }
        } while (true);

        return dia;
    }

    public static int LeerHora() {
        int hora = 0;
        do {
            System.out.print("Hora: ");
            hora = Integer.parseInt(System.console().readLine());

            if (hora >= 0 && hora <= 23) {
                break;
            } else {
                System.out.println("Introduzca una hora entre 0 y 23");
                continue;
            }
        } while (true);

        return hora;
    }

    /*
     * Comprobamos que el día uno y el día dos sean diferentes, además de comprobar
     * de que el día uno se encuentre antes del día dos.
     */
    public static boolean ComprobarDia(String diaUno, String diaDos) {
        boolean comprobar = false;
        int diaUnoInt = 0;
        int diaDosInt = 0;
        // Convertimos el día uno a un entero para hacer más fácil la comprobación
        switch (diaUno) {
            case "lunes":
                diaUnoInt = 1;
                break;

            case "martes":
                diaUnoInt = 2;
                break;

            case "miercoles":
                diaUnoInt = 3;
                break;

            case "jueves":
                diaUnoInt = 4;
                break;

            case "viernes":
                diaUnoInt = 5;
                break;

            case "sabado":
                diaUnoInt = 6;
                break;

            case "domingo":
                diaUnoInt = 7;
                break;

            default:
                break;
        }

        // Convertimos el día uno a un entero para hacer más fácil la comprobación
        switch (diaDos) {
            case "lunes":
                diaDosInt = 1;
                break;

            case "martes":
                diaDosInt = 2;
                break;

            case "miercoles":
                diaDosInt = 3;
                break;

            case "jueves":
                diaDosInt = 4;
                break;

            case "viernes":
                diaDosInt = 5;
                break;

            case "sabado":
                diaDosInt = 6;
                break;

            case "domingo":
                diaDosInt = 7;
                break;

            default:
                break;
        }

        if (diaUnoInt != diaDosInt) {
            if (diaDosInt - 1 == diaUnoInt) {
                comprobar = true;
            } else if (diaUnoInt == 7 && diaDosInt == 1) {
                comprobar = true;
            } else {
                System.out.println("Introduzca un día posterior al día uno");
                comprobar = false;
            }

        } else {
            System.out.println("Los días no pueden ser iguales");
            comprobar = false;
        }

        return comprobar;
    }
}
