package com.tw.bootcamp.p3.temperature;

import java.util.Objects;

public class Temperature {
  private final double value;
  private final TemperatureUnit unit;

  public Temperature(double value, TemperatureUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Temperature createCelsius(double value) {
    return new Temperature(value, TemperatureUnit.CELSIUS);
  }

  public static Temperature createFahrenheit(double value) {
    return new Temperature(value, TemperatureUnit.FAHRENHEIT);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Temperature that)) return false;
    return Double.compare( unit.convertor.covert(value) , that.unit.convertor.covert(that.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    return  String.format("%s %S",value , unit);
  }
}
