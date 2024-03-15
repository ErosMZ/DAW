package actividad1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class escribir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = true;
        String tx = "";
        try {

            System.out.print("Nombre del fichero: ");
            String nombreFich= sc.nextLine();
            FileWriter fw = new FileWriter(nombreFich);

                System.out.println("Escribe exit para salir");
                

            while (exit) {
                System.out.print("      Texto: ");
                tx = sc.nextLine();
                if (tx.equals("exit")) {
                    exit = false;

                    fw.close();

                }else{

                    fw.write(tx + "\n");

                }
            }

        } catch (IOException e) {
            System.out.println("ERRORRRRRRRRRRRRR");
        }
    }
    
}
