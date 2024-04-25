package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;
public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator cal = new Calculator();

        // Si es igual a 2 suma de positivos
        assertEquals(2 ,cal.add(1, 1));

        // Si no es igual a dos, si no es igual a 5
        assertNotEquals(5 , cal.add(2, 2));

        // Suma con negativos, si es igual a -4
        assertEquals(-4 , cal.add(-2, -2));

        // Si es negativo y suma entre negativos y positivos
        assertTrue(0 > cal.add(-4, 2));

        // Si es positivo y suma entre negativos y positivos
        assertTrue( 0 < cal.add(-4, 5));

        // Si no es mayor que tres
        assertFalse(3 < cal.add(1, 1));
    }

    @Test
    public void testSubstract(){
        Calculator cal = new Calculator();

        // Si es igual a 0, resta de positivos
        assertEquals(0, cal.subtract(3, 3));

        // Si no es igual a 1, suma de positivos
        assertNotEquals(1 , cal.subtract(5, 3));

        // 
        assertEquals(6, cal.subtract(4, -2));
        assertNotEquals(-5 ,cal.subtract(-4, -1));
        assertTrue(0 > cal.subtract(5,6));
        assertFalse(0 > cal.subtract(5,-6));
        
    }

    @Test
    public void testMultily(){

        Calculator cal = new Calculator();

        assertEquals(0, cal.multiply(0, 0));
        assertEquals(4, cal.multiply(2, 2));
        assertNotEquals(5, cal.multiply(5, 3));
        assertEquals(-30, cal.multiply(15, -2));
        assertTrue(-24 > cal.multiply(5, -5));
        assertFalse(5 > cal.multiply(2, 5));
        assertNotEquals(3, cal.multiply(-5, -67));
    }

    @Test
    public void testDivide(){

        Calculator cal = new Calculator();

        assertEquals(2.5, cal.divide(5, 2),0.0);
        assertEquals(-5, cal.divide(10, -2),0.0);
        assertNotEquals(6, cal.divide(-10, -58));
        assertNotEquals(3, cal.divide(-6, 3));
        assertTrue(-24 < cal.divide(5, -5));
        assertFalse(5 <= cal.divide(2, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {

        Calculator cal = new Calculator();
        cal.divide(5, 0);

    }
}
