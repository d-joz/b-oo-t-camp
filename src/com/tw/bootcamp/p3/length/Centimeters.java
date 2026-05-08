package com.tw.bootcamp.p3.length;

public class Centimeters extends Length {
  public Centimeters(double value) {
    super(value);
  }

  @Override
  public boolean compare(ComparableByLength other) {
    return other.compare(new Inches(value / 2.5));
  }
}
