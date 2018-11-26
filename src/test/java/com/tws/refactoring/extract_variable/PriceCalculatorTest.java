package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void test_get_price(){
        PriceCalculator priceCalculator=new PriceCalculator();
        double result=priceCalculator.getPrice(3,5);
        assertEquals(16.5,result,0.001);
    }

    @Test
    public void test_get_price_quantity_larger_than_500(){
        PriceCalculator priceCalculator=new PriceCalculator();
        double result=priceCalculator.getPrice(600,10);
        assertEquals(6050,result,0.001);
    }
}
