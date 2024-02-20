import java.util.Arrays;
import java.util.Random;
public class LibreriaArrays {
    public static int[] generaArrayInt(int minimo, int maximo, int tamañoArray) {
        Random rd = new Random();
        int[] array1 = new int[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            int valorEntero = rd.nextInt(maximo - minimo + 1) + minimo;
            array1[i] = valorEntero;
        }

        return array1;
    }
    
    public static int minimoArrayInt(int []array){
        int valorMin = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < valorMin) {
                valorMin = array[i];
            }
        }

    return valorMin;
    }
    public static int maximoArrayInt(int[] array) {
        int valorMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > valorMax) {
                valorMax = array[i];
            }
        }

        return valorMax;
    }
    public static int mediaArrayInt(int []array){
        int tamañoArray= array.length;
        int contador=0;
        for(int a = 0;a<array.length;a++){

            contador = array[a] + contador;

        }
        int resultado = contador/tamañoArray;
        return resultado;
    }
    public static boolean estaEnArrayInt(int [] array ,int numero){
        boolean estaOno= false;

        for(int a= 0; a<array.length;a++){
            if(array[a]==numero){
                estaOno=true;
            }  
        }
        if (estaOno==false) {
            return false;
        }else{
            return true;
        }
    }
    public static int posicionEnArray(int []array , int numero){
        
        int resultado= 0;

        for(int a= 0; a<array.length;a++){
            if(array[a]==numero){
                resultado=a;
                
            } 
        }
        return resultado;
    }
    public static int[] volteaArrayInt(int []array){
        int tamañoArray= array.length;
        int [] array1= new int[array.length];
        int b=0;
        for(int a =tamañoArray-1;a>=0;a-- ){
                array1[a]= array[b];
            
            b++;
        }
        return array1;
    }
   /*public static void main(String[] args) {
        int minimo= 5;
        int maximo=9;
        int tamañoArray= 15;
        int []array3= {13,2,3,4,5,6,7,8,9};
        int numero = 9;

        System.out.println("Generar array: "+(Arrays.toString(generaArrayInt(minimo, maximo, tamañoArray))));
        System.out.println();
        System.out.println("Mínimo de la array: "+minimoArrayInt(array3));
        System.out.println();
        System.out.println("Máximo de la array: "+maximoArrayInt(array3));
        System.out.println();
        System.out.println("Media de la array: "+mediaArrayInt(array3));
        System.out.println();
        System.out.println("¿Esta en la array el numero "+numero+"? "+estaEnArrayInt(array3, numero));
        System.out.println();
        System.out.println("Posición en la que esta el numero "+numero+": "+posicionEnArray(array3, numero));
        System.out.println();
        System.out.println("Array volteada: "+Arrays.toString(volteaArrayInt(array3)));
        System.out.println();
        
    }*/
}
