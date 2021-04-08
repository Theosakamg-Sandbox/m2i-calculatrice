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
   * @param value1 first value.
   * @param value2 second value.
   * @return result of addition.
   */
  public int add(final int value1, final int value2) {
    return value1 + value2;
  }

  /**
   * Function Subtract two value.
   *
   * @param value1 first value.
   * @param value2 second value.
   * @return result of Subtraction.
   */
  public int sub(final int value1, final int value2) {
    return value1 - value2;
  }

  /**
   * Function Multiply two value.
   *
   * @param value1 first value.
   * @param value2 second value.
   * @return result of Multiplication.
   */
  public int mul(final int value1, final int value2) {
    return value1 * value2;
  }

  /**
   * Function Divide two value.
   *
   * @param value1 first value.
   * @param value2 second value.
   * @return result of Division.
   */
  public int div(final int value1, final int value2) {
    return value1 / value2;
  }

  /**
   * Check if Value is Pair.
   *
   * @param value2check value to check.
   * @return True if pair.
   */
  public boolean isPair(final int value2check) {
    return value2check % 2 == 0;
  }

}
