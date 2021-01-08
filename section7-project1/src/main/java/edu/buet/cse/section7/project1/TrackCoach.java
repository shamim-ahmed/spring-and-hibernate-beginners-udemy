package edu.buet.cse.section7.project1;

import org.springframework.stereotype.Component;

@Component("trCoach")
public class TrackCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }
}
