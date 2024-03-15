package Actividad4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numerador = 0;
        int denominador = 0;

        try{

            System.out.print("Dime el numerador: ");
            numerador = sc.nextInt();
            System.out.print("Dime el denominador: ");
            denominador = sc.nextInt();

            double division = numerador / denominador;
            System.out.println(numerador + "/" + denominador + " " + "="+ " "  +  division);

        }catch(InputMismatchException acvbffv){

            System.out.println("Dato no numérico");

        }catch(ArithmeticException holaGines){

            System.out.println("Denominador distinto de 0");

        }
        catch(Exception e) {
            System.out.println("Problemas con la division");
        }    
    }
}
