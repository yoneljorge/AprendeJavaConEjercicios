package Capitulo10.E19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BuscadorSinonimos {
    public static void main(String[] args) {
        HashMap<String, String> diccionarioInglesEspanol = new HashMap<String, String>() {
            {
                put("caliente", "hot");
                put("rojo", "red");
                put("ardiente", "hot");
                put("verde", "green");
                put("aguijetas", "stiff");
                put("abrasador", "hot");
                put("hierro", "iron");
                put("grande", "big");
            }
        };
        ArrayList<String> sinonimos = new ArrayList<String>();

        do {
            System.out.print("Introduce una palabra y le daré los sinónimos: ");
            String palabra = System.console().readLine();
            int i = 0;

            // *Cuando se escriba salir se termina de ejecutar el bucle */
            if (!palabra.equals("salir")) {
                // *Comprobamos de que exista en el diccionario la palabra buscada */
                if (diccionarioInglesEspanol.containsKey(palabra)) {
                    // *En caso de que exista se almacena el sinónimo de la palbra en la variable
                    // sinonimo */
                    String valorPalabra = diccionarioInglesEspanol.get(palabra);
                    // *Se compara el valor de cada elemento del diccionario con el valor de la
                    // palabra buscada */
                    for (Map.Entry<String, String> elementoDiccionario : diccionarioInglesEspanol.entrySet()) {
                        // *En caso de que exista se agrega la key a la lista de sinonimos */
                        if (elementoDiccionario.getValue().equals(valorPalabra)) {
                            if (!elementoDiccionario.getKey().equals(palabra)) {
                                sinonimos.add(elementoDiccionario.getKey());
                                i++;
                            }

                        }

                    }

                    //*En caso de que hallan sinónimos se imprimen */
                    if (i > 0) {
                        System.out.printf("Sinónimos de %s: ", palabra);
                        for (String valor : sinonimos) {
                            System.out.print(valor + ", ");
                        }
                        System.out.println("");
                        sinonimos.clear();
                    } else {
                        System.out.println("No conozco sinónimos de esa palabra.");
                    }
                } else {
                    System.out.println("No conozco esa palabra.");
                }
            } else {
                break;
            }

        } while (true);
    }
}
