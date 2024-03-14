package BasicoFicheros;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Crear_carpeta{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String nombreFichero = "";
        
        try{

            File directorio = new File("directoriofhd");

            if (directorio.mkdir()) {
                System.out.println("Fichero creado: " );
            } else {
                System.out.println("El fichero ya existe");
            }
            }catch (Exception e) {
                System.out.println("Error: No pudo crear la carpeta");
            }
    }
}