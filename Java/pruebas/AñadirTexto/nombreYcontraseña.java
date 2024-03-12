package AñadirTexto;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class nombreYcontraseña {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "";
        String psswd = "";
        boolean exit = true;
        try {
            
            FileWriter fw = new FileWriter("Contraseña.txt");

            while (exit) {

                System.out.print("User: ");
                user = sc.nextLine();

                if (user.equals("exit")) {

                    exit = false;
                    fw.close();
                    break;
                }

                System.out.print("Password: ");
                psswd = sc.nextLine();
                
                if (psswd.equals("exit")) {
                    exit = false;
                    fw.close();
                    break;
                }

                if (!user.equals("exit") || !psswd.equals("exit")) {
                    fw.write(user + ":"+ psswd + "\n");
                }
            } 

        }catch (IOException e) {
            System.out.println("ERRORRRRRRRRRRR!!!!!!!!");
        }
    }
    
}
