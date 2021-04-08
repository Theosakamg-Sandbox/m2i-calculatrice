package com.m2i.devops;

/**
 * Calculator engine class.
 * Provide many function...
 *
 * @author Mickael Gaillard
 * @version 1.0
 */
public class Calculator {

  /**
   * Function Add two value.
   *
   * @param a first value.
   * @param b second value.
   * @return result of addition.
   */
  public int add(int a, int b) {
    return a + b;
  }

  /**
   * Function Subtract two value.
   *
   * @param a first value.
   * @param b second value.
   * @return result of Subtraction.
   */
  public int sub(int a, int b) {
    return a - b;
  }

  /**
   * Function Multiply two value.
   *
   * @param a first value.
   * @param b second value.
   * @return result of Multiplication.
   */
  public int mul(int a, int b) {
    return a * b;
  }

  /**
   * Function Divide two value.
   *
   * @param a first value.
   * @param b second value.
   * @return result of Division.
   */
  public int div(int a, int b) {
    return a / b;
  }

  /**
   * Check if Value is Pair.
   *
   * @param a value to check.
   * @return True if pair.
   */
  public boolean isPair(int a) {
    return (a % 2) == 0;
  }

}
