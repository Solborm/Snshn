/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.logic;

import org.junit.Test;
import task.model.Matrix;
import task.logic.Calculator;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of simmetry method, of class Calculator.
     */
    @Test
    public void testSimmetry() {
        Matrix matrix = new Matrix(new int[][] {
            {7,1,2,3},
            {1,4,4,5},
            {2,4,9,6},
            {3,5,6,1}
    });
        boolean expResult=true;
        boolean result = Calculator.simmetry(matrix);
        assertEquals(expResult, result);
    }
    
}
