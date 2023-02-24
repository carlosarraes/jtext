package jtext.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CardTest {
  @Test
  void canGetValueOfACard() {
    Card card = new Card(Suit.CLUBS, Rank.TWO);
    assertEquals(2, card.getValue());
  }

  @Test
  void canGetValueOfAnotherCard() {
    Card card = new Card(Suit.DIAMONDS, Rank.TEN);
    assertEquals(10, card.getValue());
  }

  @Test
  void canGetValueOfAnAceCard() {
    Card card = new Card(Suit.HEARTS, Rank.ACE);
    assertEquals(1, card.getValue());
  }

  @Test
  void canGetValueOfAKingCard() {
    Card card = new Card(Suit.SPADES, Rank.KING);
    assertEquals(10, card.getValue());
  }

  @Test
  void canGetValueOfAJackCard() {
    Card card = new Card(Suit.SPADES, Rank.JACK);
    assertEquals(10, card.getValue());
  }
}
