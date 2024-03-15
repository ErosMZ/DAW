package Figuras;

public class Triangulo extends Figura {
    
    private double base;
    private double altura;

    public Triangulo (double base,double altura){

        this.altura = base;
        this.base = altura;

    }
    public double area (){

        double baseTot= (base * altura)/2;
        return baseTot;

    }

    public double perimetro(){

        double Totperimetro = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2)) * 2 + base;        
        return Totperimetro;
        

    }
}
