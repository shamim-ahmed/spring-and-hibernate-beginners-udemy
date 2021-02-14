package edu.buet.cse.section8.project7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
  // For the special case of when both the first and second characters of the class name are upper
  // case, then the name is NOT converted.
  @Autowired
  @Qualifier("RESTFortuneService")
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
