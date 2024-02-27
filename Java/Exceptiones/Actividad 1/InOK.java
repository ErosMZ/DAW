
import java.util.InputMismatchException;
import java.util.Scanner;

public class InOK {

    private static Scanner sc = new Scanner(System.in);
    
    public static void LeeInt () {
        try {
            int paco = sc.nextInt();

        }catch(Exception e){
            System.out.println("Valor incorrecto");
            sc.nextLine();
        }
    }

    public static void LeeIntPos (){
        
        try {
            
            int paco = sc.nextInt();
            if (paco <= 0) throw new Exception ();
            

        }catch(InputMismatchException a){
            System.out.println("Caracter no numérico");
        }
        catch(Exception e){
            System.out.println("El valor no es positivo");
            
        }

    }
    public static void LeeIntRango(){
        int valorMin = 0;
        int valorMax = 0;
        boolean seguir = true;
        try{
            System.out.print("Valor mín: ");
            valorMin = sc.nextInt();
            System.out.print("Valor máx: ");
            valorMax = sc.nextInt();
        }catch(Exception e){
            seguir = false;
            System.out.println("Valor invalido");
        }
        
        if (seguir) {
            try{

                int numero = sc.nextInt();
                if (numero<valorMin && numero>valorMax) throw new Exception();
    
            }catch(Exception e){
                System.out.println("Este valor no esta entre "+ valorMin + "y "+ valorMax);
                sc.nextLine();
            }
        }
        
    }

    public static void LeeDou(){

        try{

            double numero = sc.nextDouble();

        }catch(Exception e){

            System.out.println("Este numero no es real");

        }

    }

 
    public static void LeeDouRango(){
        double valorMin = 0;
        double valorMax = 0;
        boolean seguir = true;
        try{
            System.out.print("Valor mín: ");
            valorMin = sc.nextDouble();
            System.out.print("Valor máx: ");
            valorMax = sc.nextDouble();

        }catch(Exception e){
            seguir = false;
            System.out.println("Valor invalido");
        }
        
        if (seguir) {
            try{

                double numero = sc.nextDouble();
                if (numero<valorMin && numero>valorMax) throw new Exception();
    
            }catch(Exception e){
                System.out.println("Este valor no esta entre "+ valorMin + "y "+ valorMax);
                sc.nextLine();
            }
        }
    }
    
    @SuppressWarnings("unlikely-arg-type")
    public static void ValidaString () throws ElementoNoExistente {

        String String = "";
        
        boolean hay = false;

        System.out.print("Dime el nombre: ");
        String =sc.nextLine();
        

        for(int a = 0; a < COMPOSITORES.length; a++){
            if (String.equals(COMPOSITORES[a])) {
                
                hay = true;
                System.out.println("El nombre que proporcionaste esta en la posición " + a);
            }
        }

        if (!hay){
            throw new ElementoNoExistente("Ese elemento no existe");
        } 

    }
    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};
    public static void main(String[] args) throws ElementoNoExistente {
    ValidaString();
}
}
