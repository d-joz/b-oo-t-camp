package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  public void shouldCalculateAreaFor10By5Rectangle() {
    Rectangle rectangle = new Rectangle(10,5);
    int area = rectangle.area();

    assertEquals(50, area);
  }

  @Test
  void shouldReturnAreaOf1By1() {
    Rectangle rectangle = new Rectangle(1, 1);
    assertEquals(1, rectangle.area());
  }


}