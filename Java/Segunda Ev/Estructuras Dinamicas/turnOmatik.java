package ejercicios;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class turnOmatik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> cola = new LinkedList<String>();
        String accion = "";
        String nombre = "";
        boolean seguir = true;



        while (seguir) { 

            System.out.println("1. Añadir cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Mostrar cola actual");
            System.out.println("0. Salir");

            accion = sc.nextLine();

            if (accion.equals("1") ) {
                System.out.print("\033[H\033[2J");

                System.out.print("Dime el nombre de la persona: ");
                nombre = sc.nextLine();

                cola.add(nombre);
                int tamañoArray = cola.size();

                System.out.print("\033[H\033[2J");

                if (tamañoArray==1) {
                   
                    
                    System.out.println("No tiene a nadie delante");
                    

                }else{
                    
                    
                    int cuantosTieneDelante = cola.size()-1;
                    System.out.println("Tiene "+cuantosTieneDelante + " delante");
                    

                }

                System.out.println();
                System.out.print("Presiona ENTER para continuar..."); sc.nextLine();

                System.out.print("\033[H\033[2J");

            } else if (accion.equals("2")) {
                
                String primerCliente= cola.peek();
                cola.poll();

                System.out.println("El cliente " + primerCliente + " ha sido atendido");
                System.out.print("Presiona ENTER para continuar..."); sc.nextLine();

                System.out.print("\033[H\033[2J");

            } else if (accion.equals("3")) {
              
                System.out.println(cola);

                System.out.print("Presiona ENTER para continuar..."); sc.nextLine();

               

            } else if (accion.equals("0")) {

                seguir = false;

            } else {

                System.out.print("\033[H\033[2J");
                System.out.println("Caracter inválido");
                System.out.println();
                System.out.print("Presiona ENTER para continuar..."); sc.nextLine();
                System.out.print("\033[H\033[2J");

            }
        }
    }
}