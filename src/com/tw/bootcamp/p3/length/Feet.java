package com.tw.bootcamp.p3.length;

public final class Feet extends Length {

  public Feet(double value) {
    super(value);
  }

  @Override
  public boolean compare(ComparableByLength other) {
    return other.compare(new Inches(value * 12));
  }


}
