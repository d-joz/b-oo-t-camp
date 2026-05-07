package com.tw.bootcamp.p2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

  @Test
  void shouldCreateChance() {
    Chance chanceOFGettingTails = new Chance(0.5);

    assertEquals(new Chance(0.5), chanceOFGettingTails);
  }

  @Test
  void shouldReturnProbabilityOfNotGettingTailsWhenACoinFlipped() {
    Chance chanceOfGettingTails = new Chance(0.5);

    assertEquals(new Chance(0.5), chanceOfGettingTails.not());
  }

  @Test
  void shouldComplimentTheChance6To4() {
    Chance chance = new Chance(0.6);

    assertEquals(new Chance(.4), chance.not());
  }

  @Test
  void shouldGetChanceOfGettingBothTailsWhen2CoinsFlipped() {
    Chance chanceOfGettingTails = new Chance(0.5);

    assertEquals(new Chance(0.25), chanceOfGettingTails.and(chanceOfGettingTails));
  }

  @Test
  @DisplayName("should get a 'chance of getting 3' in a dice roll")
  void shouldGetAChanceOfGetting3OnADiceRoll() {
    Chance chanceOfGetting3InDiceRoll = new Chance(1 / 6d);

    assertEquals(new Chance(1 / 6d), chanceOfGetting3InDiceRoll);
  }

  @Test
  void shouldGetAChanceOfGettingAtleastOneTailWhenTwoDiceRoll() {
    Chance chanceOfGettingATail = new Chance(0.5);

    assertEquals(new Chance(0.75), chanceOfGettingATail.or(chanceOfGettingATail));
  }

}