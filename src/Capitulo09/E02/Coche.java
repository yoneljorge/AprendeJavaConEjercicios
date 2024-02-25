package Capitulo09.E02;

public class Coche extends Vehiculo{
    //*Atributos */
    private String chapa;

    //*Constructor */
    public Coche(String chapa){
        this.chapa = chapa;
        setVehiculosCreados();
    }

    //*Getters */

    public String getChapa(){
        return chapa;
    }

    //*Métodos */
    
    public void quemaRueda(){
        System.out.println("Mira como quemo rueda.");
    }
    
}   
