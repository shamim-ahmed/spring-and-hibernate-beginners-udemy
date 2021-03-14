package edu.buet.cse.section16.project1.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

  private String firstName;

  @NotNull(message = "is required")
  @Size(min = 1)
  private String lastName;

  @Min(value = 0, message = "value must be greater than or equal to 0")
  @Max(value = 10, message = "value must be less than or equal to 10")
  private int freePasses;

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

  public int getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(int freePasses) {
    this.freePasses = freePasses;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ firstName = " + firstName + ", lastName = " + lastName + ", freePasses = "
        + freePasses + " ]");
    return builder.toString();
  }
}
