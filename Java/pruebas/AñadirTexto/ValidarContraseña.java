package AñadirTexto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "";
        String psswd = "";
        String linea;
        int cont = 0;

        try {
            File file = new File("Contraseña.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            System.out.print("User: ");
            user= sc.nextLine();
            System.out.print("Password: ");
            psswd = sc.nextLine();

            linea = br.readLine();
            
            while (linea != null) {

                if (linea.equals(user + ":" + psswd)) {
                    
                    cont++;
                }
                linea = br.readLine();
            } 

            if (cont>0) {
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }

            br.close();
            fr.close();

        } catch (IOException e) {
           System.out.println("Error");
           e.printStackTrace();
        }
    }
}
