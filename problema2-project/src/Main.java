import java.util.Scanner;

public class Main {

    public static void main (String [] Args){
        Scanner entrada=new Scanner(System.in);

        //Declaramos las variables x, y, z, resultadoM como double
        double x,y, z, resultadoM;

        //Ingresamos las variables x, y, z con nextLine y realizamos un casting
        System.out.println("Ingrese x (separe decimales con punto):");
        x=Double.parseDouble(entrada.nextLine());

        System.out.println("Ingrese y (separe decimales con punto):");
        y=Double.parseDouble(entrada.nextLine());

        System.out.println("Ingrese z (separe decimales con punto):");
        z=Double.parseDouble(entrada.nextLine());

        //Calcula M
        resultadoM=(x+y/z)/(x-y/z);

        //Presenta el resultado
        System.out.println("El valor de m, en base a las variables:" + "\n"
                            + "x = " + x + "\n"
                            + "\t" + "y = " + y + "\n"
                            + "\t\t" + "z = " + z + "\n"
                            + "da como resultado:" + "\n"
                            + "\t\t\t" + "m = " + resultadoM);
    }
}
