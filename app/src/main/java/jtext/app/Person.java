package jtext.app;

public class Person {
  private String firstName;
  private String lastName;

  public Person(String name, String nameLast) {
    this.firstName = name.substring(0, 1).toUpperCase() + name.substring(1);
    this.lastName = nameLast.substring(0, 1).toUpperCase() + nameLast.substring(1);
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }
}
