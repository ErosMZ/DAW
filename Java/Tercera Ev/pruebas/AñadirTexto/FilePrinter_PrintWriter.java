import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter_PrintWriter{

    public static void main(String[] args) {

        /*Crea un archivo con ese nombre y escribe lo que hay en el fw.write*/
        try{

            FileWriter fw = new FileWriter("pacoXD.txt");
            fw.write("oalolaola");
            fw.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }
        try{

            PrintWriter fw = new PrintWriter("pacoXD.txt");
            fw.write("oalolaola");
            fw.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }

        /*ESCRIBE EN EL ARCHIVO YA CREADO POR EL (TRUE)
        
        PERO SI NO EXISTE TE LO CREA */
        try{

            FileWriter fw = new FileWriter("pacoXD.txt", true);
            fw.write("oalolaola");
            fw.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}