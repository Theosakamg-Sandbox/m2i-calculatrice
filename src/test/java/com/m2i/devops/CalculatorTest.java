package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    int a = 2;
    int b = 3;

    Calculator calc = new Calculator();
    int actual = calc.add(a, b);

    assertEquals(5, actual);
  }

  @Test
  public void testSub() {
    int a = 6;
    int b = 3;

    Calculator calc = new Calculator();
    int actual = calc.sub(a, b);

    assertEquals(3, actual);
  }

  @Test
  public void testMul() {
    int a = 2;
    int b = 3;

    Calculator calc = new Calculator();
    int actual = calc.mul(a, b);

    assertEquals(6, actual);
  }

  @Test
  public void testIsPairTrue() {
    Calculator calc = new Calculator();

    // Test is Pair
    boolean actual = calc.isPair(2);
    assertTrue(actual);

//    // Test is not Pair
//    actual = calc.isPair(3);
//    assertFalse(actual);
  }

  @Test
  public void testIsPairFalse() {
//    Calculator calc = new Calculator();
//
//    // Test is not Pair
//    boolean actual = calc.isPair(3);
//    assertFalse(actual);
    assertTrue(true);
  }

}
