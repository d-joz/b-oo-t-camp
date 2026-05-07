package com.tw.bootcamp.p2;

public class Probability {
  private final Coin coin;

  public Probability(Coin coin) {
    this.coin = coin;
  }

  public double getFace() {
    return 1 / coin.getFaces();
  }

  public double notGettingAFace() {
    return 1- (1/coin.getFaces());
  }
}
