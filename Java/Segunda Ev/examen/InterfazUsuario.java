import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

import Actividad3.main;

public class InterfazUsuario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean sigue = true;
        String reff= "";
        int m3= 0;
        System.out.println(Catalogo.listado());
            while (sigue) {
            
            try {
               
                    System.out.print("Dime la referencia: ");
                    reff = sc.next();
                    System.out.print("Dime los m3: ");
                    m3= sc.nextInt();
                    
                    new Calculos(reff, m3);
                
                    System.out.println("Dime cuantas unidades quieres: ");

            } catch (InputMismatchException e) {

                System.out.println("Valor no numérico");

            }
            
        }
    }
}



