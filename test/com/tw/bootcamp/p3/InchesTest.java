package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesTest {
  @Test
  void comparesAnInchToAFeet() {
    Feet feet = new Feet(1.0);
    Inches inches = new Inches(12.0);
    assertEquals(inches,feet);
  }

  @Test
  void comparesAInchToAInch() {
    Inches inches1 = new Inches(1.0);
    Inches inches2 = new Inches(1.0);
    assertEquals(inches1, inches2);
  }

}