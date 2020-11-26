package org.example;

import calculer.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * TEST UNITAIRE.
 */
public class CalculatorTest
{
    Calculator calculator ;
    @Before
    public  void setUp() throws  Exception {
        calculator = new Calculator();
    }
    @Test
    public  void TestSum() {
        int result = calculator.sum(3,3);
        Assert.assertEquals(6,result);
    }
    @Test
    public  void  Testminus() {
        Assert.assertEquals(0,calculator.minus(2,2));
    }
    @Test
    public  void Testdivide() {
        Assert.assertEquals(2,calculator.divide(4,2));
    }
    @Test
    public void Testmultiply() {
        Assert.assertEquals(4,calculator.multiply(2,2));
    }
    @Test
    public void TestMin() {
        int min = calculator.min(10,20);
        if (min != 10) Assert.fail();
    }
    @Test
    public void TestMax() {
        int max = calculator.max(2000, -200);
        Assert.assertEquals(2000,max);
    }
    @Test
    public  void TestMaxElement() {
        int TabMax[] = { 4,10,9,30,20,41,50};
        int TMax = calculator.maxElement(TabMax);
        Assert.assertEquals(50,TMax);
    }
    @Test
    public  void TestMinElement() {
        int TabMin[] = {2,1,5,8,9,10};
        int TMin = calculator.minElement(TabMin);
        Assert.assertEquals(1,TMin);
    }


}
