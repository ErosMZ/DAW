package Figuras;

public class Circulo extends Figura{
    private double radio;
    

    public  Circulo (int radio){

        this.radio = radio;

    }
    public double perimetro(){

        double Totperimetro = 2 * Math.PI * radio;
        return Totperimetro;

    }

    public double area(){

        double Totarea = Math.PI * radio * radio;
        return Totarea;

    }

    
}
