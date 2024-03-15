package Universidad;

public class Direccion {
    
    private String calle = "";
    private String ciudad = "";
    private int CP = 0;
    private String país= "";
    public Direccion(){
        
    }
    public Direccion(String calle , String ciudad, int CP ,String país){

        this.calle= calle;
        this.ciudad = ciudad;
        this.CP = CP;
        this.país = país;

    }
    public String getCalle() {
        return calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public int getCP() {
        return CP;
    }
    public String getPaís() {
        return país;
    }
    
    
}
