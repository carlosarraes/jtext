package jtext.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SuitTest {
  @Test
  void canGetSymbolOfSuit() {
    assertEquals("♥", Suit.CLUBS.toString());
  }

  @Test
  void canGetSymbolOfAnotherSuit() {
    assertEquals("♦", Suit.DIAMONDS.toString());
  }

  @Test
  void canGetSymbolOfYetAnotherSuit() {
    assertEquals("♣", Suit.HEARTS.toString());
  }

  @Test
  void canGetSymbolOfYetYetAnotherSuit() {
    assertEquals("♠", Suit.SPADES.toString());
  }
}
