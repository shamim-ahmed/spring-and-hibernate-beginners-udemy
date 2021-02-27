package edu.buet.cse.section14.project3.mvc;

public class Student {

  private String firstName;
  private String lastName;
  private String country;

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

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[").append("firstName = ").append(firstName).append(", ").append("lastName = ")
        .append(lastName).append(", ").append("country = ").append(country).append("]");

    return builder.toString();
  }
}
