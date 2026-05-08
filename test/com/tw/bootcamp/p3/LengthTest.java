package com.tw.bootcamp.p3;

import com.tw.bootcamp.p3.length.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthTest {
  @Test
  void comparesAnInchToAFeet() {
    Length feet = Length.createFeet(1);
    Length inches = Length.createInch(12);
    System.out.println(inches);
    System.out.println(feet);
    assertEquals(inches, feet);
  }

  @Test
  void comparesAInchToAInch() {
    Length inches1 = Length.createInch(1.0);
    Length inches2 = Length.createInch(1.0);
    assertEquals(inches1, inches2);
  }

  @Test
  void shouldConvert1OMMTo1Cm() {
    Length millimeter = Length.createMillimeter(10.0);
    Length centimeters = Length.createCentimeter(1);
    assertEquals(millimeter, centimeters);
  }

  @Test
  void shouldConvert1OMMTo10MM() {
    Length millimeter1 = Length.createMillimeter(10);
    Length millimeter2 = Length.createMillimeter(10);
    assertEquals(millimeter1, millimeter2);
  }

  @Test
  void comparesAFootToAnInch() {
    Length feet = Length.createFeet(1.0);
    Length inches = Length.createInch(12.0);
    assertEquals(feet, inches);
  }

  @Test
  void comparesAFootToAFoot() {
    Length feet1 = Length.createFeet(1.0);
    Length feet2 = Length.createFeet(1.0);
    assertEquals(feet1, feet2);
  }

  @Test
  void comparesCMTo1Inch() {
    Length centimeters = Length.createCentimeter(2.54);
    Length inches = Length.createInch(1);
    assertEquals(centimeters, inches);
  }

  @Test
  void compares5cmTo2Inch() {
    Length centimeters = Length.createCentimeter(5.08);
    Length inches = Length.createInch(2);
    assertEquals(inches, centimeters);
    assertEquals(centimeters, inches);
  }


//  addition


  @Test
  void shouldAdd2InAnd2In() {
    Length inch1 = Length.createInch(2);
    Length inch2 = Length.createInch(2);

    Length expected = Length.createInch(4);

    assertEquals(expected, inch1.add(inch2));
  }

  @Test
  void shouldAdd2InchesWith2Point5CM() {
    Length inch = Length.createInch(2);
    Length centimeter = Length.createCentimeter(2.54);

    Length expected = Length.createInch(3);

    assertEquals(expected, inch.add(centimeter));
  }
}