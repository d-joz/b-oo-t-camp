package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BagTest {
  @Test
  void createsABagAndAddsOne() {
    Bag bag = new Bag(1);
    Ball ball = new Ball(Color.BLUE);
    boolean added = bag.add(ball);
    assertTrue(added);
  }

  @Test
  void createsABagAndAddsOnFailsToAddBall() {
    Bag bag = new Bag(1);
    Ball ball1 = new Ball(Color.BLUE);
    Ball ball2 = new Ball(Color.GREEN);
    bag.add(ball1);
    boolean addedBall2 = bag.add(ball2);

    assertFalse(addedBall2);
  }


}