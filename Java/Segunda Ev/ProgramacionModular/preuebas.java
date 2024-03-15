public class preuebas {
   public static void main(String[] args) {  
        int minimo= 3;
        int maximo=10;
        int tamañoArray= 4;
        int valorEntero = (int) (Math.floor(Math.random()*(maximo-minimo+1)+minimo));
        int [] array1= new int[tamañoArray];
        
        for(int a = 0;a<=tamañoArray;a++){
            int n= valorEntero;
            System.out.println(array1[n]); 
            System.out.println();
        }
    }
}

