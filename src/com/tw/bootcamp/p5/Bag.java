package com.tw.bootcamp.p5;


import java.util.HashMap;
import java.util.Map;

public class Bag extends HashMap<Ball, Integer> {
  private final int capacity;
  private int occupancy;

  public Bag(int capacity) {
    this.capacity = capacity;
    this.occupancy = 0;

    put(Ball.RED,0);
    put(Ball.BLUE,0);
    put(Ball.YELLOW,0);
    put(Ball.GREEN,0);
  }

  public boolean add(Ball ball) {
    if (occupancy >= capacity) {
     return false;
    }

    Integer greenBalls = get(Ball.GREEN);
    if (ball == Ball.GREEN && greenBalls >= 3) {
     return  false;
    }

    Integer redBalls = get(Ball.RED);
    if (ball ==Ball.RED && redBalls >= greenBalls * 2) {
     return  false;
    }

    Integer yellowBalls = get(Ball.YELLOW);
    if (ball == Ball.YELLOW && yellowBalls >= occupancy * 0.4) {
      return false;
    }

    compute(ball, (k, balls) -> balls + 1);

    occupancy++;
    return true;
  }
}
