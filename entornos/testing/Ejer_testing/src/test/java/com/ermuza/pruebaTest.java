package com.ermuza;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaTest {
    
    //test data
    String str1 = new String("abc");
    String str2 = new String("abc");
    String str3 = null;
    String str4 = "abc";
    String str5 = "abc";

    int val1 = 5;
    int val2 = 6;

    String[] expectedArray = {"one", "two", "three" };
    String[] resultArray = {"one" , "two", "three"};

    @Test
    public void testTwoObjectAreEquals(){

        assertEquals(str1, str2);

    }

    @Test
    public void testConditionTrue(){

        assertTrue(val2 > val1);

    }

    @Test
    public void testConditionFalse(){

        assertFalse(val2 < val1);

    }

    @Test
    public void testObjectIsNotNull(){

        assertNotNull(expectedArray);

    }

    @Test
    public void testObjectIsNull(){

        assertNull(str3);

    }

    @Test
    public void testSomethingSame(){

        assertSame(str4, str5);

    }

    @Test
    public void testSomethingNotSame(){

        assertNotSame(str1, str3);

    }

    @Test
    public void testSomethingSameArray(){

        assertArrayEquals(expectedArray, resultArray);

    }

   


    
}
