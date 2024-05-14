
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.sound.midi.Soundbank;

public class ordenarBD {
    public static void main(String[] args){

        String linea = "";
        
        try {
            // lectura
            File file = new File("SAC_DeepSky_Ver81_QCQ.TXT");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // escritura
            File fileBin = new File("SAC.bin");
            FileOutputStream fs = new FileOutputStream(fileBin);
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            linea = br.readLine();
            
            while (linea != null) {
                                
                String[] columnas = linea.split(",");

                String columOBJ= columnas[0].replace("\"", "").replace(" ", "");
                String columGLX= columnas[2].replace("\"", "").replace(" ", "");
                String columCONST= columnas[3].replace("\"", "").replace(" ", "");
                String columRECTA= columnas[4].replace("\"", "").replace(" ", "");
                String columDEC= columnas[5].replace("\"", "").replace(" ", "");
                String columMAG= columnas[6].replace("\"", "").replace(" ", "");
                
               if (columGLX.equals("GALXY")) {
                    
                    galaxia glx = new galaxia(columOBJ, columCONST, columRECTA, columDEC, columMAG);
                    System.out.println(glx);
                    oos.writeObject(glx.toString());
                   

                }
                linea = br.readLine();
            }

            oos.close();
            br.close();
            fr.close();
        } catch (IOException e) {

            System.out.println("No existe el fichero");
            e.printStackTrace();

        }catch(NoClassDefFoundError e){
            System.out.println("jdgfg");
        }
    }
}