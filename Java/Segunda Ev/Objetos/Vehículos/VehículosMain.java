package Vehículos;
import java.util.Scanner;

public class VehículosMain{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
            
        
        int opcion=0;
        Boolean seguir = true;
        while (seguir) {
            System.out.println();
            System.out.println("VEHÍCULOS");
            System.out.println(" =====================================");
            System.out.println("|| 1. Anda en bicicleta              ||");
            System.out.println("|| 2. Anda en coche                  ||");
            System.out.println("|| 3. Ver kilometraje de la bicicleta||");
            System.out.println("|| 4. Ver kilometraje del coche      ||");
            System.out.println("|| 5. Ver kilometraje total          ||");
            System.out.println("|| 6. Ver vehículos totales          ||");
            System.out.println("|| 7. Salir                          ||");
            System.out.println(" =====================================");
            System.out.print("Elige una opción (1-7): ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    System.out.print("Dime cuantos km vas a caminar: ");
                    double kmBici = sc.nextDouble();
                    System.out.print("\033[H\033[2J");
                    bicicleta.km(kmBici);
                    break;

                case 2:
                    
                    System.out.print("Dime cuantos km vas a caminar: ");
                    double kmCoche = sc.nextDouble();
                    System.out.print("\033[H\033[2J");
                    coche.km(kmCoche);
                    break;
                case 3:
                
                    System.out.print("\033[H\033[2J");
                    System.out.println(bicicleta.getKmTot()); 

                    break;
                case 4:

                    System.out.print("\033[H\033[2J");
                    System.out.println(coche.getKmTot());
                    break;

                case 5:
                        
                    System.out.println(Vehiculo.getTotalKmVehiculos());
                    break;

                case 6:
                    System.out.println(Vehiculo.getTotalVehiculos());
                    
                    break;
                case 7:

                    seguir = false;
                    break;

                default:
                    System.out.println("Carácter incorrecto");
                break;
            }
        }
    }
}