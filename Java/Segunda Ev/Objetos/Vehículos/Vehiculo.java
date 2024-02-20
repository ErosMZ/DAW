package Vehículos;

public abstract class Vehiculo {

    private static int totalVehiculos = 0;
    private static double totalKmVehiculos = 0;
    
    public Vehiculo() {
        totalVehiculos++;
    }

    public static int getTotalVehiculos() {
        return totalVehiculos;
    }

    public static double getTotalKmVehiculos() {
        return totalKmVehiculos;
    }

    public void kmTot(double km) {

        totalKmVehiculos += km;

    }
}