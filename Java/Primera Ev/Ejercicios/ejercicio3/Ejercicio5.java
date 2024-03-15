import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {

		int huevos = 0;
		int maxhuevos = 0;
		Scanner a = new Scanner(System.in);
		
		System.out.println("Dime cuantos huevos caben ");
		maxhuevos = a.nextInt();
		
		System.out.println("Dime cuantos huevos quieres meter ");
		huevos = a.nextInt();

		System.out.println((huevos + maxhuevos -1 / maxhuevos *10));


	}
}