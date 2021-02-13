package edu.buet.cse.section8.project3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
  private FortuneService fortuneService;

  public TennisCoach() {
    System.out.println("Inside default constructor");
  }

  @Autowired
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("Inside setFortuneService method");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practise serving for 1 hour";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
