package com.tw.bootcamp.p3;

import com.tw.bootcamp.p3.volume.Volume;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GallonTest {
  @Test
  void shouldCompare1GallonToEquivalentLiters() {
    Volume gallon = Volume.createGallon(1.0);
    Volume liters = Volume.createLiters(3.78);

    assertEquals(gallon, liters);
  }

  @Test
  void shouldAddGallonAndLiters() {

    Volume gallon = Volume.createGallon(1);
    Volume liters = Volume.createLiters(1);

    Volume expected = Volume.createLiters(4.78);

    assertEquals(expected, liters.add(gallon));
  }
}