package com.tw.bootcamp.p3;

import com.tw.bootcamp.p3.volume.Gallon;
import com.tw.bootcamp.p3.volume.Liters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GallonTest {
  @Test
  void shouldCompare1GallonToEquivalentLiters() {
    Gallon gallon = new Gallon(1.0);
    Liters liters = new Liters(3.78);

    assertEquals(gallon, liters);
  }
}