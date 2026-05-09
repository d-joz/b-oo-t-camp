package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BagTest {
  @Test
  void createsABagAndAddsOne() {
    Bag bag = new Bag(1);
    boolean added = bag.add(Ball.BLUE);
    assertTrue(added);
  }

  @Test
  void createsABagAndAddsOnFailsToAddBall() {
    Bag bag = new Bag(1);
    bag.add(Ball.BLUE);
    boolean addedBall2 = bag.add(Ball.GREEN);

    assertFalse(addedBall2);
  }

  @Test
  void shouldFailToAddMoreThan3GreenBAlls() {
    Bag bag = new Bag(12);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    boolean addedBall2 = bag.add(Ball.GREEN);
    System.out.println(bag);
    assertFalse(addedBall2);
  }

  @Test
  void shouldFailToAddMoreThan2RedBallsSince1GreenIsPresent() {
    Bag bag = new Bag(12);
    bag.add(Ball.GREEN);
    bag.add(Ball.RED);
    bag.add(Ball.RED);
    boolean added = bag.add(Ball.RED);
    assertFalse(added);
  }

  @Test
  void shouldFailToAddMoreThan2YellowBallsSince5BallsPresent() {
    Bag bag = new Bag(12);
    bag.add(Ball.GREEN);
    bag.add(Ball.RED);
    bag.add(Ball.RED);
    bag.add(Ball.YELLOW);
    bag.add(Ball.YELLOW);
    boolean added = bag.add(Ball.YELLOW);
    System.out.println(bag);
    assertFalse(added);
  }
}