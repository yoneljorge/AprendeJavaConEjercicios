package Capitulo09.E02;

public class Bicicleta extends Vehiculo{
    private int iD;
    

    //*Constructor */
    public Bicicleta(int iD){
        this.iD = iD;
        setVehiculosCreados();
    }

    //*Getter y Setter */

    public int getID(){
        return iD;
    }

    //*Métodos */
    public void caballito(){
        System.out.println("Mira como hago el caballito.");
    }
}
