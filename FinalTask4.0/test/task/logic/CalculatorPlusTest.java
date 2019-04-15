/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import task.model.Matrix;

/**
 *
 * @author Lenovo
 */
public class CalculatorPlusTest {
    
    public CalculatorPlusTest() {
    }

    /**
     * Test of reverse method, of class CalculatorPlus.
     */
    @Test
    public void testReverse() {
        Matrix matrix = new Matrix(new int[][] {
            {7,1,2,3},
            {1,4,4,5},
            {2,4,9,6},
            {3,5,6,1}
        });
        int expResult = 9;
        int result = CalculatorPlus.reverse(matrix);
        assertEquals(expResult, result);
        
        
    }
    
    
     @Test
    public void testReverse1() {
        Matrix matrix = new Matrix(new int[][] {
            {7,1,2},
            {1,4,4},
            {3,5,6}
        });
        int expResult = 7;
        int result = CalculatorPlus.reverse(matrix);
        assertEquals(expResult, result);
        
        
    }
    
    @Test
    public void testReverse2() {
        int expResult = -1;
        int result = CalculatorPlus.reverse(null);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverse3(){
        Matrix matrix = new Matrix();
        int expResult = 0;
        int result = CalculatorPlus.reverse(matrix);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverse4(){
        Matrix matrix = new Matrix(new int[][] {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        });
        int expResult = 0;
        int result = CalculatorPlus.reverse(matrix);
        assertEquals(expResult, result);
    }
}
