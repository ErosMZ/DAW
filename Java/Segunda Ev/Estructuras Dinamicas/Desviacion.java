package ejercicios;
import java.util.Scanner;
import java.util.Stack;

public class Desviacion {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack<Integer> ArrayListNumeros = new Stack<Integer>();

        String numeros = " ";
        boolean seguir = true;
        
        while (seguir) {
            System.out.println();
            System.out.print("Número: "); numeros = sc.nextLine();

            if (numeros.equals("q")) {seguir = false;}
            
            else {
                
                /*MEDIA */
                System.out.print("\033[H\033[2J");

                int numeroInt = Integer.parseInt(numeros);
            
                ArrayListNumeros.push(numeroInt);
            
                double resultadoMedia = 0;
            
                for (int a = 0; a < ArrayListNumeros.size(); a++) {
                    resultadoMedia = resultadoMedia + ArrayListNumeros.get(a);
                }
            
                resultadoMedia = resultadoMedia / ArrayListNumeros.size();
                

                /*DESVIACIÓN TÍPICA */
                
                
                double sumaDesviacion = 0;

                for (int num : ArrayListNumeros) {
                    double desviacion = num - resultadoMedia;
                    sumaDesviacion += desviacion * desviacion;
                }

                double resultadoDesviacion1 = sumaDesviacion / ArrayListNumeros.size();
                double resultadoDesviacion2 = Math.sqrt(resultadoDesviacion1);

                
                System.out.print("La media es " + resultadoMedia + " La desviación típica es " + resultadoDesviacion2);
                
            }
        }
    }
}