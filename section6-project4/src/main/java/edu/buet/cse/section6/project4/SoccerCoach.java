package edu.buet.cse.section6.project4;

public class SoccerCoach implements Coach {

  private FortuneService fortuneService;

  public SoccerCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run 10 km in the morning";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
