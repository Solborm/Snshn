/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5.logic;

import java.util.ArrayList;
import java.util.Arrays;
import task5.entity.ChristmasTree;
import task5.entity.Flashlights;
import task5.entity.Garlang;
import task5.entity.Product;
import task5.entity.Toys;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class GidTest {
    
    public GidTest() {
    }
       
    Product p1=new Flashlights(10,20,5,5);
    Product p2=new Garlang(12,"ffff",1,15,25);
    Product p3=new Toys("faaa","sssss",10,15);

    Product[] catalog={p1,p2,p3};
    ArrayList<Product> decorations= new ArrayList<>(Arrays.asList(catalog));
    ChristmasTree christmasTree =new ChristmasTree(1,"bbb","nnn",10,5,decorations);
    ChristmasTree christmasTree1 =null;
    
    @org.junit.Test
    public void testTotalWeight() {
        int expResult = 35;
        int result = Gid.totalWeight(christmasTree);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testTotalWeight1() {
        int expResult = 0;
        int result = Gid.totalWeight(christmasTree1);
        assertEquals(expResult, result);
    }
    /**
     * Test of totalPrice method, of class Gid.
     */
    @org.junit.Test
    public void testTotalPrice() {
        int expResult = 55;
        int result = Gid.totalPrice(christmasTree);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testTotalPrice1() {
        int expResult = 0;
        int result = Gid.totalPrice(christmasTree1);
        assertEquals(expResult, result);
    }
    /**
     * Test of maxPrice method, of class Gid.
     */
    @org.junit.Test
    public void testMaxPrice() {
        int expResult = 25;
        int result = Gid.maxPrice(christmasTree);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testMaxPrice1() {
        int expResult = 0;
        int result = Gid.maxPrice(christmasTree1);
        assertEquals(expResult, result);
    }
    
}
