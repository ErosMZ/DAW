import java.util.Scanner;

import lib.Tiempo;

public class TiempoMain {
    
   
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        boolean seguir = true;
        int opcion= 0;

        System.out.print("Dime la HORA del tiempo: ");
        int horaInic= sc.nextInt();
        System.out.print("Dime el MINUTO del tiempo inicial: ");
        int minInic= sc.nextInt();
        System.out.print("Dime el SEGUNDO del tiempo inicial: ");
        int segInic= sc.nextInt();
        Tiempo tiempoActual = new Tiempo(horaInic, minInic, segInic); 

        

        while (seguir) {
            
        
            System.out.println("\n--- Menú ---");
            System.out.println("1. Sumar tiempos");
            System.out.println("2. Restar tiempos");
            System.out.println("3. Mostrar tiempo actual");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            if (opcion==1) {

                System.out.print("Dime la la hora: ");
                int horaSuma= sc.nextInt();
                System.out.print("Dime el minuto: ");
                int minSum= sc.nextInt();
                System.out.print("Dime el segundo: ");
                int segSum= sc.nextInt();
                Tiempo tiempoParaSumar = new Tiempo(horaSuma, minSum, segSum);
                System.out.println(tiempoActual.suma(tiempoParaSumar));
                
            }else if (opcion==2){

                System.out.print("Dime la la hora: ");
                int horaResta= sc.nextInt();
                System.out.print("Dime el minuto: ");
                int minResta= sc.nextInt();
                System.out.print("Dime el segundo: ");
                int segResta= sc.nextInt();
                Tiempo tiempoParaRestar = new Tiempo(horaResta, minResta, segResta);
                System.out.println(tiempoActual.resta(tiempoParaRestar));
            }else if(opcion==3){

                System.out.println(tiempoActual);

            }else  if(opcion==0){

                seguir = false;

            }
        }
    }

}
