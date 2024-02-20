import java.util.Scanner;
public class Prueba3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la hora");
		int hora = sc.nextInt();
		
		if (hora >= 8 && hora <= 12){
		
			System.out.println("Buenos dias");
		
		}else if(hora >= 13 && hora <=21){
			
			System.out.println("Buenas tardes");
			
		}else{
		
			System.out.println("Buenas noches");
			
		}
	}
}	