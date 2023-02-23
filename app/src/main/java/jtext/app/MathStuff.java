package jtext.app;

public class MathStuff {

  /**
   * Calculates the area of a circle.
   *
   * @param radius the radius of the circle
   * @return the area of the circle
   */
  public static double calcAreaOfCircle(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

  public static double calcPathVelocity(double radius, double period) {
    double circumference = 2 * Math.PI * radius;
    return circumference / period;
  }
}
