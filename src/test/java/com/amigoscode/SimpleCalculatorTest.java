package com.amigoscode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    public void twoPlusTwoShouldEqualfour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, SimpleCalculator.add(2,2));
    }

}