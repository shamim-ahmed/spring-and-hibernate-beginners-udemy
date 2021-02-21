package edu.buet.cse.section10.project6;

public class WrestlingCoach implements Coach {

  private FortuneService fortuneService;

  public WrestlingCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practise your double leg takedown";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
