import java.util.Random;
import java.util.Scanner;

public class plazas {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Los casos: ");
        int casos = scan.nextInt();
        int array1 []= new int [7];
        int totalArray=0;
        for(int a =1;a<=casos;a++){

            System.out.print("Dime el primer número: ");
            array1[0]= scan.nextInt();

            for(int b=1;b<7;b++){

                System.out.print("Dime el numero "+ b + ": ");
                array1[b]= scan.nextInt();
                totalArray= totalArray+array1[b];
            }
            if (totalArray<=array1[0]) {

                for(int c = 0;c<array1.length;c++){
                    System.out.print(array1[c]+ " ");
                }
                System.out.println();

            }else{

                System.out.println();
                System.out.println("La suma de los dijistos es mayor");
                System.out.println();
                casos++;

            }
        }
    }
}

        /*Random rand = new Random();
        System.out.println("Dime los casos que quieres: ");
        int casos = scan.nextInt();
        int array1[]= new int [6];
        int veces=1;
        int totalArray=0;

        while (veces<=casos) {
            
            for(int a = 1;a<array1.length; a++){
                array1[0]= rand.nextInt(128) + 1;
                array1[a]=rand.nextInt(32) + 1;
                totalArray= totalArray + array1[a];
            }
            if (totalArray<=array1[0]) {
                for(int b=0;b<array1.length;b++){
                    System.out.print(array1[b] +" ");
                }
                System.out.println();
                veces++;
            }
        }*/
        

