package com.tw.bootcamp.p2;

public class Coin {
  private final double probability;

  public Coin(double tailProbability) {
    this.probability = tailProbability;
  }

  public static Coin create(double tailProbability) {
    return new Coin(tailProbability);
  }

  public double getProbability() {
    return probability;
  }
}
