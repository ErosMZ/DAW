import java.util.InputMismatchException;
import java.util.Scanner;

public class InOK{
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
            

        }catch(Exception e){
            System.out.println("El valor no es positivo");
            sc.nextLine();
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
    public static void main(String[] args) {
        LeeInt();
        LeeIntPos();
        LeeIntRango();
        LeeDou();
        LeeDouRango();

    }
}
