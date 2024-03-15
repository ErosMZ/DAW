package ejemplos;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.sound.midi.Soundbank;

import java.util.Iterator;
public class queueYstack {
    
    public static void main(String[] args) {
        Queue<String> QueuediasSemana = new LinkedList<String>();

        String dia;
        
        // Añadimos elementos a Queue
        QueuediasSemana.add("Lunes");
        QueuediasSemana.add("Martes");
        QueuediasSemana.add("Miércoles");
        QueuediasSemana.add("Jueves");
        QueuediasSemana.add("Viernes");
        QueuediasSemana.add("Sabado");
        QueuediasSemana.add("Domingo");

        dia=QueuediasSemana.peek();
        System.out.println("El primer valor es "+ dia);

        while (dia!=null) {

            if (dia.equals(null)) {
                
            }else{

                dia= QueuediasSemana.poll();
                System.out.println("Voy a quitar " + dia + QueuediasSemana);

            }
            
        }

        //STACK METODO FILA
        System.out.println();
        System.out.println("     STACK");
        System.out.println();
        Stack<String> StackdiasSemana = new Stack<String>();
        StackdiasSemana.push("Lunes");
        StackdiasSemana.push("Martes");
        StackdiasSemana.push("Miércoles");
        StackdiasSemana.push("Jueves");
        StackdiasSemana.push("Viernes");
        StackdiasSemana.push("Sabado");
        StackdiasSemana.push("Domingo");

        System.out.println("Iteramos con Iterator");

        Iterator<String> its = StackdiasSemana.iterator();
        while (its.hasNext()) {
        System.out.println(its.next());
        }

        System.out.println();
        System.out.println();

        String primerNumero= StackdiasSemana.peek();
        System.out.println("Primer valor " + primerNumero);

        System.out.println();
        System.out.println();

        dia = "Jueves";
        System.out.printf("El día de la semana %s está en la posición %d de la pila %s\n",
        dia, StackdiasSemana.search(dia), StackdiasSemana);
        System.out.println();
        System.out.println("Desapilamos los elementos hasta vaciar la pila");
        System.out.println();
        
        while (!StackdiasSemana.isEmpty()) {

            System.out.printf("Se va a eliminar el elemento %s\n", dia);
            StackdiasSemana.pop();
            System.out.printf("La pila es: %s\n", StackdiasSemana);

            if (!StackdiasSemana.isEmpty()){
            
                dia = StackdiasSemana.peek();
            
            }

        }
    }
}
    

