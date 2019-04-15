/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10.logic;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import lab10.entity.Product;
import lab10.entity.Chinaman;
import lab10.entity.Table;
import lab10.entity.Market;
import lab10.entity.Сupboard;

/**
 *
 * @author Lenovo
 */
public class GidTest {
    
    public GidTest() {
    
        
    }
    Product p1=new Table(10,"aaaa","ffff",20,"wwqe","rtr","bmn");
    Product p2=new Сupboard(12,15,"ggf",10,"hhwqe","tttt","eeee");


    Product[] catalog={p1,p2};
    ArrayList<Product> decorations= new ArrayList<>(Arrays.asList(catalog));
    Chinaman chinaman=new Chinaman("qwer","bbb","nnn","nnnn",decorations);
    Chinaman chinaman1 =null;
    /**
     * Test of totalPrice method, of class Gid.
     */
    @org.junit.Test
    public void testTotalPrice() {
        int expResult = 30;
        int result = Gid.totalPrice(chinaman);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testTotalPrice1() {
        int expResult = 0;
        int result = Gid.totalPrice(chinaman1);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testMaxPrice() {
    }

    
    
}
