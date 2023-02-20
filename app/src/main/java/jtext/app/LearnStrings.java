package jtext.app;

public class LearnStrings {
  public static int compareTo(String text1, String text2) {
    String s1 = text1.toLowerCase().strip();
    String s2 = text2.toLowerCase().strip();
    return s1.compareTo(s2);
  }

  public static void extractPhone(String phone) {
    String s = phone.substring(1, 4);
    int exchange = phone.indexOf('-');
    System.out.format("Area Code '%s'\n", s);
    String substring = phone.substring(exchange - 3, exchange);
    System.out.format("Exchange '%s'\n", substring);
    String substring2 = phone.substring(exchange + 1);
    System.out.format("Line Number '%s'\n", substring2);
  }

  public static void main(String[] args) {
    String s = "Hello Mundo!";
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(compareTo("   Hello    ", "jello"));
    extractPhone("(123) 456-7890");
  }
}
