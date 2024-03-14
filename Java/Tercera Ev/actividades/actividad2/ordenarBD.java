package actividad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ordenarBD {
    public static void main(String[] args) {
        String linea = "";
        try {

            File file = new File("SAC_DeepSky_Ver81_QCQ.TXT");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();
            
            while (linea != null) {
                
                String replaceVr =linea.replace(" ", "");

                
                String[] columnas = linea.split("\",\"");
                String colum1= columnas[0];
                linea.replaceAll(" ", "");
                if (columnas[3].equals("\"GALAXI\"")) {
                
                    
                }
                System.out.println(replaceVr);
                linea = br.readLine();
                
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("ERRORRRRRRRRRRRRRRRRRRRR");
            e.printStackTrace();
        }
    }
}
