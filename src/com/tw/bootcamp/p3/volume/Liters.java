package com.tw.bootcamp.p3.volume;

public class Liters extends Volume {
  public Liters(double value) {
    super(value);
  }

  @Override
  public boolean compare(ComparableByVolume other) {
    return other.compare(new Gallon(value / 3.78));
  }

}
