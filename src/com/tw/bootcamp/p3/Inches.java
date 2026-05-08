package com.tw.bootcamp.p3;

import java.util.Objects;

public class Inches implements ConvertableToInches {
  public final double value;

  public Inches(double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ConvertableToInches convertable) {
      return value == (convertable.convertToInches()).value;
    }
    if (!(o instanceof Inches inches)) return false;
    return Double.compare(value, inches.value) == 0;
  }
  @Override
  public Inches convertToInches() {
    return this;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
