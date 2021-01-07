package edu.buet.cse.section5.project1;

public class TennisCoach implements Coach {
  private FortuneService fortuneService;

  public TennisCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
