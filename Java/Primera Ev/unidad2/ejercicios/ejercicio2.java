

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int b;
        int e;        
        int acumulador = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base");
        b = sc.nextInt();

        System.out.println("Dime el exponente");
        e = sc.nextInt();

        for(int c = 1; c <= e ;c++){
            
            acumulador = acumulador*b;
            
        }
    System.out.println("El resultado es " + acumulador);
    
    }
}
