package Actividad6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{

        int  juan [] = new int[5];

        for(int a = 0; a > juan.length; a++){

            juan[a] = a;

        }

        System.out.print("Dime que posición de la array quieres imprimir: ");
        int datoAimprimir= sc.nextInt();

        System.out.println(juan[datoAimprimir]);

        }catch(ArrayIndexOutOfBoundsException holaGines){

            System.out.println("No existe esa posición en la array");

        }catch(InputMismatchException olaGines){

            System.out.println("Dato no numérico");

        }
    }
}
