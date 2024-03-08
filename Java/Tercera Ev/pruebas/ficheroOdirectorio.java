import java.io.File;
import java.util.Scanner;

public class ficheroOdirectorio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombArv= "";
        System.out.print("Dime el nombre de el archivo: ");
        nombArv= sc.nextLine();

        boolean sigue = true;
        File file = new File(nombArv);
        System.out.println();
        if (!file.exists()) {
            System.out.println("El fichero no existe");
            sigue = false;
        }

        if (sigue) {
            
            if (file.isDirectory()) {
                System.out.println("Es un directorio");
            }else{
                System.out.println("Es un fichero");
            }

            System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            System.out.println("Tamaño: " + file.length());

            if (file.canRead()) {
                System.out.println("Con permiso de lectura");
            }else{
                System.out.println("Sin permiso de lectura");
            }

            if (file.canWrite()) {
                System.out.println("Con permiso de escritura");
            }else{
                System.out.println("Sin permiso de escritura");
            }

            if (file.canExecute()) {
                System.out.println("Con permsiso de ejecución");
            }else{
                System.out.println("Sin permiso de ejecución");
            }
        }
        System.out.println();
    }
}