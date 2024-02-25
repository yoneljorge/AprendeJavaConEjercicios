package Capitulo04;

/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado 
 * según las siguientes condiciones
 * 
 * - Se pregunta el cargo del empleado (1- Prog. Junior, 2- Prog. senior, 
 * 3- Jefe de proyecto), los días que ha estado de viaje visitando clientes 
 * durante el mes y su estado civil(1- Soltero, 2- Casado).
 * 
 * - El sueldo base según el cargo es de 950, 1200, y 1600 euros según si se 
 * trata del tipo de programador
 * 
 * - Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto
 *  de dietas. Al sueldo neto hay que restarle el IRPF, que será de un 25 % en 
 * caso de estar soltero y un 20% en caso de estar casado.
 */
import java.util.Scanner;

public class S04Ejercicio24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sueldoBase = 0;
        int dieta = 0;
        int sueldoBruto = 0;
        int retencionIRPF = 0;
        String retencionString = "";
        int sueldoNeto = 0;


        int cargo = 0;
        int diasViaje = 0;
        int estadoCivil = 0;

        System.out.println("1- Programador Junior");
        System.out.println("2- Programador Senior");
        System.out.println("3- Jefe de Proyecto");
        System.out.println("Introduzca el cargo del empleado (1-3): ");
        cargo = sc.nextInt();

        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?: ");
        diasViaje = sc.nextInt();

        System.out.println("Introduzca su estado civil (1- Soltero, 2- Casado): ");
        estadoCivil = sc.nextInt();

        //Agregamos el sueldo base en dependencia del cargo
        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("El cargo no se encuentra en el rango establecido");
                break;
        }

        dieta = 30 * diasViaje;
        sueldoBruto = sueldoBase + dieta;
        
        if(estadoCivil == 1){
            retencionIRPF = (sueldoBruto * 25 / 100);
            retencionString = "25%";
        }else{
            retencionIRPF = (sueldoBruto * 20 / 100);
            retencionString = "20%";
        }

        sueldoNeto = sueldoBruto - retencionIRPF;
        
        

        System.out.println("_________________________________________");
        System.out.println("| Sueldo base          " + sueldoBase);
        System.out.println("| Dietas (5 viajes)    " + dieta);
        System.out.println("|------------------------------");
        System.out.println("| Sueldo bruto         " + sueldoBruto);
        System.out.println("| Retención IRPF " + "("+retencionString+")"  + retencionIRPF);
        System.out.println("|------------------------------");
        System.out.println("| Sueldo neto          " + sueldoNeto);
        System.out.println("----------------------------------");
        sc.close();
    }
}