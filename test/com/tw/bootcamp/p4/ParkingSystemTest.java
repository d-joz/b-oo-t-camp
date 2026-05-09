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

  @Test
  void shouldParkACarInSpecificParkingLot() {
    ParkingSystem parkingSystem = new ParkingSystem();
    boolean isAdded = parkingSystem.add(new ParkingLot(1));
    boolean isParked = parkingSystem.park(new Car());

    assertTrue(isParked);
  }

  @Test
  void shouldFailToParkACarInAFilledParkingSystem() {
    ParkingSystem parkingSystem = new ParkingSystem();
    parkingSystem.add(new ParkingLot(1));
    boolean isParked1 = parkingSystem.park(new Car());
    boolean isParked2 = parkingSystem.park(new Car());

    assertTrue(isParked1);
    assertFalse(isParked2);
  }

  @Test
  void shouldParkCarInAParkingSystemWith2Lots() {
    ParkingSystem parkingSystem = new ParkingSystem();
    parkingSystem.add(new ParkingLot(1));
    parkingSystem.add(new ParkingLot(1));
    boolean isParked1 = parkingSystem.park(new Car());
    boolean isParked2 = parkingSystem.park(new Car());

    assertTrue(isParked1);
    assertTrue(isParked2);
  }
  @Test
  void shouldFailToParkCarInAParkingSystemWith2FilledParkingLots() {
    ParkingSystem parkingSystem = new ParkingSystem();
    parkingSystem.add(new ParkingLot(1));
    parkingSystem.add(new ParkingLot(1));
    boolean isParked1 = parkingSystem.park(new Car());
    boolean isParked2 = parkingSystem.park(new Car());
    boolean isParked3 = parkingSystem.park(new Car());


    assertTrue(isParked1);
    assertTrue(isParked2);
    assertFalse(isParked3);
  }


}