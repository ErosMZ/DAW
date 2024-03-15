package lib;
public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public Tiempo suma(Tiempo tiempo) {
        
        int totalHoras = this.horas + tiempo.getHoras();
        int totalMinutos = this.minutos + tiempo.getMinutos();
        int totalSegundos = this.segundos + tiempo.getSegundos();
    
        while (totalSegundos >= 60) {
            totalSegundos -= 60;
            totalMinutos++;
        }
    
        while (totalMinutos >= 60) {
            totalMinutos -= 60;
            totalHoras++;
        }
    
        return new Tiempo(totalHoras, totalMinutos, totalSegundos);
    }

    public Tiempo resta(Tiempo tiempo) {
        int totalHoras = this.horas - tiempo.getHoras();
        int totalMinutos = this.minutos - tiempo.getMinutos();
        int totalSegundos = this.segundos - tiempo.getSegundos();

        
        while (totalSegundos < 0) {

            totalSegundos += 60;
            totalMinutos--;

        }

        while (totalMinutos < 0) {

            totalMinutos += 60;
            totalHoras--;

        }

        
        if (totalHoras < 0) {

            return new Tiempo(0, 0, 0);

        }

        return new Tiempo(totalHoras, totalMinutos, totalSegundos);

    }

    public String toString() {

        return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
        
    }

    
}
