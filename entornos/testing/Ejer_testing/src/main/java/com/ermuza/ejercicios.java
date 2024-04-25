package com.ermuza;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicios {

    public int suma(int a, int b){
        return a + b;
    }
    
    public int[] sort(int[] array){

        Arrays.sort(array);
        return array;

    }

    public double Average(int[] array){

        int sum = 0;
        for(int i = 0; i < array.length; i++){

            sum += array[i];

        }
        return (double) sum / array.length;
        
    }

    // busca un elemento en una array devuelve un -1 si no existe
    // devuelve la posición si existe
    public int binarySearch(int[] array, int key){

        int low = 0;
        int high = array.length -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key)  {
                return mid;
            }else if (array[mid] < key){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public double celsiusToFahrenheit(double celsius){

        return (celsius * 9 / 5) + 32;

    }
}
