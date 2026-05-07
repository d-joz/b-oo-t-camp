package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

  @Test
  void shouldReturnProbability() {
    Coin coin = Coin.create(0.5);
    Probability probability = new Probability(coin);

    assertEquals(0.5, probability.getFace());
  }

  @Test
  void shouldReturnProbabilityOfNotGettingAfaceOfaCoin() {
    Coin coin = Coin.create(0.5);
    Probability probability = new Probability(coin);

    assertEquals(0.5, probability.notGettingAFace());
  }

  @Test
  void shouldReturnAChanceOfGettingAfaceFrom2Coins() {
    Coin coin = Coin.create(0.5);
    Probability probability = new Probability(coin);

    assertEquals(0.75, probability.gettingAFaceFrom(2));
  }

  @Test
  void shouldReturnAChanceOfGettingAfaceFrom3Coins() {
    Coin coin = Coin.create(0.5);
    Probability probability = new Probability(coin);

    assertEquals(0.875, probability.gettingAFaceFrom(3));
  }
}