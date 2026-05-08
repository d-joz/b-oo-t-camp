package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeetTest {
  @Test
  void comparesAFootToAnInch() {
    Feet feet = new Feet(1.0);
    Inches inches = new Inches(12.0);
    assertEquals(feet,inches);
  }

  @Test
  void comparesAFootToAFoot() {
    Feet feet1 = new Feet(1.0);
    Feet feet2 = new Feet(1.0);
    assertEquals(feet1, feet2);
  }
}