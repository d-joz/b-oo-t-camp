package com.tw.bootcamp.p3.volume;

import java.util.Objects;

public abstract class Volume implements ComparableByVolume {
  public final double value;

  public Volume(double value) {
    this.value = value;
  }

  @Override
  public abstract boolean compare(ComparableByVolume other);

  @Override
  public boolean equals(Object o) {
    if (o instanceof ComparableByVolume comparable) {
      return compare(comparable);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
