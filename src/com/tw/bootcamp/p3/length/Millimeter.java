package com.tw.bootcamp.p3.length;

public class Millimeter extends Length {
  public Millimeter(double value) {
    super(value);
  }

  @Override
  public boolean compare(ComparableByLength other) {
    return other.compare(new Inches(value / 25));
  }
}
