package Capitulo10.E10;

public class Main {
    public static void main(String[] args) {
        System.out.print("Introduzca la palabra a buscar: ");
        String palabra = System.console().readLine();
        Diccionario diccionario = new Diccionario(palabra);

        if(diccionario.containsKey(palabra)){
            System.out.println(diccionario);
        }else{
            System.out.println("No se encuentra la palabra en el diccionario");
        }
    }
}
