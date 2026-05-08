package com.tw.bootcamp.p2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {

  @Test
  void shouldCreate() throws ImpossibleProbabilityException {
    Probability chanceOFGettingTails = Probability.create(0.5);

    assertEquals(Probability.create(0.5), chanceOFGettingTails);
  }

  @Test
  void shouldFailToCreateAChance()  {
    ImpossibleProbabilityException exception = assertThrows(ImpossibleProbabilityException.class, () -> Probability.create(5));
    assertEquals("Probability should be between 0 and 1",exception.getMessage());
  }

  @Test
  void shouldReturnProbabilityOfNotGettingTailsWhenACoinFlipped() throws ImpossibleProbabilityException {
    Probability chanceOfGettingTails = Probability.create(0.5);

    assertEquals(Probability.create(0.5), chanceOfGettingTails.not());
  }

  @Test
  void shouldComplimentTheChance6To4() throws ImpossibleProbabilityException {
    Probability probability = Probability.create(0.6);

    assertEquals(Probability.create(.4), probability.not());
  }

  @Test
  void shouldGetChanceOfGettingBothTailsWhen2CoinsFlipped() throws ImpossibleProbabilityException {
    Probability chanceOfGettingTails = Probability.create(0.5);

    assertEquals(Probability.create(0.25), chanceOfGettingTails.and(chanceOfGettingTails));
  }

  @Test
  @DisplayName("should get a 'chance of getting 3' in a dice roll")
  void shouldGetAChanceOfGetting3OnADiceRoll() throws ImpossibleProbabilityException {
    Probability chanceOfGetting3InDiceRoll = Probability.create(1 / 6d);

    assertEquals(Probability.create(1 / 6d), chanceOfGetting3InDiceRoll);
  }

  @Test
  void shouldGetAChanceOfGettingAtLeastOneTailWhenTwoDiceRoll() throws ImpossibleProbabilityException {
    Probability chanceOfGettingATail = Probability.create(0.5);

    assertEquals(Probability.create(0.75), chanceOfGettingATail.or(chanceOfGettingATail));
  }

}