package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {

  @Test
  void shouldParkACarInParkingLot() {
    ParkingLot parkingLot = new ParkingLot(1);
    Car car = new Car();
    boolean isParked = parkingLot.park(car);

    assertTrue(isParked);
  }

  @Test
  void shouldReturnTheParkingLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(1);
    parkingLot.park(new Car());

    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldReturnTheParkingLotIsNotFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    assertFalse(parkingLot.isFull());
  }
}