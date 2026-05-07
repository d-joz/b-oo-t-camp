package com.tw.bootcamp.p2;

public class Probability {
  private final Coin coin;

  public Probability(Coin coin) {
    this.coin = coin;
  }

  public double getFace() {
    return coin.getProbability();
  }

  public double notGettingAFace() {
    return 1 - coin.getProbability();
  }

  public double gettingAFaceFrom(int count) {
    double notGettingTails = Math.pow(notGettingAFace() , count);

    return 1 - notGettingTails;
  }

}
