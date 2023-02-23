package jtext.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
  private Calculator calc;

  @BeforeEach
  void setUp() {
    calc = new Calculator();
  }

  @Test
  void canAddZeroPlusZero() {
    int sum = calc.add(0, 0);
    assertEquals(0, sum);
  }

  @Test
  void canAddOnePlusOne() {
    int sum = calc.add(1, 1);
    assertEquals(2, sum);
  }

  @Test
  void canAddNegativeOnePlusOne() {
    int sum = calc.add(-1, 1);
    assertEquals(0, sum);
  }

  @Test
  void canAddNegativeOnePlusNegativeOne() {
    int sum = calc.add(-1, -1);
    assertEquals(-2, sum);
  }

  @Test
  void annuityExample() {
    String answer = calc.Annuity("22000", 7, "0.06", 1);
    assertEquals("$184,664.43", answer, "Annuity example");
  }

  @Test
  void annuityExample2() {
    String answer = calc.Annuity("1200", 10, "0.08", 4);
    assertEquals("$72,482.38", answer, "Annuity example 2");
  }
}
