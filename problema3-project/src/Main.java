import java.util.Scanner;

public class Main {
/*
Dadas tres notas de un estudiante (ingresar por teclado las notas, solo puede usar nextLine()),
determinar el pase de año del mismo en base al promedio de sus notas; si su promedio es mayor a
14, pasa el año. Use la forma expresionLogica ? expresion_1 : expresion2
 */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        // Declarar las 3 notas, el promedio
        float nota1, nota2, nota3, promedio;
        boolean aprobado = false;

        // User ingresa las notas
        System.out.println("Ingrese la nota 1 (use punto para los decimales): ");
        nota1 = Float.parseFloat(entrada.nextLine());

        System.out.println("Ingrese la nota 2 (use punto para los decimales): ");
        nota2 = Float.parseFloat(entrada.nextLine());

        System.out.println("Ingrese la nota 3 (use punto para los decimales): ");
        nota3 = Float.parseFloat(entrada.nextLine());

        //Calcula el promedio
        promedio = (nota1+nota2+nota3)/3;
        aprobado = (promedio>14) ? true : false;

        //Devuelve el resultado


        if (aprobado){
            System.out.println("Estudiante aprobado");
        }else{
            System.out.println("Estudiante reprobado");
        }
    }
}