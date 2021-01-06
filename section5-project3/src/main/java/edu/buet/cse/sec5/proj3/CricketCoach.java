package edu.buet.cse.sec5.proj3;

/**
 * Bean with an example of setter injection
 * 
 * @author shamim
 *
 */
public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for an hour";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService != null ? fortuneService.getFortune() : null;
  }
}
