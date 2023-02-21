package jtext.app;

public class Utility {
  public static String replaceWords(String word1, String word2, String text) {
    return text.replace(word1, word2);
  }

  public static String removeSpaces(String text) {
    return text.strip();
  }

  public static String capitalizeLastLetter(String text) {
    String string =
        text.substring(0, text.length() - 1) + text.substring(text.length() - 1).toUpperCase();
    return string.strip();
  }

  public static int getBuildingNumber(String address) {
    int index = address.indexOf(' ');
    String substring = address.substring(0, index);
    return Integer.parseInt(substring);
  }

  public static String getStreetName(String address) {
    int index = address.indexOf(' ');
    String substring = address.substring(index + 1);
    int index2 = substring.indexOf(',');
    return substring.substring(0, index2);
  }

  public static String getCity(String address) {
    int index = address.indexOf(',');
    String substring = address.substring(index + 1);
    int index2 = substring.indexOf(',');
    return substring.substring(0, index2).strip();
  }

  public static String getState(String address) {
    int index = address.indexOf(',');
    String substring = address.substring(index + 1);
    int index2 = substring.indexOf(',');
    String substring2 = substring.substring(index2 + 1);
    return substring2.substring(1, 3).strip();
  }

  public static String getZipCode(String address) {
    int index = address.indexOf(',');
    String substring = address.substring(index + 1);
    int index2 = substring.indexOf(',');
    String substring2 = substring.substring(index2 + 1);
    return substring2.substring(4).strip();
  }
}
