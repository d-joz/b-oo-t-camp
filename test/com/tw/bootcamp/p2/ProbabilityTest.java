package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

  @Test
  void shouldReturnProbability() {
    Coin coin = new Coin();
    Probability probability = new Probability(coin);

    assertEquals(0.5, probability.getFace());
  }

  @Test
  void shouldReturnProbabilityOfNotGettingAfaceOfaCoin() {
    Coin coin = new Coin();
    Probability probability = new Probability(coin);

    assertEquals(0.5, probability.notGettingAFace());
  }
}