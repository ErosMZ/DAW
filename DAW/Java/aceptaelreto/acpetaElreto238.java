package ejercicios;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class acpetaElreto238 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Queue> billetesYperosna = new HashMap<Integer, Queue>();

        boolean seguir = true;
        int Numbilletes = 0;
        int ladrones = 0;

        while (seguir) {

            System.out.print("Dime cuantos billetes hay: ");
            Numbilletes = sc.nextInt();
            System.out.print("Cuantos ladrones hay; ");
            ladrones = sc.nextInt();

            if (Numbilletes == 0 ) {
                
                seguir = false;

            }else{

                int billetesMios= 0;
                int billetesOtros=0;
                int billete = 0;

                Queue<Integer> billetesOtrosQueue = new LinkedList<Integer>();
                Queue<Integer> billetesMiosQueue = new LinkedList<Integer>();

                for(int b = 1; b <= Numbilletes; b++){

                    if ( b % 2 == 0) {
                        
                       
                        System.out.print("Dime el " + "billete " + "numero: "+ b +": ");
                        billete = sc.nextInt();
                        billetesOtrosQueue.add(billete);
                        System.out.println("ola");

                        billetesOtros += billetesOtros;
                        billetesYperosna.put(billetesOtros, billetesOtrosQueue);

                    }else{

                        System.out.print("Dime el " + "billete " + "numero: "+ b +": ");
                        billete = sc.nextInt();
                        billetesMiosQueue.add(billete);

                        System.out.println("uwu");
                        billetesMios += billetesMios;
                        billetesYperosna.put(billetesMios, billetesMiosQueue);

                    }
                }
                System.out.println(billetesYperosna.put(billetesMios, billetesMiosQueue));
                System.out.println(billetesYperosna.put(billetesOtros, billetesOtrosQueue));
            }
            
        }

    }

}
