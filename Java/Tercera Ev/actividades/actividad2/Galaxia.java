package actividad2;

import java.io.Serializable;

public class Galaxia implements Serializable{
    
    private String obj= "";
    private String Recta = "";
    private String Dec = "";
    private String Mag = "";

    public Galaxia(String obj, String Const, String Recta, String Dec, String Mag){

        this.obj = obj;
        this.Recta = Recta;
        this.Dec = Dec;
        this.Mag= Mag;

    }

    @Override
    public String toString() {
        return obj + "  " + "  " + Recta + "  " + Dec + "  " + Mag + "\n";
    }

    

}
