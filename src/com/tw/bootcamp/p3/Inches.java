package com.tw.bootcamp.p3;

import java.util.Objects;

public class Inches {
  public final double value;

  public Inches(double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {

    if (o instanceof Feet feet) {
      return value == feet.value * 12;
    }
    if (!(o instanceof Inches inches)) return false;
    return Double.compare(value, inches.value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
