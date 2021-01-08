package edu.buet.cse.section7.project2;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }
}
