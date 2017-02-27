package com.simplon.LowerUpperString;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

/**
 * Unit test for simple LowerUpperString.
 */
public class LowerUpperStringTest{

    @Test
    public void LowerUpperStringTest() {
        //set
        LowerUpperString lowerUpperStringTest = new LowerUpperString();
        //test
        String result = lowerUpperStringTest.getlowerUpperString("altERnaTIng cAsE");
        //assert
        assertEquals("ALTerNAtiNG CaSe",result);
    }

}
