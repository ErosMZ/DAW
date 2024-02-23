package Exceptiones.Actividad3;

public class Pieza {
    
    private String forma = "";
    private String color = "";
    private Object nombre;

    public Pieza(String string, String string2) {
        this.forma = string;
        this.color = string2;
    }

    public boolean equals(Object o){

        Pieza p = (Pieza) o;
        return this.color.equals(p.color) &&
            this.nombre.equals(p.nombre) &&
            this.area() == p.area();

    }

    private Object area() {
        throw new UnsupportedOperationException("Juan");
    }

}
