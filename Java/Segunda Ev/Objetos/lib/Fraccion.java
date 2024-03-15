package lib;

public class Fraccion {
    private int numerador;
    private int denominador;

 
    public Fraccion(int numerador , int denominador){

        this.numerador = numerador;
        this.denominador = denominador;


    }

    public void Invertir(){
        int temp = this.numerador;
        this.numerador = this.denominador;
        this.denominador = temp;

    }
    public String Simplificar(){

        int a = this.numerador;
        int b = this.denominador;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int mcd = Math.abs(a);

        return this.numerador / mcd + " / " + this.denominador / mcd;
    }
    public String Multiplicar(int numero){

        this.numerador = numerador * numero ;
        this.denominador = denominador * numero;
        return numerador + " / " + denominador; 
    }
    public String Dividir(int numero){

        this.numerador = numerador / numero;
        this.denominador = denominador / numero;

        return numero + "/" + denominador;

    }
}
