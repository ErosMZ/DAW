import java.util.Scanner;
public class Ejercicio2 {
 public static void main(String[] args) {
	 float kg = 0f;
	 float altura = 0f;
	 Scanner a = new Scanner(System.in);
	 System.out.println("Dime tu peso en kg");
	 kg  = a.nextInt();
	 System.out.println("Dime tu altura en metros");
	 altura  = a.nextInt();
	 System.out.println("Su masa corporal es de = "+(kg/altura*altura));
 }
 }