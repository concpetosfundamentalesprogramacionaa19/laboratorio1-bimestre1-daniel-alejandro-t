package paqueteprincipal;

import paquete1.MiClase1;
import paquete2.MiClase2;
import paquete3.MiClase3;

import java.util.Scanner;

public class Principal {
    public static void main(String []Args){
        Scanner entrada=new Scanner(System.in);

        boolean mayorEdad=false;

        //Rellenamos nombre, apellido y edad

        System.out.println("Ingrese el nombre: ");
        MiClase2.nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido:");
        MiClase3.apellido = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        MiClase1.edad = entrada.nextInt();




        //evaluamos edad:
        mayorEdad = (MiClase1.edad>18) ? true : false;

        //Mostramos:

        System.out.println( "Nombre:" + "\n" +
                            "\t" + MiClase2.nombre + "\n" +
                            "Apellido:" + "\n" +
                            "\t" + MiClase3.apellido);

        if (mayorEdad) {
            System.out.println("Edad: \n\t" + MiClase1.edad + " y mayor de edad");
        }else{
            System.out.println("Edad: \n\t" + MiClase1.edad + " y menor de edad");
        }
    }

}
