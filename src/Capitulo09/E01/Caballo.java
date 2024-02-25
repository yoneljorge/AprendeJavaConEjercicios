package Capitulo09.E01;

public class Caballo {

    // *Atributos */
    private String nombre;
    private Sexo sexo;
    private int edad;
    private String raza;

    // *Constructor */
    public Caballo(String nombre, Sexo sexo) {
        this.sexo = sexo;
        this.nombre = nombre;
    }

    // *Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // *Métodos */

    /**
     * Hace que el caballo coma
     * A los caballos solo le gusta el pasto.
     * 
     * @param comida la comida del caballo.
     */
    public void come(String comida) {
        comida = comida.toLowerCase();
        if (comida.equals("pasto")) {
            System.out.println("Mmmmm gracias que rico");
        } else {
            System.out.println("Solo me gusta el pasto");
        }
    }

    /**
     * Hacer que el caballo relinche
     */
    public void relincha() {
        System.out.println("Jijijiji");
    }

}
