package com.tw.bootcamp.p3;

import java.util.Objects;

public class Centimeters implements ConvertableToInches{
  public final double value;
  public Centimeters(double value) {
    this.value = value;
  }

  @Override
  public Inches convertToInches() {
    return new Inches(value / 2.5);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ConvertableToInches convertable) {
      return convertToInches().value == (convertable.convertToInches()).value;
    }
    if (!(o instanceof Centimeters that)) return false;
    return Double.compare(value, that.value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
