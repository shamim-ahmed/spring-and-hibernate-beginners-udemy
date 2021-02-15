package edu.buet.cse.section8.project10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
  @Autowired
  @Qualifier("fileFortuneService")
  private FortuneService fortuneService;

  @Override
  public String getDailyWorkout() {
    return "Practise serving for 1 hour";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
