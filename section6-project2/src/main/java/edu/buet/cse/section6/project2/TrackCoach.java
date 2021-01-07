package edu.buet.cse.section6.project2;

public class TrackCoach implements Coach {
  private FortuneService fortuneService;

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {
    return "Just do it: " + fortuneService.getFortune();
  }

  @SuppressWarnings("unused")
  private void doCustomInit() {
    System.out.println("Custom init steps are being executed...");
  }

  @SuppressWarnings("unused")
  private void doCustomDestroy() {
    System.out.println("Custom destroy steps are being executed...");
  }
}
