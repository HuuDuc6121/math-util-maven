/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.akt.mathutil.core;

import org.akt.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(120, MathUtil.getFactorial(5));
    }
    
}
