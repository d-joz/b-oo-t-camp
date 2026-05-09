package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

  @Test
  void shouldCreateAParkingSystem() {
    ParkingSystem parkingSystem = new ParkingSystem();
    boolean isAdded = parkingSystem.add(new ParkingLot(1));

    assertTrue(isAdded);
  }
}