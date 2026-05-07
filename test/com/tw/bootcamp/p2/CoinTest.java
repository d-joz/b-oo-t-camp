package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {

  @Test
  void shouldReturnFairChanceOfGettingTail() {
    Coin coin = Coin.create(.5);

    assertEquals(0.5, coin.getProbability());
  }

}