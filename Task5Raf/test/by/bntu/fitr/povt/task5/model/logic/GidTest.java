/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.task5.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import by.bntu.fitr.povt.task5.model.entity.Chef;
import by.bntu.fitr.povt.task5.model.entity.Cucumber;
import by.bntu.fitr.povt.task5.model.entity.Onion;
import by.bntu.fitr.povt.task5.model.entity.Potato;
import by.bntu.fitr.povt.task5.model.entity.Product;
import by.bntu.fitr.povt.task5.model.entity.Tomato;
/**
 *
 * @author Lenovo
 */
public class GidTest {
    
    public GidTest() {
    }

    Product p1=new Cucumber(10,10,10);
    Product p2=new Onion("red",5,5);
    Product p3=new Potato(1,10,15);
    Product p4=new Tomato("gniloy",20,20);
    
    Product[] ingrigients={p1,p2,p3,p4};
    Product[] ingrigients2={};
    Chef chif1=new Chef("Raf",ingrigients);
    Chef chif2=null;
    Chef chif3=new Chef();
    Chef chif4=new Chef("vasil",ingrigients2);
    
    @Test
    public void testTotalWeightSalt() {
    
        int expResult = 45;
        int result = Gid.totalWeightSalt(chif1);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalWeightSalt1() {
    
        int expResult = 0;
        int result = Gid.totalWeightSalt(chif2);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalWeightSalt2() {
    
        int expResult = 0;
        int result = Gid.totalWeightSalt(chif3);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalWeightSalt3() {
    
        int expResult = 0;
        int result = Gid.totalWeightSalt(chif4);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalCaloriesSalt() {
        int expResult = 50;
        int result = Gid.totalCaloriesSalt(chif1);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalCaloriesSalt1() {
        int expResult = 0;
        int result = Gid.totalCaloriesSalt(chif2);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalCaloriesSalt2() {
        int expResult = 0;
        int result = Gid.totalCaloriesSalt(chif3);
        assertEquals(expResult,result);
    }
    @Test
    public void testTotalCaloriesSalt3() {
        int expResult = 0;
        int result = Gid.totalCaloriesSalt(chif4);
        assertEquals(expResult,result);
    }
}
