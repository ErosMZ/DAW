package actividad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ordenarBD {
    public static void main(String[] args) {
        String linea = "";
        
        try {

            File file = new File("SAC_DeepSky_Ver81_QCQ.TXT");
            FileWriter fw = new FileWriter("Datos.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

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
                
                    Galaxia glx = new Galaxia(columOBJ, columCONST, columRECTA, columDEC, columMAG);

                    
                    
                    fw.write(glx.toString());
                    
                        
                    
                    
                }
                
                linea = br.readLine();
              
            }
            fw.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("ERRORRRRRRRRRRRRRRRRRRRR");
            e.printStackTrace();

        }
    }
}
