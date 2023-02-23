package jtext.app;

import java.util.Random;

public class GuessingGame {
  private final int randomNumber = new Random().nextInt(10) + 1;
  private int numberOfTries = 0;

  public String guess(int guessedNumber) {
    if (numberOfTries > 4) return "Sorry, you are limited to 4 tries, game over.";
    if (guessedNumber == getRandomNumber()) {
      numberOfTries++;
      String format = numberOfTries == 1 ? "try" : "tries";
      return "You got it in " + numberOfTries + " " + format;
    }
    numberOfTries++;
    if (numberOfTries == 4)
      return String.format("You didn't get it and you had %d tries. Game over.", numberOfTries);

    String hint = guessedNumber > getRandomNumber() ? "too high" : "too low";
    return String.format("You didn't get it - %s", hint);
  }

  public int getRandomNumber() {
    return randomNumber;
  }

  public int getNumberOfTries() {
    return numberOfTries;
  }

  public static void main(String[] args) {
    GuessingGame game = new GuessingGame();
    while (game.getNumberOfTries() < 4) {
      String input = System.console().readLine("Guess a number between 1 and 10: ");
      String output = game.guess(Integer.parseInt(input));
      System.out.println(output);
      if (output.contains("got it")) break;
    }
  }
}
