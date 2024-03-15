package Vehículos;

public class Bicicleta extends Vehiculo{

    private double kmTotalBicis=0;
    
    
    public Bicicleta (){

        super();
        
    }

    public void km(double km){

        this.kmTotalBicis = kmTotalBicis + km;
        super.kmTot(km); 

    }

    public double getKmTot() { return kmTotalBicis; }

}