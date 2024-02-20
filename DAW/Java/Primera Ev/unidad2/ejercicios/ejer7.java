
import java.util.Random;
import java.util.Scanner;
public class ejer7 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner a = new Scanner(System.in);
        Random n = new Random();
        System.out.println("Dime que vas a elegir (Piedra es 1, Papel es 2 y tijeras es 3");
        n1 = a.nextInt();
        System.out.println("La máquina elige...");
        n2 = n.nextInt(3)+1;
        System.out.println(n2);

        if(n1 ==3 && n2==2){
            System.out.println("Gana "+ n1);
        }if (n1==2 && n2==3) {
            System.out.println("Gana "+ n2);
        }
        if (n1==2 && n2 == 1){
            System.out.println("Gana "+n1);
        }if (n1==1 && n2==2){
            System.out.println("Gana "+n2);
        }
        if (n1==1 && n2==3){
            System.out.println("Gana " + n1);
        }if (n1==3 && n2==1){
            System.out.println("Gana "+n2);
        }
        if(n1 == n2){
        System.out.println("Empate");
        }
    }
}
