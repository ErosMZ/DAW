package ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class intento2aceptaelreto238 {
    
    public static void limpia() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Queue<Integer> billetesQueue = new LinkedList<Integer>();

        boolean seguir = true;

        int ladrones = 0;
        int billetes= 0;

        while(seguir){

            limpia();

            System.out.print("Dime cuantos ladrones sois: ");
            ladrones = sc.nextInt();
            System.out.print("Dime cuantos billetes hay: ");
            billetes = sc.nextInt();

            if (ladrones == 0 | billetes == 0) {
                
                seguir = false;

            }else{

                for(int a = 1; a <=billetes; a++){

                    System.out.print("Dime el billete número "+ a + ": ");
                    int valorBillete= sc.nextInt();
                    billetesQueue.add(valorBillete);

                }

                

                /*for (Integer num : billetesQueue) {

                    System.out.println(num);
        
                } */
                
                
            }

        }

    }

}
