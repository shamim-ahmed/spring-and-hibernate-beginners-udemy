package edu.buet.cse.section9.project5;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {
  @Autowired
  private FortuneService fortuneService;

  @Override
  public String getDailyWorkout() {
    return "Practise serving for 1 hour";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  @PostConstruct
  private void doCustomInit() {
    System.out.println("Running custom initialization steps...");
  }

  @Override
  public void destroy() {
    System.out.println("Running custom cleanup steps...");
  }
}
