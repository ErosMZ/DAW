package TrimestreDos.objetos;

public class Cafetera {
    
    private int capacidad_max;
    private int capacidad_Actual;

    /*METODOS*/
    
    public Cafetera(){

        this.capacidad_max = 1000;
        this.capacidad_Actual = 0;

    }

    public Cafetera(int cantidadMax){

        this.capacidad_Actual =cantidadMax;

    }
    public Cafetera(int cantidadMax , int cantidadActual){

        cantidadMax = 1000;
        if (cantidadActual>cantidadMax) {
            
            this.capacidad_Actual = cantidadMax;
        }   

    }

    /*GETTERS Y SETTERS*/

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getCapacidad_Actual() {
        return capacidad_Actual;
    }

    public void setCapacidad_Actual(int capacidad_Actual) {
        this.capacidad_Actual = capacidad_Actual;
    }
    public int llenarCafetera(){

        return capacidad_Actual = this.capacidad_max;

    }
    public int servirTaza(int deCuantoesLaTaza){

        if (deCuantoesLaTaza>capacidad_Actual){

            deCuantoesLaTaza = capacidad_Actual;
            capacidad_Actual=0;
        }else{

            capacidad_Actual=- deCuantoesLaTaza;

        }
        return  capacidad_Actual;
    }
    public int vaciarCafetera(){

        this.capacidad_Actual = 0;
        return  capacidad_Actual;

    }
    public int agregarCafe(int cafeAponer){

        int capacidad_total = cafeAponer + capacidad_Actual;

        if (capacidad_total > capacidad_max){

            int sobra = capacidad_total -capacidad_max;

            System.out.printf("Sobra " + sobra);

            capacidad_Actual = capacidad_max;

        }else{

            capacidad_Actual =+ cafeAponer;

        }
        return capacidad_Actual;


    }
}

