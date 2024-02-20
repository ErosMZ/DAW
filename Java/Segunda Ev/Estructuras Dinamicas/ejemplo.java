package ejemplos;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class ejemplo {
    
    public static void main(String[] args) {
        ArrayList<String> diasSemana = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        diasSemana.add("lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");
        
        for(int i =1; i<=10; i++){

            numeros.add(i);

        }

        System.out.println();
        System.out.println("Iteramos con Iterador");

        Iterator<String> ital = diasSemana.iterator();

        while (ital.hasNext()) {
            System.out.print(ital.next()+ " ");
        }
        
        System.out.println();

        Iterator<Integer> ital1 = numeros.iterator();
        while (ital1.hasNext()) {
            System.out.print(ital1.next() + " ");
        }

        Collections.sort(numeros,Collections.reverseOrder());
        Collections.sort(diasSemana);
        

        System.out.println();

        System.out.println();
        System.out.println("Iteramos con foreach");
        for(String dia : diasSemana){

            System.out.print(dia + " ");

        }
        System.out.println();
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}
