package com.tw.bootcamp.p5;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BallTest {
  @Test
  void createsAColoredBall() {
    Ball ball = new Ball(Color.BLUE);
    assertEquals(new Ball(Color.BLUE), ball);
  }
}