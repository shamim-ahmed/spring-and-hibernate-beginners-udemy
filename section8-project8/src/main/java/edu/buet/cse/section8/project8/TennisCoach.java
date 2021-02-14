package edu.buet.cse.section8.project8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
  private FortuneService fortuneService;

  // note how the Qualifier annotation is used for the constructor argument
  @Autowired
  public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
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
