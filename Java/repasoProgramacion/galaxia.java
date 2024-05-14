import java.io.Serializable;

public class galaxia implements Serializable{
    private String Objeto = "";
    private String Constelacion= "";
    private String Recta= "";
    private String Declinacion = "";
    private String Magnitud = "";
    
    public  galaxia( String Objeto, String Constelacion,String Recta, String Declinacion, String Magnitud ){
        this.Objeto =Objeto;
        this.Constelacion = Constelacion;
        this.Recta = Recta;
        this.Declinacion = Declinacion;
        this.Magnitud = Magnitud;

    }
    public String getObjeto() {
        return Objeto;
    }
    public void setObjeto(String objeto) {
        Objeto = objeto;
    }
    public String getConstelacion() {
        return Constelacion;
    }
    public void setConstelacion(String constelacion) {
        Constelacion = constelacion;
    }
    public String getRecta() {
        return Recta;
    }
    public void setRecta(String recta) {
        Recta = recta;
    }
    public String getDeclinacion() {
        return Declinacion;
    }
    public void setDeclinacion(String declinacion) {
        Declinacion = declinacion;
    }
    public String getMagnitud() {
        return Magnitud;
    }
    public void setMagnitud(String magnitud) {
        Magnitud = magnitud;
    }
    @Override
    public String toString() {
        return Objeto + " " + Constelacion + " "  + Recta + " "  + Declinacion + " " +  Magnitud;
    }

    
}
