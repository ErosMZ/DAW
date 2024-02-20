package Universidad;

public class Profesor extends Persona{
    
    private int ndespacho = 0; 
    private String nombre = "";
    private String apellidos = "";
    private String NIF = "";
    private Direccion direccion;
    
    public Profesor (){
        
    }
    public Profesor(String nombre , String apellidos , String NIF ,Direccion direccion ,int ndespacho){

        super(nombre, apellidos, NIF, direccion);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
        this.ndespacho = ndespacho;

    }
    public Profesor(String nombre, String apellidos, String NIF, Direccion dirección) {

        super(nombre, apellidos, NIF, dirección);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
        

    }
    public Profesor(String nombre, String apellidos, String NIF) {

        super(nombre, apellidos, NIF);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;

    }
    public Profesor(String nombre, String apellidos, String NIF, int ndespacho) {

        super(nombre, apellidos, NIF);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.ndespacho = ndespacho;

        
    }
    public int getNdespacho() {
        return ndespacho;
    }
    public void setNdespacho(int ndespacho) {
        this.ndespacho = ndespacho;
    }
    @Override
    public String toString() {
        return "Profesor [Número de despacho=" + ndespacho +
            ", Nombre='" + nombre + '\'' +
            ", Apellidos='" + apellidos + '\'' +
            ", NIF='" + NIF + '\'' +
            ", Dirección=" + direccion +
            ']';
    }

}
