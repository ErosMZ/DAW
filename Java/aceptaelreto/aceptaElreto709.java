package ejercicios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aceptaElreto709 {

    public static void limpia() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> paisYvotos = new HashMap<String, Integer>();

        int numVataciones = 0;
        boolean si = true;
        String votaciones = "";
        System.out.print("Dime el numero de votaciones: ");

        while (si) {

            numVataciones = sc.nextInt();
            sc.nextLine(); 
            limpia();

            if (numVataciones >= 1 && numVataciones <= 10000) {
                break;
            } else {
                System.out.print("Tiene que ser un número entre el 1 y el 10000: ");
            }
        }

        for (int a = 1; a <= numVataciones; a++) {

            System.out.print("Dime la votacion número " + a + ": ");
            votaciones = sc.nextLine();

            if (paisYvotos.containsKey(votaciones)) {

                int valorPais = paisYvotos.get(votaciones);
                paisYvotos.put(votaciones, valorPais + 1);

            } else {

                paisYvotos.put(votaciones, 1);

            }
        }

        String paisMayor = "";
        int votosMayor = 0;
        String paisEmpate = "" ;
        int votosEmpate = 0;

        for (Map.Entry<String, Integer> entry : paisYvotos.entrySet()) {

            String pais = entry.getKey();
            int votos = entry.getValue();
            if (votos > votosMayor) {
                
                paisMayor = pais;
                votosMayor = votos;

            }else if (votos == votosMayor) {
                
                paisEmpate = pais ;
                votosEmpate = votos;

            }
            
        }
        if (votosMayor == votosEmpate) {

            System.out.println("Empate entre " + paisMayor + " y " + paisEmpate + " con " + votosMayor + " votos");

        }else{

            System.out.println("Gana " + paisMayor + " con " + votosMayor + " votos");

        }

    }
}