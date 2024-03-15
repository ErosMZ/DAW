import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            System.out.println();
            while (linea != null) {
                System.out.println();
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
