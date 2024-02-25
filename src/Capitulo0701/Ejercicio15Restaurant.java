package Capitulo0701;

import MisFunciones.Aleatorio;

/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 * como máximo e intente de nuevo”. Para el grupo que llega, se busca
 * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
 * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se
 * sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 * programa se ilustra a continuación:
 */
public class Ejercicio15Restaurant {
    public static void main(String[] args) {
        // *Generar las persnoas de las mesas. */
        int[] mesas = new int[10];
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = Aleatorio.NumeroRandom(0, 4);
        }
        //*Bucle en el que se van llenando las mesas */
        do {
            Estado(mesas);
            System.out.print("¿Cuantos son? (Introduzca -1 para salir del programa): ");
            int cantComensales = Integer.parseInt(System.console().readLine());
            if(cantComensales < 0){
                break;
            }
            BuscarMesa(cantComensales, mesas);
        } while (true);
    }

    public static void Estado(int[] lista) {
        // Muestra el estado de ocupación de las mesas
        System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.print("│Mesa nº: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("│ %2d ", i);
        }

        System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("│Ocupación");
        for (int m : lista) {
            System.out.printf("│ %2d ", m);
        }
        System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    public static void BuscarMesa(int cantComensales, int[] lista) {
        int mesa = 0;
        boolean compartir = false;
        if (cantComensales > 4) {
            System.out.printf(
                    "Lo siento, no admitimos grupos de %d, haga grupos de \n4 personas como máximo e intente de nuevo.\n",
                    cantComensales);
        } else {
            //*Buscamos la cantidad de espacios que hacen falta */
            int cantPersMinMesa = 4 - cantComensales;

            //*Buscamos una mesa vacía */
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] == 0) {
                    mesa = 1 + i;
                    lista[i] += cantComensales;
                    break;
                }
            } // End For

            //*Si no se ha encontrado una mesa vacía se busca una en la que quepan */
            if (mesa == 0) {
                for (int i = 0; i < lista.length; i++) {
                    if (lista[i] <= cantPersMinMesa) {
                        mesa = i + 1;
                        compartir = true;
                        lista[i] += cantComensales;
                        break;
                    } // End IF
                } // End For
            }
        } // End ELSE

        //*Mostrar el mensaje */
        if(mesa == 0){
            System.out.println("Lo siento en estos momentos no queda sitio.");
        } else if(compartir){
            System.out.println("Tendrá que compartir mesa. Por favor, siéntese en la mesa número " + mesa + ".");
        }else{
            System.out.println("Por favor, siéntese en la mesa número " + mesa + ".");
        }
    }
}
