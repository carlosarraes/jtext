package jtext.app;

public class App {
  public static void main(String[] args) {
    Person person = new Person("joe", "smith");
    System.out.println(person.getFullName());
    String text = "Hello Cat!";
    System.out.println(Utility.replaceWords("Cat", "Dog", text));
    System.out.println(Utility.removeSpaces("   Hello    "));
    System.out.println(Utility.capitalizeLastLetter("            hello"));
    System.out.println(Utility.getBuildingNumber("12345 Big St., Alphabet City, CA 90210"));
    System.out.println(Utility.getStreetName("12345 Big St., Alphabet City, CA 90210"));
    System.out.println(Utility.getCity("12345 Big St., Alphabet City, CA 90210"));
    System.out.println(Utility.getState("12345 Big St., Alphabet City, CA 90210"));
    System.out.println(Utility.getZipCode("12345 Big St., Alphabet City, CA 90210"));
  }
}
