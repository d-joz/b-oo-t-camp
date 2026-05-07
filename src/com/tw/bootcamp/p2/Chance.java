package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
  private final double probability;

  public Chance(double probability) {
    this.probability = probability;
  }
  public Chance complement() {
    return new Chance(1 - probability);
  }

  public Chance intersection(Chance otherChance) {
    return new Chance(this.probability * otherChance.probability);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Chance chance)) return false;
    return Double.compare(probability, chance.probability) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(probability);
  }
}
