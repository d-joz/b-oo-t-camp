package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingSystem {
  private final ArrayList<ParkingLot> parkingLots;

  ParkingSystem(){
    parkingLots = new ArrayList<>();
  }
  public boolean add(ParkingLot parkingLot) {
    return parkingLots.add(parkingLot);
  }
}
