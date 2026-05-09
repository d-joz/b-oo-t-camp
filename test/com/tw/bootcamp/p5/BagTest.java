package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  @Test
  void createsABagAndAddsOne() {
    Bag bag = new Bag(1);
    Ball ball = new Ball();
    boolean added = bag.add(ball);
    assertTrue(added);
  }

   @Test
  void createsABagAndAddsOnFailsToAddBall() {
    Bag bag = new Bag(1);
    Ball ball1 = new Ball();
    Ball ball2 = new Ball();
    boolean addedBall1 = bag.add(ball1);
    boolean addedBall2 = bag.add(ball2);
    assertTrue(addedBall1);
    assertFalse(addedBall2);
  }


}