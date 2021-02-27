package edu.buet.cse.section14.project1.mvc;

public class Student {

  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[").append("firstName = ").append(firstName).append(", ").append("lastName = ")
        .append(lastName).append("]");

    return builder.toString();
  }
}
