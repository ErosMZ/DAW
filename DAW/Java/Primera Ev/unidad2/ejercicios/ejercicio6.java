

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int dia1;
        int hora1;
        int dia2;
        int hora2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer día");
        dia1 = sc.nextInt();
        System.out.println("Dime la hora del primer día");
        hora1 = sc.nextInt();
        System.out.println("Dime el segundo día");
        dia2 = sc.nextInt();
        System.out.println("Dime la hora del segundo día");
        hora2 = sc.nextInt();

        if(dia1 <=7 && dia1>0 && hora1 >= 0 && hora1 <=23 && dia2 <=7 && dia2>0 & hora2 >= 0 && hora2 <=23 && dia1>dia2){

            System.out.println(((dia2-dia1)-1)*24 + (24-hora1 + hora2));

        }else{
            System.out.println("Numeros incorrectos");
        }
    }    
}
