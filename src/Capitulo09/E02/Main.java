package Capitulo09.E02;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        Bicicleta bici = new Bicicleta(458);
        Coche miCarrito = new Coche("U4572");

        do {
            menu();
            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1 ->{
                    System.out.print("Qué distancia quieres que ande: ");
                    bici.recorrer(Integer.parseInt(System.console().readLine()));
                    break;
                }
                case 2 ->{
                    bici.caballito();
                    break;
                }
                case 3 ->{
                    System.out.print("Qué distancia quieres que ande: ");
                    miCarrito.recorrer(Integer.parseInt(System.console().readLine()));
                    break;
                }
                case 4 ->{
                    miCarrito.quemaRueda();
                    break;
                }
                case 5 ->{
                    System.out.println(bici.getKilometrosRecorridos());
                    break;
                }
                case 6 ->{
                    System.out.println(miCarrito.getKilometrosRecorridos());
                    break;
                }
                case 7 ->{
                    System.out.println(miCarrito.getKilometrosTotales());
                    break;
                }
                case 8 ->{
                    System.out.println(miCarrito.getVehiculosCreados());;
                    break;
                }
                case 9 ->{
                    salir =true;
                    break;
                }
                
            }
        } while (!salir);
    }

    private static void menu(){
        System.out.println("VEHÍCULOS" + 
                         "\n=========" + 
                         "\n1. Anda con la bicicleta."+
                         "\n2. Haz el caballito con la bicicleta."+
                         "\n3. Anda con el cohe."+
                         "\n4. Quema rueda con el cohe."+
                         "\n5. Ver kilometraje de la bicicleta."+
                         "\n6. Ver kilometraje del coche."+
                         "\n7. Ver kilometraje total."+
                         "\n8. Ver cuantos vehiculos se han creado" +
                         "\n9. Salir."+
                         "\nElije una opción (1-8)");

    }
}
