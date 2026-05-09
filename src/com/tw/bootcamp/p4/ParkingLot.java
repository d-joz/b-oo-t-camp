package com.tw.bootcamp.p4;

import java.util.ArrayList;

//extent arrayList later
public class ParkingLot {

  private final int capacity;
  private final ArrayList<Object> lot;

  public ParkingLot(int capacity) {
    this.capacity = capacity;
    lot = new ArrayList<>(capacity);
  }

  public boolean park(Car car) {
    if (isFull()) {
      return false;
    }
    return lot.add(car);
  }

  public boolean isFull() {
    return lot.size() >= capacity;
  }
}
