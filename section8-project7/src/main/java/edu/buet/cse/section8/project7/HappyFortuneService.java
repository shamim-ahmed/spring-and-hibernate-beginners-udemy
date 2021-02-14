package edu.buet.cse.section8.project7;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Today is your lucky day!";
  }
}
