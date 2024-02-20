package Universidad;

public class Persona {

    private String nombre= "";
    private String apellidos=""; 
    private String NIF = "";
    private Direccion direccion;

    public Persona (String nombre, String apellidos, String NIF , Direccion dirección){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF= NIF;
        this.direccion = dirección;

    }
    public Persona (String nombre, String apellidos, String NIF ){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF= NIF;

    }
    public Persona(){

    }

    
}
