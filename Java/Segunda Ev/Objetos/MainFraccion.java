
import java.util.Scanner;

import lib.Fraccion;



public class MainFraccion {

   
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        int numerador= 0;
        int denominador= 0;
        boolean si = true;
        int numeradorAmultiplicar= 0;
        int numeroAdividir=0;

        System.out.print("Dime el numerador: ");
        numerador = sc.nextInt();
        System.out.print("Dime el denominador: ");
        denominador = sc.nextInt();

        Fraccion fr = new Fraccion(numerador,denominador);

        while (si) {
            
            System.out.println("1. Invertir");
            System.out.println("2. Simplificar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();

            
            switch (opcion) {
                case 1 :

                    fr.Invertir();
                    System.out.println("Se han cambiado..");
                    System.out.print("Presiona ENTER para continuar...");
                    sc.nextInt();
                    break;
                case 2:

                    System.out.println(fr.Simplificar());
                    break;
                case 3:

                    System.out.print("Dime el numero por el que quieres multiplicar: ");
                    numeradorAmultiplicar = sc.nextInt();

                    System.out.println(fr.Multiplicar(numeradorAmultiplicar));

                    
                    break;
                case 4: 

                    System.out.print("Dime el número por el que quieres dividir: ");
                    numeroAdividir = sc.nextInt();
                    System.out.println(fr.Dividir(numeroAdividir));

                   

                    break;

                case 5:
                    si = false;
                    break;

                default :
                    System.out.println("Carácter inválido");
               
            }
        }
    }
}
