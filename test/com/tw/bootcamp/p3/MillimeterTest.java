package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillimeterTest {
  @Test
  void shouldConvert1OMMTo1Cm() {
    Millimeter millimeter = new Millimeter(10);
    Centimeters centimeters = new Centimeters(1);
    assertEquals(millimeter,centimeters);
  }
  @Test
  void shouldConvert1OMMTo10MM() {
    Millimeter millimeter1 = new Millimeter(10);
    Millimeter millimeter2 = new Millimeter(10);
    assertEquals(millimeter1,millimeter2);
  }
}