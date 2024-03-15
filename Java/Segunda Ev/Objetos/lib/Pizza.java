package lib;
public class Pizza {
    
    private String tipo;
    private String tamaño;
  

    private String estado = "";

    public Pizza(String tipo , String tamaño) {

        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "servida";
        this.contadorPizzas++;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String sirve (Pizza pizza){

        contadorPizzasServidas++;
        return pizza + ", servida";


    }
    public static int getTotalPedidas (){

        return contadorPizzas;

    }
    public int getTotalServidas(){

        return contadorPizzasServidas;

    }
}
