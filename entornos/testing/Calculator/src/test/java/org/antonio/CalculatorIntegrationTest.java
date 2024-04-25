package org.antonio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculatorIntegrationTest {

    @Test
    public void testAddAndSubstract(){

        Calculator cal = new Calculator();

        assertEquals(5, cal.add(1, cal.subtract(4, 8)));
        assertNotEquals(5, cal.add(2, cal.subtract(4, 10)));

    }
}
