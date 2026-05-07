package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
  @Test
  public void shouldCalculateAreaFor10By5Rectangle() {
    Rectangle rectangle = Rectangle.create(10, 5);
    double area = rectangle.area();

    assertEquals(50, area);
  }

  @Test
  void shouldReturnAreaOf1By1() {
    Rectangle rectangle = Rectangle.create(1, 1);
    assertEquals(1, rectangle.area());
  }

  @Test
  void shouldReturnAPerimeterOf24() {
    Rectangle rectangle = Rectangle.create(4, 4);
    assertEquals(16, rectangle.perimeter());
  }

  @Test
  void shouldReturnAPerimeterOf4OfaRectOf1By1() {
    Rectangle rectangle = Rectangle.create(1, 1);
    assertEquals(4, rectangle.perimeter());
  }
}