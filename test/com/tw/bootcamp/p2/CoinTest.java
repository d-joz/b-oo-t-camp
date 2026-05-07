package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {

  @Test
  void shouldReturnFairChanceOfGettingTail() {
    Coin coin = new Coin();

    assertEquals(2, coin.getFaces());
  }

}