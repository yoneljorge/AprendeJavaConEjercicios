package Capitulo09.E06;

public class Main {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0, 0,0);
        t1.suma(0, 154, 0);
        System.out.println(t1);
        
        Tiempo t2 = new Tiempo(0, 45, 0);
        System.out.println(t2);

        Tiempo t3 = new Tiempo(0, 0, 0);
        t3.suma(t2);
        System.out.println(t3);
    }
}
