package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
  private final double value;

  public Chance(double value) {
    this.value = value;
  }
  public Chance not() {
    return new Chance(1 - value);
  }

  public Chance and(Chance other) {
    return new Chance(this.value * other.value);
  }

  public Chance or(Chance other) {
    return this.not().and(other.not()).not();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Chance chance)) return false;
    return Double.compare(value, chance.value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
