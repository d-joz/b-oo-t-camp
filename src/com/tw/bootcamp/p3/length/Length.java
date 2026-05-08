package com.tw.bootcamp.p3.length;

import java.util.Objects;

public abstract class Length implements ComparableByLength {
  public final double value;

  public Length(double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ComparableByLength comparable) {
      return compare(comparable);
    }
    return false;
  }

  @Override
  public abstract boolean compare(ComparableByLength other);

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
