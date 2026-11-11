package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    @DisplayName("Valid equilateral triangle should return true")
    public void testValidEquilateralTriangle() {
        assertTrue(Triangle.isEquilateral(5.0, 5.0, 5.0), 
            "Sides 5.0, 5.0, 5.0 should form an equilateral triangle");
    }

    @Test
    @DisplayName("Triangle with non-equal sides should return false")
    public void testNonEquilateralTriangle() {
        assertFalse(Triangle.isEquilateral(5.0, 5.0, 3.0), 
            "Sides 5.0, 5.0, 3.0 are not equilateral");
        assertFalse(Triangle.isEquilateral(4.0, 5.0, 6.0), 
            "Sides 4.0, 5.0, 6.0 are not equilateral");
    }

    @Test
    @DisplayName("Sides equal to zero should return false")
    public void testZeroSides() {
        assertFalse(Triangle.isEquilateral(0, 0, 0), 
            "Zero length sides are invalid for a triangle");
    }

    @Test
    @DisplayName("Negative side lengths should return false")
    public void testNegativeSides() {
        assertFalse(Triangle.isEquilateral(-5.0, -5.0, -5.0), 
            "Negative side lengths are invalid for a triangle");
    }

    @Test
    @DisplayName("Floating point side lengths should work correctly")
    public void testDecimalEquilateralTriangle() {
        assertTrue(Triangle.isEquilateral(2.5, 2.5, 2.5), 
            "Decimal side lengths 2.5, 2.5, 2.5 should form an equilateral triangle");
    }
}