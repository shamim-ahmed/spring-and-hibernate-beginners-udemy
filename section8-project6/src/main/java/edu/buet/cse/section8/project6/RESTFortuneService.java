package edu.buet.cse.section8.project6;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "RESTful architecture is ideal for the World Wide Web";
  }
}
