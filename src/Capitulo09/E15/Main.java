package Capitulo09.E15;

import MisFunciones.Aleatorio;

public class Main {
    public static void main(String[] args) {
        // *Generamos las 8 fichas aleatorias */
        FichaDomino[] listaFichas = new FichaDomino[8];
        for (int i = 0; i < 8; i++) {
            int lado1 = Aleatorio.NumeroRandom(0, 6);
            int lado2 = Aleatorio.NumeroRandom(1, 6);
            listaFichas[i] = new FichaDomino(lado1, lado2);
        }

        // *Imprimiendo el array original */
        System.out.println("Array original");
        imprimir(listaFichas);

        // *Encajamos las fichas */
        for (int i = 0; i < 7; i++) {
            int j = i + 1;
            boolean bandera = false;
            while (j < 8 && !bandera) {
                if (listaFichas[i].encaja(listaFichas[j])) {
                    if (listaFichas[i].getLado2() == listaFichas[j].getLado1()) {
                        bandera = true;
                        FichaDomino aux = listaFichas[i + 1];
                        listaFichas[i + 1] = listaFichas[j];
                        listaFichas[j] = aux;
                        imprimir(listaFichas);
                    } else {
                        listaFichas[j] = listaFichas[j].voltea();
                        if (listaFichas[i].getLado2() == listaFichas[j].getLado1()) {
                            bandera = true;
                            FichaDomino aux = listaFichas[i + 1];
                            listaFichas[i + 1] = listaFichas[j];
                            listaFichas[j] = aux;
                            imprimir(listaFichas);
                        }
                    }
                }
                if (listaFichas[0].encaja(listaFichas[j])) {
                    if (listaFichas[0].getLado1() == listaFichas[j].getLado2()) {
                        correrUnaFicha(listaFichas);
                        imprimir(listaFichas);
                        bandera = true;
                        if (j + 1 != listaFichas.length) {
                            FichaDomino aux = listaFichas[0];
                            listaFichas[0] = listaFichas[j + 1];
                            listaFichas[j + 1] = aux;
                            imprimir(listaFichas);
                        }

                    } else {
                        listaFichas[j] = listaFichas[j].voltea();
                        if (listaFichas[0].getLado1() == listaFichas[j].getLado2()) {
                            correrUnaFicha(listaFichas);
                            imprimir(listaFichas);
                            bandera = true;
                            if (j + 1 != listaFichas.length) {
                                FichaDomino aux = listaFichas[0];
                                listaFichas[0] = listaFichas[j + 1];
                                listaFichas[j + 1] = aux;
                                imprimir(listaFichas);
                            }
                        }
                    }
                }
                j++;
            } // End While
        } // End For

        // *Imprimiendo el resultado */
        System.out.println("Resultados");
        imprimir(listaFichas);

    }

    public static FichaDomino[] correrUnaFicha(FichaDomino[] lista) {

        FichaDomino ultimoValor = lista[lista.length - 1];
        FichaDomino aux = lista[0];
        for (int i = 0; i < lista.length - 1; i++) {
            FichaDomino aux2 = lista[i + 1];
            lista[i + 1] = aux;
            aux = aux2;
        }
        lista[0] = ultimoValor;
        return lista;
    }

    public static void imprimir(FichaDomino[] lista) {
        for (int i = 0; i < 8; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
    }

}
