import java.util.Scanner;
public class ejr4 {

	public static void main(String[] args) {
        int valor;
        int acumulador = 2;
        boolean Primo = true;
        
        Scanner a = new Scanner(System.in);
        System.out.println("Dime un numero");
        valor = a.nextInt();
        while(acumulador<valor){
            if(valor % acumulador ==0){
                Primo = false;
                break;
            }
            acumulador++;
        }
        if (Primo && valor > 1) {
            System.out.println(valor + " es primo.");
        } else {
            System.out.println(valor + " no es primo.");
        }
    }
}
    
