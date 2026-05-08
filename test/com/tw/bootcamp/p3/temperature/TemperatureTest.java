package com.tw.bootcamp.p3.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {
  @Test
  void shouldCompareFahrenheitWithCelsius() {
    Temperature celsius = Temperature.createCelsius(100);
    Temperature fahrenheit = Temperature.createFahrenheit(212);

    assertEquals(fahrenheit,celsius);
  }
}