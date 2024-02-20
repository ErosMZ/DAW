
import java.util.Scanner;
public class ejercicio3{
    public static void main(String[] args) {
        String numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero");
        numero = sc.nextLine();

        if(numero.length() <=6){

            System.out.println("Tiene "+numero.length()+" números");

        }else {

            System.out.println("Numero invalido");
                
        }
    }
}
