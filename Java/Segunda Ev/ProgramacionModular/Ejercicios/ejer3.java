import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int casos= 0;

        System.out.print("Cuantos casos hay: ");
        casos = scan.nextInt();

        if (casos>0) {
            for(int a = 1;a<=casos;a++){
               
                System.out.print("Dime el caso "+ a + ": ");
                int caracter = scan.next().charAt(0);
                int conAscii = (int) caracter;
                System.out.println("El código ASCII es: " +conAscii);
                int anteriorPrimo= libreria.FNumDAW.anteriorPrimo(conAscii);
                System.out.println("El anterior primo es: "+anteriorPrimo);
                System.out.println();
                 
            }
        }else{
            System.out.println("Caracter invalido");
        }
    }
}
