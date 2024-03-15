package Persistencia_y_Serializacion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Amigos {
    public static void main(String[] args) {
        File file = new File("amigos.bin");

        try {

            FileOutputStream fs = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            Amigo a = new Amigo("Pedro Perez",  "612345678");

            oos.writeObject(a);

            Amigo a1 = new Amigo("Ana Arnau", "698765432");

            oos.writeObject(a1);
            oos.close();
            fs.close();
        
        } catch (IOException e) {
            System.out.println("Errorrororororor");
        }
        try {
            
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("Listado de amigos en el fichero");
            Amigo a3 = (Amigo) ois.readObject();
            a3.datosAmigo();
            Amigo a4 = (Amigo)ois.readObject();
            a4.datosAmigo();

            ois.close();
            fis.close();

        } catch (IOException e) {

            System.out.println("Excepción: " + e.getMessage());
            
        } catch (ClassNotFoundException e){

            System.out.println("Excepción: " + e.getMessage());

        }
    }
}
