package Exceptiones.Actividad3;

public class Main{
    
    @SuppressWarnings("removal")
    public static void main(String[] args) {

        Pieza p1 = new Pieza("cuadrado","rojo");
        Pieza p2 = new Pieza("cuadrado","rojo");
        Double d = new Double(1.0);
        String k = "Hola";
        boolean b1 = p1.equals(p2);
        boolean b2 = d.equals(k);
        boolean b3 = k.equals(p2);
        boolean b4 = p1.equals(d);
        
    }

}
    

