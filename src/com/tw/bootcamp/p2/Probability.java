package com.tw.bootcamp.p2;

import java.util.Objects;

public class Probability {
  private static final int MIN_PROBABILITY = 0;
  private static final int MAX_PROBABILITY = 1;
  private final double value;

  private Probability(double value) {
    this.value = value;
  }

  public static Probability create(double value) throws ImpossibleProbabilityException {
    if (value < MIN_PROBABILITY || value > MAX_PROBABILITY) {
      throw new ImpossibleProbabilityException();
    }
    return new Probability(value);
  }


  public Probability not()  {
    return createInternal(MAX_PROBABILITY - value);
  }

  private Probability createInternal(double value) {
    return new Probability(value);
  }

  public Probability and(Probability other)  {
    return createInternal(this.value * other.value);
  }

  public Probability orDeMorgan(Probability other)  {
    return this.not().and(other.not()).not();
  }
  public Probability or(Probability other){
    return createInternal(this.value + other.value - this.and(other).value);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Probability probability)) return false;
    return Double.compare(value, probability.value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
