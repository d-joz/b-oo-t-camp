package com.tw.bootcamp.p3;

import com.tw.bootcamp.p3.length.Centimeters;
import com.tw.bootcamp.p3.length.Inches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimetersTest {
  @Test
  void comparesCMTo1Inch() {
    Centimeters centimeters = new Centimeters(2.5);
    Inches inches = new Inches(1);
    assertEquals(centimeters,inches);
  }

  @Test
  void compares5cmTo2Inch() {
    Centimeters centimeters = new Centimeters(5);
    Inches inches = new Inches(2);
    assertEquals(inches,centimeters);
    assertEquals(centimeters,inches);
  }
}