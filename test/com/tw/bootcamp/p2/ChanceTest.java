package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void shouldCreateChance() {
    Chance chanceOFGettingTails = new Chance(0.5);

    assertEquals(new Chance(0.5), chanceOFGettingTails);
  }

  @Test
  void shouldReturnProbabilityOfNotGettingAfaceOfaCoin() {
    Chance chanceOfGettingTails = new Chance(0.5);

    assertEquals(new Chance(0.5), chanceOfGettingTails.complement());
  }

  @Test
  void shouldComplementChance6To4() {
    Chance chance = new Chance(0.6);
    assertEquals(new Chance(.4), chance.complement());
  }

  @Test
  void shouldGetChanceOfGettingBothTailsWhenFlipped2Coins() {
    Chance chanceOfGettingTails = new Chance(0.5);

    assertEquals(new Chance(0.25), chanceOfGettingTails.intersection(chanceOfGettingTails));
  }

}