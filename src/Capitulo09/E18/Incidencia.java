package Capitulo09.E18;

public class Incidencia {
    // *Atributos de instancia */
    private int id;
    private boolean pendiente;
    private int puesto;
    private String incidencia;
    private String solucion;

    // *Atributos de clase */
    private static int pendientes;
    private static int resueltas;
    private static int total = 0;

    // *Constructor */
    public Incidencia(int puesto, String incidencia) {
        total++;
        pendientes ++;
        this.id = total;
        this.pendiente = true;
        this.puesto = puesto;
        this.incidencia = incidencia;
    }

    //*Métodos */
    public void resuelve(String solucion){
        this.pendiente = false;
        this.solucion = solucion;
        pendientes --;
        resueltas ++;
    }

    @Override
    public String toString(){
        String imprimir = "";
        if(pendiente){
            imprimir ="Incidencia " + this.id + " - " + "Puesto: " + this.puesto + " - " + this.incidencia + " - Pendiente";
        }else{
            imprimir = "Incidencia " + this.id + " - " + "Puesto: " + this.puesto + " - " + this.incidencia + " - Resuelta - " + this.solucion;
        }

        return imprimir;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public static int getResueltas() {
        return resueltas;
    }

    
}
