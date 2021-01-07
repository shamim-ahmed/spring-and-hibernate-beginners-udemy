package edu.buet.cse.section5.project1;

public class HappyFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Today is your lucky day!";
  }
}
