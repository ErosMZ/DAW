package libreria;
public class FNumDAW {
    public static int potencia(int base, int exponente) {
        int contador=1;

        for(int a =1; a<=exponente;a++){
            contador=base*exponente;
        }
    return contador;    
}
    public static int cuentaDigitos(int numero) {

        int resultado = (int)(Math. log10(numero)+1);
        return resultado;
        }

    public static int voltea (int num){
        int resultado = 0;

            while (num != 0) {
            int digito = num % 10;
            resultado = resultado * 10 + digito;
            num /= 10;
        }
        return resultado;   
    }
    public static String esCapicua(int numero){
        int volteado = voltea(numero);

        if (numero == volteado){
            return "Es capicua";
        }
        return "No es capicua";
    }
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int numero) {
        for (int x = numero + 1; true; x++) {
            if (esPrimo(x)) {
                return x;
            }
        }
    }

    public static int anteriorPrimo(int numero) {
        int anteriorPrimo = numero - 1;

        while (!esPrimo(anteriorPrimo)) {
            anteriorPrimo--;
        }

        return anteriorPrimo;
    }

    /* 
    OTRAS FUNCIONES
    */

    
    public static char digitoN(int numero, int posicion) {

        String numString= Integer.toString(numero);
        
        char [] array= numString.toCharArray();
        return array[posicion];

    }
    public static int posicionDeDigito(int numero, int numQueBusca) {
        String numString = Integer.toString(numero);
        char[] array = numString.toCharArray();

        for(int i=0;i<array.length;i++){
            if (numQueBusca==array[i]) {
                return i;
            }
        }
        return -1;
    }
    public static String parteNumero ( int numero, int inicial, int fin ){
            String num = Integer.toString(numero);
            String resultado = num.substring(inicial, fin);
            return resultado;
        }
    public static String pegaNumeros(int numero, int numero2){
      String numEntero= String.valueOf(numero)+String.valueOf(numero2);
      return numEntero;
    }
}

   

    