
import java.util.Scanner;

public class Quinto {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         for ( int i = 1 ; i <= n ; i++){

            for ( int j = 1 ; j <= n; j++ ){

                int operacion = i + j + i * j;

                System.out.println( "("+ i+ ","+ j +") : "+i +" + " +j +" + " + i +" * " + j + " vale:  " + operacion );
 
            }
         }
    }