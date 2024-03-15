package Figuras;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado (double lado){

        this.lado= lado;

    }

    public double area (){

        double Totarea= lado * lado; 
        return Totarea;
    }

    public double perimetro(){

        double Totperimetro= 4 * lado;
        return Totperimetro;

    } 
}
