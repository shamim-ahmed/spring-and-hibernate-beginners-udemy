package edu.buet.cse.section7.project3;

import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practise serving for 1 hour";
  }
}
