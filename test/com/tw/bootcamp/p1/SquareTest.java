package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
  @Test
  void shouldReturnSquareArea() {
    Square square = Square.create(4);
    assertEquals(16, square.area());
  }
}