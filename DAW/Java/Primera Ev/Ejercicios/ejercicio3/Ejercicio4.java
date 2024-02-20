import java.util.Scanner;
public class Ejercicio4 {
 public static void main(String[] args) {
	 int insectos = 0;
	 int aracnidos = 0;
	 int crustaceos = 0;
	 int ciempies = 0;
	 int milpies = 0;
	 Scanner a = new Scanner(System.in);
	 System.out.println("Cuantos insectos hay? ");
	 insectos  = a.nextInt();
	 System.out.println("Cuantos aracnidos hay? ");
	  aracnidos  = a.nextInt();
	 System.out.println("Cuantos crustaceos hay? ");
	  crustaceos  = a.nextInt();
	 System.out.println("Cuantos ciempies hay? ");
	  ciempies  = a.nextInt();
	 System.out.println("Cuantos milpies hay? ");
	  milpies  = a.nextInt();
	 System.out.println("Hay un total de " +(insectos*6+aracnidos*8+crustaceos*10+2*ciempies+milpies*4)+" patas.");
 }
}