package edu.buet.cse.section8.project3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
  private FortuneService fortuneService;

  @Autowired
  public void setFortuneService(FortuneService fortuneService) {
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
