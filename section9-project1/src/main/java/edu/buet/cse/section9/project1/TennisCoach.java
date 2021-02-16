package edu.buet.cse.section9.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
  @Autowired
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
