package Actividad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numerador = 0;
        int denominador = 0;

        try{

            System.out.print("Dime el numerador: ");
            numerador = sc.nextInt();
            System.out.print("Dime el denominador: ");
            denominador = sc.nextInt();
            
           
            double division = divide(numerador, denominador);

            System.out.println(numerador + "/" + denominador + " " + "="+ " "  +  division);

        }catch(InputMismatchException holaGinesException){

            System.out.println("Dato no numérico");

        }catch(ArithmeticException holaolaGines){

            System.out.println("No se puede dividir por 0");

        }
        catch(Exception olaGinesException) {

            System.out.println("El denominador no puede ser 0");

        }
        
    }
    public static int divide(int nume, int denom) throws ArithmeticException{
        if (denom == 0) {
        throw new ArithmeticException();
        }
        return nume / denom;
    }
}


