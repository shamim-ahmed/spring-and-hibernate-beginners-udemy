package edu.buet.cse.section10.project3;

public class SwimCoach implements Coach {

  private FortuneService fortuneService;

  public SwimCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim for an hour";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
