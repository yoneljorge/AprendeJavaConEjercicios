package Capitulo09.E06;

public class Tiempo {
    private int hora = 0;
    private int minutos = 0;
    private int segundos = 0;

    //*Constructor */
    public Tiempo(int h, int m, int s){
        this.hora = h;
        
        //En caso de que el usuario se equivoque y pase mas minutos de la cuenta.
        this.segundos = this.segundos + s;
        if(this.segundos > 59){
            this.minutos = this.minutos + this.segundos / 60;
            this.segundos = this.segundos % 60; ;
        }else{
            this.segundos = s;
        }

        //Sumamos los minutos
        this.minutos = this.minutos + m;
        if(this.minutos > 59){
            this.hora = this.hora + this.minutos / 60;
            this.minutos = this.minutos % 60; ;
        }else{
            this.minutos = m;
        }
    }

    //*Métodos */

    /**
     * Le agregamos minutos y horas al tiempo.
     * @param h las horas que se le agregan.
     * @param m los minutos que se le agregan.
     * @param s los segundos que se le agregan.
     */
    public void suma(int h, int m, int s){
        int tiempoSegundo = s + m * 60 + h * 3600;
        this.hora = this.hora + tiempoSegundo / 3600;
        tiempoSegundo = tiempoSegundo % 3600;
        this.minutos = this.minutos + tiempoSegundo / 60;
        tiempoSegundo = tiempoSegundo % 60;
        this.segundos = this.segundos + tiempoSegundo;
    }

    /**
     * Agregamos un intervalo de tiempo dentro de otro.
     * @param t intervalo de timepo que vamos a agregar dentro de este.
     */
    public void suma(Tiempo t){
        int tiempoSegundo = t.segundos + t.minutos * 60 + t.hora * 3600;
        this.hora = this.hora + tiempoSegundo / 3600;
        tiempoSegundo = tiempoSegundo % 3600;
        this.minutos = this.minutos + tiempoSegundo / 60;
        tiempoSegundo = tiempoSegundo % 60;
        this.segundos = this.segundos + tiempoSegundo;
    }


    /**
     * Le quitamos minutos y horas al tiempo.
     * @param h
     * @param m
     * @param s
     */
    public void resta(int h, int m, int s){
        if(h > this.hora){
            System.out.println("Son muchas horas para quitar.");
        }else{
            this.hora = this.hora - h;
        }

        if(m > this.minutos){
            System.out.println("Son muchos minutos para quitar.");
        }else{
            this.minutos = this.minutos - m;
        }

        if (s > this.segundos) {
            System.out.println("Son muchos segundos para quitar.");
        }else{
            this.segundos = this.segundos - s;
        }
    }
    
    

    /**
     * Imprimimos el tiempo actual.
     */
    public String toString(){
        return this.hora + "h " + this.minutos + "m " + this.segundos + "s"; 
    }
}
