package edu.buet.cse.section8.project9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
  @Autowired
  @Qualifier("randomFortuneService")
  private FortuneService fortuneService;

  @Value("${foo.email}")
  private String email;

  @Value("${foo.team}")
  private String team;

  public String getEmail() {
    return email;
  }

  public String getTeam() {
    return team;
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
