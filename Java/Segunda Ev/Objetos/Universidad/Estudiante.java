package Universidad;

public class Estudiante extends Persona{
    
    private int IDestudiante = 0;
    private String nombre = "";
    private String apellidos = "";
    private String NIF = "";
    private Direccion direccion;

    
    public Estudiante(String nombre, String apellidos, String NIF, Direccion dirección, int iDestudiante) {
        super(nombre, apellidos, NIF, dirección);
        this.IDestudiante = iDestudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = dirección;
        
    }
    public Estudiante(String nombre, String apellidos, String NIF, Direccion dirección) {
        super(nombre, apellidos, NIF, dirección);
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = dirección;
        
    }
    public Estudiante(String nombre, String apellidos, String NIF) {
        super(nombre, apellidos, NIF);
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        
        
    }

    public Estudiante(String nombre, String apellidos, String NIF, int iDestudiante) {
        super(nombre, apellidos, NIF);
        this.IDestudiante = iDestudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        
    }


    public Estudiante(int iDestudiante) {
        IDestudiante = iDestudiante;
    }


    public Estudiante (){

    }
    public int getIDestudiante() {
        return IDestudiante;
    }
    public void setIDestudiante(int iDestudiante) {
        IDestudiante = iDestudiante;
    }
    @Override
    public String toString() {
        return "Estudiante [ID Estudiante =" + IDestudiante +
        ", Nombre='" + nombre + '\'' +
        ", Apellidos='" + apellidos + '\'' +
        ", NIF='" + NIF + '\'' +
        ", Dirección=" + direccion +
        ']';
    }
}
