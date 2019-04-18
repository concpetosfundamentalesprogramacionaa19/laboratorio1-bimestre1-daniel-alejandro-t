import java.util.Scanner;

public class Problema1 {
/*
Se desea realizar un programa que permita calcular el valor mensual a pagar a un trabajador; así
como también el valor de su descuento al Seguro Social (10% del total a pagar). El sueldo mensual
del trabajador se obtienen mediante una multiplicación simple entre el número de horas (100), por
el costo hora oficial.
 */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        //Declaramos las variables
        double numHoras, costoHoraOficial, costoSeguro, sueldo;

        //Ingresar numHoras y costoHoraOficial
        System.out.println("Ingrese el numero de horas trabajadas:");
        numHoras = entrada.nextDouble();

        System.out.println("Ingrese el costo oficial por hora: (decimal con coma)");
        costoHoraOficial = entrada.nextDouble();

        //Se calcula el sueldo multiplicando resultado*numHoras
        sueldo = numHoras * costoHoraOficial;

        //Calcula el costoSeguro en base al 10% del sueldo
        costoSeguro = sueldo/100*12;

        //Descontar el 10% al sueldo debido al seguro
        sueldo -= costoSeguro;

        //Se muestra el resultado
        System.out.println("Se han trabajado " + numHoras + " con un costo de " + costoHoraOficial + " /hora." );
        System.out.println("El sueldo sera " + sueldo + "$ + seguro " +costoSeguro + "$.");
    }
}
