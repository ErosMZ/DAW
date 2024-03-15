package BasicoFicheros;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Crear_fichero{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String nombreFichero = "";
        
        try{

            System.out.print("Dime el nombre del fichero: ");
            nombreFichero = sc.nextLine();

            /*También puedes poner rutas */
            File file = new File(nombreFichero);

        if (file.createNewFile()) {
            System.out.println("Fichero creado: " + file.getName());
        } else {
            System.out.println("El fichero ya existe");
        }
        }catch (IOException e) {
            System.out.println("Error: No puedo crear el fichero");
        }
    }
}