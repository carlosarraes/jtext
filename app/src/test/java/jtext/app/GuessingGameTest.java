package jtext.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuessingGameTest {
  GuessingGame game;

  private void makeWrongGuesses(int n) {
    int randomNumber = game.getRandomNumber();
    for (int counter = 0; counter < n; counter++) {
      game.guess(randomNumber + counter + 1);
    }
  }

  @BeforeEach
  void setup() {
    game = new GuessingGame();
  }

  @Test
  public void testSimpleWin() {
    int randomNumber = game.getRandomNumber();
    String message = game.guess(randomNumber);
    int numberOfTries = game.getNumberOfTries();
    String expectedMessage = "You got it in " + (numberOfTries) + " try";
    assertEquals(expectedMessage, message);
  }

  @Test
  public void testWrongGuessNegative() {
    String message = game.guess(-5);
    assertEquals("You didn't get it - too low", message);
  }

  @Test
  public void testWrongGuessPositive() {
    int randomNumber = game.getRandomNumber();
    String message = game.guess(randomNumber + 1);
    assertEquals("You didn't get it - too high", message);
  }

  @Test
  public void testRandomNumberGeneration() {
    int[] randomNumCount = new int[10];
    for (int counter = 0; counter < 100; counter++) {
      GuessingGame game = new GuessingGame();
      int randomNumber = game.getRandomNumber();
      randomNumCount[randomNumber - 1] = 1;
    }

    int sum = 0;
    for (int counter = 0; counter < 10; counter++) {
      sum += randomNumCount[counter];
    }
    assertEquals(10, sum);
  }

  @Test
  public void testFourWrongGuesses() {
    int randomNumber = game.getRandomNumber();
    makeWrongGuesses(3);
    String message = game.guess(randomNumber + 4);
    assertEquals("You didn't get it and you had 4 tries. Game over.", message);
  }

  @Test
  public void testThreeWrongGuessesAndOneCorrect() {
    int randomNumber = game.getRandomNumber();
    makeWrongGuesses(3);
    String message = game.guess(randomNumber);
    int numberOfTries = game.getNumberOfTries();
    String expectedMessage = "You got it in " + (numberOfTries) + " tries";
    assertEquals(expectedMessage, message);
  }

  @Test
  public void testTwoWrongGuessesAndOneCorrect() {
    int randomNumber = game.getRandomNumber();
    makeWrongGuesses(2);
    String message = game.guess(randomNumber);
    int numberOfTries = game.getNumberOfTries();
    String expectedMessage = "You got it in " + (numberOfTries) + " tries";
    assertEquals(expectedMessage, message);
  }

  @Test
  public void testTenWrongGuesses() {
    int randomNumber = game.getRandomNumber();
    makeWrongGuesses(9);
    String message = game.guess(randomNumber);
    assertEquals("Sorry, you are limited to 4 tries, game over.", message);
  }
}
