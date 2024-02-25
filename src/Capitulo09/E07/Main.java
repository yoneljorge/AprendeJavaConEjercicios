package Capitulo09.E07;

public class Main {
    public static void main(String[] args) {
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        boolean salir = false;
        do {
            // *Menu */
            System.out.println("*******************************************");
            System.out.println("1. Mostrar número de entradas libres." +
                    "\n2. Vender entradas." +
                    "\n3. Salir");
            System.out.print("Seleccione una opción(1-3): ");
            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("*******************************************");
                    System.out.println("Entradas sala principal: " + salaPrincipal);
                    System.out.println("Entradas sala principal: " + compraVenta);
                    System.out.println("Entradas sala principal: " + vip);
                    break;
                }
                case 2 -> {
                    System.out.println("*******************************************");
                    System.out.println("Zonas: " +
                            "\n1. Sala principal." +
                            "\n2. Compra venta." +
                            "\n3. VIP.");
                    System.out.println("Para que zona desea la entrada (1-3): ");
                    int zona = Integer.parseInt(System.console().readLine());
                    System.out.print("Qué cantidad de entradas desea: ");
                    int cantidadEntradas = Integer.parseInt(System.console().readLine());
                    switch (zona) {
                        case 1 -> {
                            salaPrincipal.vender(cantidadEntradas);
                        }
                        case 2 -> {
                            compraVenta.vender(cantidadEntradas);
                        }
                        case 3 -> {
                            vip.vender(cantidadEntradas);
                        }

                    }

                }
                case 3 -> {
                    salir = true;
                    break;
                }

                default -> {
                    System.out.println("No se encuentra la selección");
                    break;
                }
            }

        } while (!salir);
    }
}
