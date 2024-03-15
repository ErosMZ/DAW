package Universidad;

import java.util.ArrayList;
import java.util.List;

public class MainUniversidad {

    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();

        
        Profesor profesor1 = new Profesor("Profesor1", "Apellido1", "123456789", new Direccion("Calle1", "Ciudad1", 12345, "País1"), 1);
        Profesor profesor2 = new Profesor("Profesor2", "Apellido2", "987654321");

        Estudiante estudiante1 = new Estudiante("Estudiante1", "ApellidoEst1", "111222333", new Direccion("CalleEst1", "CiudadEst1", 11111, "PaísEst1"), 2);
        Estudiante estudiante2 = new Estudiante("Estudiante2", "ApellidoEst2", "444555666");

        
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(estudiante1);
        listaPersonas.add(estudiante2);

        
        System.out.println("Información de las personas en la lista:");

        for (Persona persona : listaPersonas) {
            System.out.println();
            System.out.println(persona);
        }
    }
}
