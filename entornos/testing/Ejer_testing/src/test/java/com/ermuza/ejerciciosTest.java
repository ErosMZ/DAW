package com.ermuza;
import java.util.Arrays;
import static org.junit.Assert.*;


import org.junit.Test;

public class ejerciciosTest {
    
    @Test
    public void testSuma(){

        ejercicios ej = new ejercicios();

        assertEquals(5, ej.suma(3, 2));
        assertEquals(3, ej.suma(1, 2));
        assertEquals(7, ej.suma(3, 4));
        assertEquals(8, ej.suma(4, 4));
        assertNotEquals(6, ej.suma(3, 2));
        assertNotEquals(5, ej.suma(1, 2));
        assertNotEquals(6, ej.suma(3, 6));
        assertNotEquals(1, ej.suma(1, 2));

    }

    @Test
    public void testSort(){

        ejercicios ej = new ejercicios();

        assertArrayEquals(new int [] {1,2,3,4,5}, ej.sort(new int[] {5,4,3,2,1}));
        assertArrayEquals(new int [] {-2,-1,0,7}, ej.sort(new int[] {0,7,-2,-1}));
    }

    
    @Test
    public void TestAverage(){
        ejercicios ej = new ejercicios();

        assertEquals(2.5, ej.Average(new int[] {1,2,3,4}), 0.0);
        assertEquals(3, ej.Average(new int[] {3,3,3}), 0.0);
        assertNotEquals(2.6, ej.Average(new int[] {1,2,3,4}), 0.0);
        assertEquals(-5, ej.Average(new int[] {-5,-5}), 0.0);
    }

    @Test
    public void TestBinarySearch(){
        ejercicios ej = new ejercicios();
        // en este caso si existe ese numero en la array asi que
        // será mayor que 0 ya que devolverá la posición del número
        assertTrue(ej.binarySearch(new int[] {1,2,3}, 3 )>=0);

        // en este caso no coincide entoces devolveŕa un número el -1
        assertTrue(ej.binarySearch(new int[] {1,2,3}, 4 )<=0);

        assertFalse(ej.binarySearch(new int[] {1,2,3,-4}, 4)>=0);
        assertFalse(ej.binarySearch(new int[] {1,2,3,-4}, 2)<=0);

        assertEquals(ej.binarySearch(new int[] {1,2,3,-4}, 6), -1);
        assertNotEquals(ej.binarySearch(new int[] {1,2,3,4}, 1), -1);
    
    }

    @Test
    public void TestcelsiusToFahrenheit(){

        ejercicios ej = new ejercicios();

        assertEquals(ej.celsiusToFahrenheit(0), 32 , 0.0);
        assertNotEquals(ej.celsiusToFahrenheit(1), 0);
    }
}
