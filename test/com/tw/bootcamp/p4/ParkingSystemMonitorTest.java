package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemMonitorTest {

  @Test
  void shouldDisplayTheStatusOfParkingSystem() {
    ParkingLot parkingLot1 = new ParkingLot(2);
    ParkingLot parkingLot2 = new ParkingLot(3);
    ParkingSystem parkingSystem = new ParkingSystem();
    parkingSystem.add(parkingLot1);
    parkingSystem.add(parkingLot2);
    new ParkingSystemMonitor(parkingSystem);
  }
}