package com.tw.bootcamp.p5;


public class Bag  {
  private final int capacity;
  private int occupancy;

  public Bag(int capacity) {
    this.capacity = capacity;
    this.occupancy = 0;
  }

  public boolean add(Ball ball) {
    if (occupancy >= capacity) {
     return false;
    }
    occupancy++;
    return true;
  }
}
