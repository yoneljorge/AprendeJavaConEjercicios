package Test;
public class OrdenamientoPorSeleccion {
    public static void main(String[] args) {
        System.out.println("Ingresa 7 números");
        int[] elemento = new int[7];
        for(int i =0; i < elemento.length; i ++){
            elemento[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Ingresa el número a buscar");
        int numBuscar = Integer.parseInt(System.console().readLine());

        int n = elemento.length, inf = 0, centro = 0;
        int sup = n - 1;
        boolean bandera = false;

        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (elemento[centro] == numBuscar) {
                bandera = true;
                break;
            } else if (numBuscar < elemento[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        
        if(bandera == true){
            System.out.println("Encontre el número en la posición: " + centro);
        }
        else{
            System.out.println("No encontre el número");
        }
    }
}
