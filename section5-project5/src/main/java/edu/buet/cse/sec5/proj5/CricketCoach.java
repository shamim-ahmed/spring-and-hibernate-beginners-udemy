package edu.buet.cse.sec5.proj5;

/**
 * Bean with an example of setter injection with literal values
 * 
 * @author shamim
 *
 */
public class CricketCoach implements Coach {

  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
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
