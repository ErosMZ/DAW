package Actividad3;

public class Pieza {

    private String nombre = "";
    private String color = "";

    public Pieza (String nombre , String color){

        
    }

    public double area() {
        return 1;
    }
    
    public boolean equals(Object o) {
        
        Pieza p = (Pieza) o;
        return this.color.equals(p.color) &&
        this.nombre.equals(p.nombre) &&
        this.area() == p.area();

    }

}
