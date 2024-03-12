import java.io.File;


public class rmj {

    public static void main(String[] agrs) {

        File file = new File(agrs[0]);
        boolean sigue = true;

        if (!file.exists()){

            System.out.println("El fichero no existe :(");
            sigue= false;

        }

        if (sigue) {
            try{

                if (file.isDirectory()) {

                    System.out.println("Es un directorio");

                }else if (file.delete()) {

                    System.out.println("Eliminado");

                }else{

                    System.out.println("No se ha eliminado");

                }

            }catch(Exception a){

                System.out.println("Error");

            }
        }        
    }
}
