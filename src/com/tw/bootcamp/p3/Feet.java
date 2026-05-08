package com.tw.bootcamp.p3;

import java.util.Objects;

public class Feet {
  public final double value;

  public Feet(double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if(o instanceof  Inches inches){
      return value * 12 == inches.value;
    }
    if (!(o instanceof Feet feet)) return false;
    return Double.compare(value, feet.value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
