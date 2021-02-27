package edu.buet.cse.section14.project3.mvc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {

  private static final String[] COUNTRY_OPTIONS = {"Bangladesh", "Nepal", "Bhutan", "Sri Lanka"};

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

  public List<String> getCountryOptions() {
    return Collections.unmodifiableList(Arrays.asList(COUNTRY_OPTIONS));
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[").append("firstName = ").append(firstName).append(", ").append("lastName = ")
        .append(lastName).append(", ").append("country = ").append(country).append("]");

    return builder.toString();
  }
}
