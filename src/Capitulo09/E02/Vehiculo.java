package Capitulo09.E02;

public class Vehiculo {
    // *Atributos de clase */
    private static int vehiculosCreados;
    private static int kilometrosTotales;

    // *Atributos de instancia */
    private int kilometrosRecorridos;

    // *Getters */
    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    // *Setters */
    public void setVehiculosCreados() {
        vehiculosCreados += 1;
    }

    //*Métodos */
    public void recorrer(int km){
        kilometrosTotales += km;
        kilometrosRecorridos += km;
    }
}
