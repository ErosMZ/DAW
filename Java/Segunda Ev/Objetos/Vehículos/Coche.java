package Vehículos;

public class Coche extends Vehiculo{
    
    private double kmTotalCoche= 0;
    

    public Coche(){ 
        
            super();
        
        

     }

    public void km (double km){ 
        
        this.kmTotalCoche = kmTotalCoche + km; 
        super.kmTot(km);

    }

    public double getKmTot(){ return kmTotalCoche; } 
    
}
