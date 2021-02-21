package edu.buet.cse.section11.project3.mvc.model;

import java.util.Objects;

public class Book {
  
  private final String title;
  private final String author;
  
  public Book(String title, String author) {
    this.title = Objects.requireNonNull(title);
    this.author = Objects.requireNonNull(author);
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
}
