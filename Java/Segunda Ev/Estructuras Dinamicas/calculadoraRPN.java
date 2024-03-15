package ejercicios;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class calculadoraRPN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       
        String accion = "";
        int ultimoNum = 0;
        int penultimoNum= 0;
        Stack<Integer> numeros = new Stack<Integer>();

        System.out.print("Dime el número que quieres: ");

        do {
          
            System.out.print("");
            accion = scan.nextLine();
            
            if (accion.equals("+")) {

                System.out.print("\033[H\033[2J");
                int tamaño = (numeros).size();
                ultimoNum = numeros.peek();
                penultimoNum = numeros.get(((tamaño))-2);
                
                System.out.println();
                
                numeros.push(numeros.pop()+numeros.pop());
                
                Iterator<Integer> iteratorSuma = numeros.iterator();
                System.out.println();
                
                while (iteratorSuma.hasNext()) {
                    
                    System.out.println("| "+ iteratorSuma.next()+" |");
                    System.out.println("____________");
                }
                
            }else if (accion.equals("-")) {
                
                System.out.print("\033[H\033[2J");

                int tamaño = (numeros).size();
                ultimoNum = numeros.peek();
                penultimoNum = numeros.get(((tamaño))-2);
                
                System.out.println();
                
                numeros.push(numeros.pop() - numeros.pop());
                
                Iterator<Integer> iteratorSuma = numeros.iterator();
                System.out.println();
                
                while (iteratorSuma.hasNext()) {
                   
                    System.out.println("| "+ iteratorSuma.next()+" |");
                    System.out.println("____________");

                }

            }else if (accion.equals("*")) {
                
                System.out.print("\033[H\033[2J");

                int tamaño = (numeros).size();
                ultimoNum = numeros.peek();
                penultimoNum = numeros.get(((tamaño))-2);
                
                System.out.println();
                
                numeros.push(numeros.pop() * numeros.pop());
                
                Iterator<Integer> iteratorSuma = numeros.iterator();
                System.out.println();
                
                while (iteratorSuma.hasNext()) {
                   
                    System.out.println("| "+ iteratorSuma.next()+" |");
                    System.out.println("____________");

                }

            }else if (accion.equals("/")) {
                
                System.out.print("\033[H\033[2J");

                int tamaño = (numeros).size();
                ultimoNum = numeros.peek();
                penultimoNum = numeros.get(((tamaño))-2);
                
                System.out.println();
                
                numeros.push(numeros.pop() / numeros.pop());
                
                Iterator<Integer> iteratorSuma = numeros.iterator();
                System.out.println();
                
                while (iteratorSuma.hasNext()) {
                   
                    System.out.println("| "+ iteratorSuma.next()+" |");
                    System.out.println("____________");

                }

            }else{

                System.out.print("\033[H\033[2J");


                int accionInt = Integer.parseInt(accion);
                numeros.push(accionInt);

                Iterator<Integer> iterator = numeros.iterator();

                while (iterator.hasNext()) {
                    
                    System.out.println("| "+ iterator.next()+" |");
                    System.out.println("____________");

                }
    
            }
            
        } while (!accion.equals("q"));
    }
}
